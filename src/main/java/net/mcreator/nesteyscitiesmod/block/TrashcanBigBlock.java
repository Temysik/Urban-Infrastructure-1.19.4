
package net.mcreator.nesteyscitiesmod.block;

import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.Containers;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.nesteyscitiesmod.world.inventory.TrashcanBigGUIMenu;
import net.mcreator.nesteyscitiesmod.block.entity.TrashcanBigBlockEntity;

import io.netty.buffer.Unpooled;

public class TrashcanBigBlock extends Block implements EntityBlock {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public TrashcanBigBlock() {
		super(BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.METAL).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(0, 0, 13.9, 2, 2, 15.9), box(0, 0, -0.1, 2, 2, 1.9), box(14, 0, -0.1, 16, 2, 1.9), box(14, 0, 13.9, 16, 2, 15.9), box(-1, 2, -1, 17, 3, 17), box(0, 3, 16, 16, 18, 17), box(16, 3, 0, 17, 18, 17),
					box(-1, 3, 0, 0, 18, 17), box(-1, 3, -1, 17, 18, 0), box(-2, 15, 7, -1, 18, 10), box(17, 15, 7, 18, 18, 10), box(18, 16, 8, 19, 17, 9), box(-3, 16, 8, -2, 17, 9));
			case NORTH -> Shapes.or(box(14, 0, 0.1, 16, 2, 2.1), box(14, 0, 14.1, 16, 2, 16.1), box(0, 0, 14.1, 2, 2, 16.1), box(0, 0, 0.1, 2, 2, 2.1), box(-1, 2, -1, 17, 3, 17), box(0, 3, -1, 16, 18, 0), box(-1, 3, -1, 0, 18, 16),
					box(16, 3, -1, 17, 18, 16), box(-1, 3, 16, 17, 18, 17), box(17, 15, 6, 18, 18, 9), box(-2, 15, 6, -1, 18, 9), box(-3, 16, 7, -2, 17, 8), box(18, 16, 7, 19, 17, 8));
			case EAST -> Shapes.or(box(13.9, 0, 14, 15.9, 2, 16), box(-0.1, 0, 14, 1.9, 2, 16), box(-0.1, 0, 0, 1.9, 2, 2), box(13.9, 0, 0, 15.9, 2, 2), box(-1, 2, -1, 17, 3, 17), box(16, 3, 0, 17, 18, 16), box(0, 3, -1, 17, 18, 0),
					box(0, 3, 16, 17, 18, 17), box(-1, 3, -1, 0, 18, 17), box(7, 15, 17, 10, 18, 18), box(7, 15, -2, 10, 18, -1), box(8, 16, -3, 9, 17, -2), box(8, 16, 18, 9, 17, 19));
			case WEST -> Shapes.or(box(0.1, 0, 0, 2.1, 2, 2), box(14.1, 0, 0, 16.1, 2, 2), box(14.1, 0, 14, 16.1, 2, 16), box(0.1, 0, 14, 2.1, 2, 16), box(-1, 2, -1, 17, 3, 17), box(-1, 3, 0, 0, 18, 16), box(-1, 3, 16, 16, 18, 17),
					box(-1, 3, -1, 16, 18, 0), box(16, 3, -1, 17, 18, 17), box(6, 15, -2, 9, 18, -1), box(6, 15, 17, 9, 18, 18), box(7, 16, 18, 8, 17, 19), box(7, 16, -3, 8, 17, -2));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public InteractionResult use(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
		super.use(blockstate, world, pos, entity, hand, hit);
		if (entity instanceof ServerPlayer player) {
			NetworkHooks.openScreen(player, new MenuProvider() {
				@Override
				public Component getDisplayName() {
					return Component.literal("Trash can Big");
				}

				@Override
				public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
					return new TrashcanBigGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(pos));
				}
			}, pos);
		}
		return InteractionResult.SUCCESS;
	}

	@Override
	public MenuProvider getMenuProvider(BlockState state, Level worldIn, BlockPos pos) {
		BlockEntity tileEntity = worldIn.getBlockEntity(pos);
		return tileEntity instanceof MenuProvider menuProvider ? menuProvider : null;
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new TrashcanBigBlockEntity(pos, state);
	}

	@Override
	public boolean triggerEvent(BlockState state, Level world, BlockPos pos, int eventID, int eventParam) {
		super.triggerEvent(state, world, pos, eventID, eventParam);
		BlockEntity blockEntity = world.getBlockEntity(pos);
		return blockEntity == null ? false : blockEntity.triggerEvent(eventID, eventParam);
	}

	@Override
	public void onRemove(BlockState state, Level world, BlockPos pos, BlockState newState, boolean isMoving) {
		if (state.getBlock() != newState.getBlock()) {
			BlockEntity blockEntity = world.getBlockEntity(pos);
			if (blockEntity instanceof TrashcanBigBlockEntity be) {
				Containers.dropContents(world, pos, be);
				world.updateNeighbourForOutputSignal(pos, this);
			}
			super.onRemove(state, world, pos, newState, isMoving);
		}
	}

	@Override
	public boolean hasAnalogOutputSignal(BlockState state) {
		return true;
	}

	@Override
	public int getAnalogOutputSignal(BlockState blockState, Level world, BlockPos pos) {
		BlockEntity tileentity = world.getBlockEntity(pos);
		if (tileentity instanceof TrashcanBigBlockEntity be)
			return AbstractContainerMenu.getRedstoneSignalFromContainer(be);
		else
			return 0;
	}
}
