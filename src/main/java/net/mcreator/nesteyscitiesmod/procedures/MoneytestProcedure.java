package net.mcreator.nesteyscitiesmod.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.nesteyscitiesmod.network.UiModVariables;

public class MoneytestProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return (entity.getCapability(UiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new UiModVariables.PlayerVariables())).Money + "\u20BD";
	}
}
