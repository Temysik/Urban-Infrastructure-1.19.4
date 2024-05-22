
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

import net.mcreator.nesteyscitiesmod.world.inventory.StorageBosGUIMenu;
import net.mcreator.nesteyscitiesmod.block.entity.StorageboxBlockEntity;

import io.netty.buffer.Unpooled;

public class StorageboxBlock extends Block implements EntityBlock {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public StorageboxBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.METAL).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
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
			default -> Shapes.or(box(1, 0, 0, 14, 1, 16), box(1, 16, 0, 14, 17, 16), box(13, 1, 0, 14, 16, 16), box(1, 1, 0, 2, 16, 16), box(2, 1, 0, 13, 16, 1), box(2, 1, 15, 13, 3, 16), box(6, 3, 15, 13, 4, 16), box(6, 5, 15, 13, 6, 16),
					box(6, 7, 15, 13, 8, 16), box(6, 9, 15, 13, 10, 16), box(6, 11, 15, 13, 12, 16), box(2, 15, 15, 13, 16, 16), box(2, 13, 15, 13, 15, 16), box(11, 4, 15, 12, 13, 16), box(9, 4, 15, 10, 13, 16), box(7, 4, 15, 8, 13, 16),
					box(5, 3, 15, 6, 13, 16), box(3, 3, 15, 4, 13, 16), box(2, 3, 15, 3, 13, 16), box(4, 3, 15, 5, 13, 16));
			case NORTH -> Shapes.or(box(2, 0, 0, 15, 1, 16), box(2, 16, 0, 15, 17, 16), box(2, 1, 0, 3, 16, 16), box(14, 1, 0, 15, 16, 16), box(3, 1, 15, 14, 16, 16), box(3, 1, 0, 14, 3, 1), box(3, 3, 0, 10, 4, 1), box(3, 5, 0, 10, 6, 1),
					box(3, 7, 0, 10, 8, 1), box(3, 9, 0, 10, 10, 1), box(3, 11, 0, 10, 12, 1), box(3, 15, 0, 14, 16, 1), box(3, 13, 0, 14, 15, 1), box(4, 4, 0, 5, 13, 1), box(6, 4, 0, 7, 13, 1), box(8, 4, 0, 9, 13, 1), box(10, 3, 0, 11, 13, 1),
					box(12, 3, 0, 13, 13, 1), box(13, 3, 0, 14, 13, 1), box(11, 3, 0, 12, 13, 1));
			case EAST -> Shapes.or(box(0, 0, 2, 16, 1, 15), box(0, 16, 2, 16, 17, 15), box(0, 1, 2, 16, 16, 3), box(0, 1, 14, 16, 16, 15), box(0, 1, 3, 1, 16, 14), box(15, 1, 3, 16, 3, 14), box(15, 3, 3, 16, 4, 10), box(15, 5, 3, 16, 6, 10),
					box(15, 7, 3, 16, 8, 10), box(15, 9, 3, 16, 10, 10), box(15, 11, 3, 16, 12, 10), box(15, 15, 3, 16, 16, 14), box(15, 13, 3, 16, 15, 14), box(15, 4, 4, 16, 13, 5), box(15, 4, 6, 16, 13, 7), box(15, 4, 8, 16, 13, 9),
					box(15, 3, 10, 16, 13, 11), box(15, 3, 12, 16, 13, 13), box(15, 3, 13, 16, 13, 14), box(15, 3, 11, 16, 13, 12));
			case WEST -> Shapes.or(box(0, 0, 1, 16, 1, 14), box(0, 16, 1, 16, 17, 14), box(0, 1, 13, 16, 16, 14), box(0, 1, 1, 16, 16, 2), box(15, 1, 2, 16, 16, 13), box(0, 1, 2, 1, 3, 13), box(0, 3, 6, 1, 4, 13), box(0, 5, 6, 1, 6, 13),
					box(0, 7, 6, 1, 8, 13), box(0, 9, 6, 1, 10, 13), box(0, 11, 6, 1, 12, 13), box(0, 15, 2, 1, 16, 13), box(0, 13, 2, 1, 15, 13), box(0, 4, 11, 1, 13, 12), box(0, 4, 9, 1, 13, 10), box(0, 4, 7, 1, 13, 8), box(0, 3, 5, 1, 13, 6),
					box(0, 3, 3, 1, 13, 4), box(0, 3, 2, 1, 13, 3), box(0, 3, 4, 1, 13, 5));
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
					return Component.literal("Storage box");
				}

				@Override
				public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
					return new StorageBosGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(pos));
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
		return new StorageboxBlockEntity(pos, state);
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
			if (blockEntity instanceof StorageboxBlockEntity be) {
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
		if (tileentity instanceof StorageboxBlockEntity be)
			return AbstractContainerMenu.getRedstoneSignalFromContainer(be);
		else
			return 0;
	}
}
