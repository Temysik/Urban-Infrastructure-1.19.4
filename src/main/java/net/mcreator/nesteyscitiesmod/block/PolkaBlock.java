
package net.mcreator.nesteyscitiesmod.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class PolkaBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public PolkaBlock() {
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
			default -> Shapes.or(box(-16, 4, -10, 32, 6, 16), box(-16, 3.17157, 14, 32, 5.17157, 18), box(30, 0, -10, 32, 2, -4), box(30, 2, -10, 32, 4, 4), box(-16, 0, -10, -14, 2, -4), box(-16, 2, -10, -14, 4, 4));
			case NORTH -> Shapes.or(box(-16, 4, 0, 32, 6, 26), box(-16, 3.17157, -2, 32, 5.17157, 2), box(-16, 0, 20, -14, 2, 26), box(-16, 2, 12, -14, 4, 26), box(30, 0, 20, 32, 2, 26), box(30, 2, 12, 32, 4, 26));
			case EAST -> Shapes.or(box(-10, 4, -16, 16, 6, 32), box(14, 3.17157, -16, 18, 5.17157, 32), box(-10, 0, -16, -4, 2, -14), box(-10, 2, -16, 4, 4, -14), box(-10, 0, 30, -4, 2, 32), box(-10, 2, 30, 4, 4, 32));
			case WEST -> Shapes.or(box(0, 4, -16, 26, 6, 32), box(-2, 3.17157, -16, 2, 5.17157, 32), box(20, 0, 30, 26, 2, 32), box(12, 2, 30, 26, 4, 32), box(20, 0, -16, 26, 2, -14), box(12, 2, -16, 26, 4, -14));
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
}
