package net.mcreator.nesteyscitiesmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.nesteyscitiesmod.init.UiModEntities;
import net.mcreator.nesteyscitiesmod.entity.BenchMobEntity;

public class LoftBenchPriRazmieshchieniiSushchnostiuProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = new BenchMobEntity(UiModEntities.BENCH_MOB.get(), _level);
			entityToSpawn.moveTo((x + 0.5), y, (z + 0.5), 0, 0);
			entityToSpawn.setYBodyRot(0);
			entityToSpawn.setYHeadRot(0);
			if (entityToSpawn instanceof Mob _mobToSpawn)
				_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
			_level.addFreshEntity(entityToSpawn);
		}
	}
}
