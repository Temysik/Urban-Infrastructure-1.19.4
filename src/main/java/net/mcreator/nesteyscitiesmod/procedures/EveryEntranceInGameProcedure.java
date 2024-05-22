package net.mcreator.nesteyscitiesmod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.network.chat.Component;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class EveryEntranceInGameProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity().level);
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("[UI] \u0414\u043E\u0431\u0440\u043E \u043F\u043E\u0436\u0430\u043B\u043E\u0432\u0430\u0442\u044C \u0432 \u00A7e Urban Infrastructure!"), false);
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(
					"[UI] \u0414\u043B\u044F \u0438\u0441\u043F\u043E\u043B\u044C\u0437\u043E\u0432\u0430\u043D\u0438\u044F \u0438\u043D\u0444\u043E\u0440\u043C\u0430\u0442\u043E\u0440\u043E\u0432 \u043D\u0430 \u0432\u043E\u043A\u0437\u0430\u043B\u0435 \u0441\u043B\u0435\u0434\u0443\u0435\u0442 \u0441\u043A\u0430\u0447\u0430\u0442\u044C \u0440\u0435\u0441\u0443\u0440\u0441\u043F\u0430\u043A : \u043F\u0430\u0443\u0437\u0430 - \u0441\u0442\u0440\u0430\u043D\u0438\u0446\u0430 \u0441\u043E \u0432\u0441\u0435\u043C\u0438 \u043C\u043E\u0434\u0430\u043C\u0438 - urban infrastructure - \u0438\u043D\u0444\u043E\u0440\u043C\u0430\u0442\u043E\u0440\u044B"),
					false);
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("[UI] \u041D\u0430\u0448 \u0442\u0433-\u0447\u0430\u0442: t.me/urban_infrastructure"), false);
	}
}
