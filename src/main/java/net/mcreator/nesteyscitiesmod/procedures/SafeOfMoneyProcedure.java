package net.mcreator.nesteyscitiesmod.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.nesteyscitiesmod.network.UiModVariables;

public class SafeOfMoneyProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = (entity.getCapability(UiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new UiModVariables.PlayerVariables())).Money + Mth.nextInt(RandomSource.create(), 1, 10);
			entity.getCapability(UiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Money = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
