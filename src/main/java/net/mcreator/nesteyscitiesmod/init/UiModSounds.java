
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nesteyscitiesmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.nesteyscitiesmod.UiMod;

public class UiModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, UiMod.MODID);
	public static final RegistryObject<SoundEvent> CHERTOGA_SAMARA_OTPRAVLAYETCA_ON_2_PYT = REGISTRY.register("chertoga_samara_otpravlayetca_on_2_pyt",
			() -> SoundEvent.createVariableRangeEvent(new ResourceLocation("ui", "chertoga_samara_otpravlayetca_on_2_pyt")));
	public static final RegistryObject<SoundEvent> CHERTOGA_SAMARA_PRIBIVAET_ON_2_PYT = REGISTRY.register("chertoga_samara_pribivaet_on_2_pyt",
			() -> SoundEvent.createVariableRangeEvent(new ResourceLocation("ui", "chertoga_samara_pribivaet_on_2_pyt")));
	public static final RegistryObject<SoundEvent> KIROV_SARATOV_OTPRAV_2_PYT = REGISTRY.register("kirov_saratov_otprav_2_pyt", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("ui", "kirov_saratov_otprav_2_pyt")));
	public static final RegistryObject<SoundEvent> KIROV_SARATOV_PRIB_2_PYT = REGISTRY.register("kirov_saratov_prib_2_pyt", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("ui", "kirov_saratov_prib_2_pyt")));
	public static final RegistryObject<SoundEvent> MOSCOW_TOLLIATI_OTPRAV_PERVIY_PYT = REGISTRY.register("moscow-tolliati-otprav-perviy-pyt", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("ui", "moscow-tolliati-otprav-perviy-pyt")));
	public static final RegistryObject<SoundEvent> MOSCOW_TOLLIATI_PRIB_1_PYT = REGISTRY.register("moscow-tolliati-prib-1-pyt", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("ui", "moscow-tolliati-prib-1-pyt")));
	public static final RegistryObject<SoundEvent> ORENBURG_MOSCOW_PRIB_NA_VTOR_PYT = REGISTRY.register("orenburg-moscow-prib-na-vtor-pyt", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("ui", "orenburg-moscow-prib-na-vtor-pyt")));
	public static final RegistryObject<SoundEvent> ORENBURG_MOSCOW_PRIB_NA_VTOR_PYT_CHERES_30_MIN = REGISTRY.register("orenburg-moscow-prib-na-vtor-pyt-cheres-30-min",
			() -> SoundEvent.createVariableRangeEvent(new ResourceLocation("ui", "orenburg-moscow-prib-na-vtor-pyt-cheres-30-min")));
	public static final RegistryObject<SoundEvent> SATATOV_CHELAB_OTPRAV_CHETV_PYT = REGISTRY.register("satatov-chelab-otprav-chetv-pyt", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("ui", "satatov-chelab-otprav-chetv-pyt")));
	public static final RegistryObject<SoundEvent> STREET_SOUND = REGISTRY.register("street_sound", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("ui", "street_sound")));
}
