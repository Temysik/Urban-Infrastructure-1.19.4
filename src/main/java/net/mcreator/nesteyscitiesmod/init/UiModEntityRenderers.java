
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nesteyscitiesmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.nesteyscitiesmod.client.renderer.OstanovkaMobRenderer;
import net.mcreator.nesteyscitiesmod.client.renderer.BenchMobRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class UiModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(UiModEntities.OSTANOVKA_MOB.get(), OstanovkaMobRenderer::new);
		event.registerEntityRenderer(UiModEntities.BENCH_MOB.get(), BenchMobRenderer::new);
	}
}
