package net.mcreator.nesteyscitiesmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.nesteyscitiesmod.init.UiModBlocks;

public class CloseToOpenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))) == UiModBlocks.RAILWAY_SHIELD_CLOSE.get().defaultBlockState()) {
			world.setBlock(BlockPos.containing(x, y, z), UiModBlocks.RAILWAY_SHIELD_OPEN.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))) == UiModBlocks.RAILWAY_SHIELD_OPEN.get().defaultBlockState()) {
			world.setBlock(BlockPos.containing(x, y, z), UiModBlocks.RAILWAY_SHIELD_CLOSE.get().defaultBlockState(), 3);
		}
	}
}
