package net.mcreator.nesteyscitiesmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.network.chat.Component;

public class NightTimeTrafficLightProcedure {
	public static void execute(LevelAccessor world) {
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(
					Component.literal("\u00A7e \u0421\u0432\u0435\u0442\u043E\u0444\u043E\u0440\u044B \u043F\u0435\u0440\u0435\u0432\u0435\u0434\u0435\u043D\u044B \u0432 \u043D\u043E\u0447\u043D\u043E\u0439 \u0440\u0435\u0436\u0438\u043C!"), false);
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(
					Component.literal("\u0414\u0430\u043D\u043D\u0430\u044F \u0444\u0443\u043D\u0446\u0438\u044F \u043D\u0430\u0445\u043E\u0434\u0438\u0442\u0441\u044F \u0432 \u0440\u0430\u0437\u0440\u0430\u0431\u043E\u0442\u043A\u0435"), false);
	}
}
