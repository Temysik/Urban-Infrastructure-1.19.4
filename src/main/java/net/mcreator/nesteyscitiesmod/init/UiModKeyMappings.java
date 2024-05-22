
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nesteyscitiesmod.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.nesteyscitiesmod.network.GiveGUIMessage;
import net.mcreator.nesteyscitiesmod.UiMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class UiModKeyMappings {
	public static final KeyMapping GIVE_GUI = new KeyMapping("key.ui.give_gui", GLFW.GLFW_KEY_H, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				UiMod.PACKET_HANDLER.sendToServer(new GiveGUIMessage(0, 0));
				GiveGUIMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(GIVE_GUI);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				GIVE_GUI.consumeClick();
			}
		}
	}
}
