
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nesteyscitiesmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.nesteyscitiesmod.entity.OstanovkaMobEntity;
import net.mcreator.nesteyscitiesmod.entity.BenchMobEntity;
import net.mcreator.nesteyscitiesmod.UiMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class UiModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, UiMod.MODID);
	public static final RegistryObject<EntityType<OstanovkaMobEntity>> OSTANOVKA_MOB = register("ostanovka_mob", EntityType.Builder.<OstanovkaMobEntity>of(OstanovkaMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(OstanovkaMobEntity::new).fireImmune().sized(0.5f, 1f));
	public static final RegistryObject<EntityType<BenchMobEntity>> BENCH_MOB = register("bench_mob",
			EntityType.Builder.<BenchMobEntity>of(BenchMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BenchMobEntity::new).fireImmune().sized(0f, 0.6f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			OstanovkaMobEntity.init();
			BenchMobEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(OSTANOVKA_MOB.get(), OstanovkaMobEntity.createAttributes().build());
		event.put(BENCH_MOB.get(), BenchMobEntity.createAttributes().build());
	}
}
