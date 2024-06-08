
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nesteyscitiesmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class UiModTabs {
	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("ui", "cities_infrastructure"),
				builder -> builder.title(Component.translatable("item_group.ui.cities_infrastructure")).icon(() -> new ItemStack(UiModBlocks.OSTANOVKA_1.get())).displayItems((parameters, tabData) -> {
					tabData.accept(UiModBlocks.ZABOR_1.get().asItem());
					tabData.accept(UiModBlocks.ZABOR_2.get().asItem());
					tabData.accept(UiModBlocks.OSTANOVKA_1.get().asItem());
					tabData.accept(UiModBlocks.LOFT_TRASH.get().asItem());
					tabData.accept(UiModBlocks.LOFT_BENCH.get().asItem());
					tabData.accept(UiModBlocks.ZABOR_3.get().asItem());
					tabData.accept(UiModBlocks.OZON_1.get().asItem());
					tabData.accept(UiModBlocks.OZON_2.get().asItem());
					tabData.accept(UiModBlocks.OZON_3.get().asItem());
					tabData.accept(UiModBlocks.MAGNIT_1.get().asItem());
					tabData.accept(UiModBlocks.MAGNIT_2.get().asItem());
					tabData.accept(UiModBlocks.MAGNIT_3.get().asItem());
					tabData.accept(UiModBlocks.MAGNIT_4.get().asItem());
					tabData.accept(UiModBlocks.APTEKA_1.get().asItem());
					tabData.accept(UiModBlocks.APTEKA_2.get().asItem());
					tabData.accept(UiModBlocks.APTEKA_3.get().asItem());
					tabData.accept(UiModBlocks.BETON_ZABOR_1.get().asItem());
					tabData.accept(UiModBlocks.BANKOMAT.get().asItem());
					tabData.accept(UiModBlocks.CONDITIONER.get().asItem());
					tabData.accept(UiModBlocks.ELECTRIC_SHIELD_ON_STREET.get().asItem());
					tabData.accept(UiModBlocks.CASSA_COMPUTER.get().asItem());
					tabData.accept(UiModBlocks.MAILBOX.get().asItem());
					tabData.accept(UiModBlocks.POLKA.get().asItem());
					tabData.accept(UiModBlocks.STORAGEBOX.get().asItem());
					tabData.accept(UiModBlocks.BUOY.get().asItem());
					tabData.accept(UiModBlocks.HATCH.get().asItem());
					tabData.accept(UiModBlocks.CURB.get().asItem());
					tabData.accept(UiModBlocks.POSTAMAT_OZON.get().asItem());
					tabData.accept(UiModBlocks.SIGNMETRO.get().asItem());
					tabData.accept(UiModBlocks.TRASHCAN_BIG.get().asItem());
					tabData.accept(UiModBlocks.TRASH_CAN_STREET.get().asItem());
					tabData.accept(UiModBlocks.INTERCOMDOMRU.get().asItem());
					tabData.accept(UiModBlocks.ELECTRIC_SHIELD_ON_STOLB.get().asItem());
					tabData.accept(UiModBlocks.WINDOW.get().asItem());
					tabData.accept(UiModBlocks.VELO_PARKING.get().asItem());
					tabData.accept(UiModBlocks.WALKEN_ZEBRA.get().asItem());
					tabData.accept(UiModBlocks.TRASH.get().asItem());
					tabData.accept(UiModBlocks.CUP.get().asItem());
					tabData.accept(UiModBlocks.RADIATOR_2.get().asItem());
					tabData.accept(UiModBlocks.LAPTOP.get().asItem());
				})

		);
		event.registerCreativeModeTab(new ResourceLocation("ui", "items"), builder -> builder.title(Component.translatable("item_group.ui.items")).icon(() -> new ItemStack(Items.STICK)).displayItems((parameters, tabData) -> {
			tabData.accept(UiModItems.SMARTPHONE.get());
			tabData.accept(UiModBlocks.BOTTLE_777.get().asItem());
			tabData.accept(UiModItems.SCHEMA_ITEM.get());
			tabData.accept(UiModItems.CARD.get());
		})

		);
		event.registerCreativeModeTab(new ResourceLocation("ui", "roadmarking"),
				builder -> builder.title(Component.translatable("item_group.ui.roadmarking")).icon(() -> new ItemStack(UiModBlocks.MARK_12.get())).displayItems((parameters, tabData) -> {
					tabData.accept(UiModBlocks.MARK_1.get().asItem());
					tabData.accept(UiModBlocks.MARK_2.get().asItem());
					tabData.accept(UiModBlocks.MARK_3.get().asItem());
					tabData.accept(UiModBlocks.MARK_4.get().asItem());
					tabData.accept(UiModBlocks.MARK_5.get().asItem());
					tabData.accept(UiModBlocks.MARK_6.get().asItem());
					tabData.accept(UiModBlocks.MARK_7.get().asItem());
					tabData.accept(UiModBlocks.MARK_8.get().asItem());
					tabData.accept(UiModBlocks.MARK_9.get().asItem());
					tabData.accept(UiModBlocks.MARK_10.get().asItem());
					tabData.accept(UiModBlocks.MARK_11.get().asItem());
					tabData.accept(UiModBlocks.MARK_12.get().asItem());
					tabData.accept(UiModBlocks.MARK_13.get().asItem());
					tabData.accept(UiModBlocks.MARK_14.get().asItem());
					tabData.accept(UiModBlocks.MARK_15.get().asItem());
					tabData.accept(UiModBlocks.MARK_16.get().asItem());
					tabData.accept(UiModBlocks.MARK_17.get().asItem());
					tabData.accept(UiModBlocks.MARK_18.get().asItem());
					tabData.accept(UiModBlocks.MARK_20.get().asItem());
					tabData.accept(UiModBlocks.MARK_19.get().asItem());
					tabData.accept(UiModBlocks.MARK_21.get().asItem());
					tabData.accept(UiModBlocks.MARK_22.get().asItem());
					tabData.accept(UiModBlocks.MARK_23.get().asItem());
					tabData.accept(UiModBlocks.MARK_24.get().asItem());
					tabData.accept(UiModBlocks.MARK_25.get().asItem());
					tabData.accept(UiModBlocks.MARK_26.get().asItem());
					tabData.accept(UiModBlocks.MARK_27.get().asItem());
					tabData.accept(UiModBlocks.MARK_28.get().asItem());
					tabData.accept(UiModBlocks.TEMPORARYMARK_1.get().asItem());
					tabData.accept(UiModBlocks.TEMPORARYMARK_2.get().asItem());
					tabData.accept(UiModBlocks.TEMPORARYMARK_3.get().asItem());
					tabData.accept(UiModBlocks.TEMPORARYMARK_4.get().asItem());
					tabData.accept(UiModBlocks.TEMPORARYMARK_5.get().asItem());
					tabData.accept(UiModBlocks.TEMPORARYMARK_6.get().asItem());
					tabData.accept(UiModBlocks.TEMPORARYMARK_7.get().asItem());
					tabData.accept(UiModBlocks.TEMPORARYMARK_8.get().asItem());
					tabData.accept(UiModBlocks.TEMPORARYMARK_9.get().asItem());
					tabData.accept(UiModBlocks.TEMPORARYMARK_10.get().asItem());
					tabData.accept(UiModBlocks.TEMPORARYMARK_11.get().asItem());
					tabData.accept(UiModBlocks.TEMPORARYMARK_12.get().asItem());
					tabData.accept(UiModBlocks.TEMPORARYMARK_13.get().asItem());
					tabData.accept(UiModBlocks.TEMPORARYMARK_14.get().asItem());
					tabData.accept(UiModBlocks.TEMPORARYMARK_15.get().asItem());
					tabData.accept(UiModBlocks.TEMPORARYMARK_16.get().asItem());
					tabData.accept(UiModBlocks.TEMPORARYMARK_17.get().asItem());
					tabData.accept(UiModBlocks.TEMPORARYMARK_18.get().asItem());
					tabData.accept(UiModBlocks.TEMPORARYMARK_19.get().asItem());
					tabData.accept(UiModBlocks.TEMPORARYMARK_20.get().asItem());
					tabData.accept(UiModBlocks.TEMPORARYMARK_21.get().asItem());
					tabData.accept(UiModBlocks.TEMPORARYMARK_22.get().asItem());
					tabData.accept(UiModBlocks.TEMPORARYMARK_23.get().asItem());
					tabData.accept(UiModBlocks.MARK_29.get().asItem());
					tabData.accept(UiModBlocks.MARK_30.get().asItem());
					tabData.accept(UiModBlocks.MARK_31.get().asItem());
					tabData.accept(UiModBlocks.MARK_32.get().asItem());
					tabData.accept(UiModBlocks.MARK_33.get().asItem());
				})

		);
		event.registerCreativeModeTab(new ResourceLocation("ui", "znaki"), builder -> builder.title(Component.translatable("item_group.ui.znaki")).icon(() -> new ItemStack(UiModBlocks.ZNAK_21.get())).displayItems((parameters, tabData) -> {
			tabData.accept(UiModBlocks.ZNAK_11.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_12.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_15.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_16.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_17.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_18.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_131.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_132.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_141.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_142.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_143.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_144.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_145.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_146.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_19.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_110.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_1111.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_1112.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_1121.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_1122.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_113.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_114.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_115.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_116.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_117.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_118.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_119.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_1201.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_1202.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_1203.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_121.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_122.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_123.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_124.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_126.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_127.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_128.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_129.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_130.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_131_ODIN.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_132_ODIN.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_19.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_1341.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_1342.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_1343.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_135_ODIN.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_21.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_22.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_231.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_232.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_233.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_234.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_236.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_237.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_24.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_25.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_26.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_31.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_32.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_33.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_34.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_35.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_36.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_37.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_38.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_39.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_310.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_3111.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_3112.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_3131.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_3132.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_3133.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_3134.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_3135.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_3136.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_3137.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_3141.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_3142.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_3143.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_315.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_316.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_3171.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_3172.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_3173.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_3181.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_3182.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_319.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_320.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_321.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_322.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_323.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_3241.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_3242.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_3243.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_3244.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_3245.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_3251.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_3252.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_3253.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_3254.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_3255.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_326.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_27.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_327.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_328.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_329.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_330.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_331.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_332.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_333.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_411.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_412.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_413.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_414.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_415.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_416.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_421.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_422.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_423.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_43.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_441.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_442.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_451.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_452.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_453.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_454.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_455.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_456.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_457.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_461.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_462.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_463.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_464.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_465.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_471.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_472.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_473.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_474.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_475.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_481.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_482.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_483.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_51.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_52.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_53.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_54.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_55.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_56.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_571.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_572.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_58.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_59.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_510.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_5111.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_5112.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_5121.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_5122.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_5131.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_5132.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_5133.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_5134.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_5141.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_5142.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_5143.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_5144.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_5151.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_5152.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_5153.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_5154.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_5155.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_5156.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_5157.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_5158.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_5159.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_51510.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_51511.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_51512.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_51513.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_51514.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_51515.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_51516.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_51517.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_51518.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_51519.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_51520.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_51521.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_51522.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_51523.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_51524.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_51525.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_51526.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_51527.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_51528.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_51529.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_51530.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_51531.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_51532.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_51533.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_51534.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_51535.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_51536.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_51537.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_51538.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_51539.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_51540.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_51541.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_51542.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_51543.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_51544.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_516.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_517.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_518.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_5191.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_5192.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_5193.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_520.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_521.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_522.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_523.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_524.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_527.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_528.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_529.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_530.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_5311.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_5312.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_5321.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_5322.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_533.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_534.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_535.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_536.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_61.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_621.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_622.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_623.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_624.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_627.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_628.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_626.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_631.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_632.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_633.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_634.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_635.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_636.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_64.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_65.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_661.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_662.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_671.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_672.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_681.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_682.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_683.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_6151.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_6152.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_6153.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_616.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_71.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_72.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_73.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_74.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_75.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_76.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_77.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_78.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_79.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_710.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_711.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_712.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_713.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_714.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_715.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_716.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_717.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_718.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_719.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_720.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_721.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_7141.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_8111.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_8112.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_8113.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_8114.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_8115.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_8116.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_8117.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_8121.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_8122.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_8123.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_8131.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_8132.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_8133.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_8134.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_8135.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_8136.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_8137.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_8138.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_8139.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_81310.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_81311.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_81312.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_8211.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_8212.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_8213.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_8214.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_8215.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_8216.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_8217.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_8221.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_8222.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_8223.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_8224.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_8225.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_823.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_824.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_8251.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_8252.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_8253.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_8254.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_8255.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_8256.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_831.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_832.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_833.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_841.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_842.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_843.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_844.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_845.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_846.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_847.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_848.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_849.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_8410.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_8411.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_851.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_852.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_861.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_862.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_863.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_87.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_88.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_89.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_8101.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_8102.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_812.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_8131_ODIN.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_8132_ODIN.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_8133_ODIN.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_8134_ODIN.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_8135_ODIN.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_8136_ODIN.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_8137_ODIN.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_8138_ODIN.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_8139_ODIN.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_81310_ODIN.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_81311_ODIN.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_814.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_815.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_816.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_817.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_818.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_8211_ODIN.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_8212_ODIN.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_8213_ODIN.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_8221_ODIN.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_8222_ODIN.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_8223_ODIN.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_823_ODIN.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_824_ODIN.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_6172.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_6173.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_6171.get().asItem());
			tabData.accept(UiModBlocks.ZNAK_125.get().asItem());
			tabData.accept(UiModBlocks.TEMPORARY_1.get().asItem());
			tabData.accept(UiModBlocks.TEMPORARY_2.get().asItem());
			tabData.accept(UiModBlocks.TEMPORARY_3.get().asItem());
			tabData.accept(UiModBlocks.TEMPORARY_4.get().asItem());
			tabData.accept(UiModBlocks.TEMPORARY_5.get().asItem());
			tabData.accept(UiModBlocks.TEMPORARY_6.get().asItem());
			tabData.accept(UiModBlocks.TEMPORARY_7.get().asItem());
			tabData.accept(UiModBlocks.TEMPORARY_8.get().asItem());
			tabData.accept(UiModBlocks.TEMPORARY_9.get().asItem());
			tabData.accept(UiModBlocks.TEMPORARY_10.get().asItem());
			tabData.accept(UiModBlocks.TEMPORARY_11.get().asItem());
			tabData.accept(UiModBlocks.TEMPORARY_12.get().asItem());
			tabData.accept(UiModBlocks.TEMPORARY_13.get().asItem());
			tabData.accept(UiModBlocks.TEMPORARY_14.get().asItem());
			tabData.accept(UiModBlocks.TEMPORARY_15.get().asItem());
			tabData.accept(UiModBlocks.TEMPORARY_16.get().asItem());
			tabData.accept(UiModBlocks.TEMPORARY_17.get().asItem());
			tabData.accept(UiModBlocks.TEMPORARY_18.get().asItem());
			tabData.accept(UiModBlocks.TEMPORARY_19.get().asItem());
			tabData.accept(UiModBlocks.TEMPORARY_20.get().asItem());
			tabData.accept(UiModBlocks.TEMPORARY_21.get().asItem());
			tabData.accept(UiModBlocks.TEMPORARY_22.get().asItem());
			tabData.accept(UiModBlocks.TEMPORARY_23.get().asItem());
			tabData.accept(UiModBlocks.TEMPORARY_24.get().asItem());
			tabData.accept(UiModBlocks.TEMPORARY_25.get().asItem());
			tabData.accept(UiModBlocks.TEMPORARY_26.get().asItem());
			tabData.accept(UiModBlocks.TEMPORARY_27.get().asItem());
			tabData.accept(UiModBlocks.TEMPORARY_28.get().asItem());
			tabData.accept(UiModBlocks.TEMPORARY_29.get().asItem());
			tabData.accept(UiModBlocks.TEMPORARY_30.get().asItem());
			tabData.accept(UiModBlocks.TEMPORARY_31.get().asItem());
			tabData.accept(UiModBlocks.TEMPORARY_32.get().asItem());
			tabData.accept(UiModBlocks.TEMPORARY_33.get().asItem());
			tabData.accept(UiModBlocks.TEMPORARY_34.get().asItem());
			tabData.accept(UiModBlocks.TEMPORARY_36.get().asItem());
			tabData.accept(UiModBlocks.TEMPORARY_37.get().asItem());
			tabData.accept(UiModBlocks.TEMPORARY_38.get().asItem());
			tabData.accept(UiModBlocks.TEMPORARY_39.get().asItem());
			tabData.accept(UiModBlocks.TEMPORARY_40.get().asItem());
			tabData.accept(UiModBlocks.TEMPORARY_41.get().asItem());
			tabData.accept(UiModBlocks.TEMPORARY_42.get().asItem());
			tabData.accept(UiModBlocks.TEMPORARY_43.get().asItem());
			tabData.accept(UiModBlocks.TEMPORARY_44.get().asItem());
			tabData.accept(UiModBlocks.TEMPORARY_45.get().asItem());
			tabData.accept(UiModBlocks.TEMPORARY_46.get().asItem());
			tabData.accept(UiModBlocks.TEMPORARY_47.get().asItem());
			tabData.accept(UiModBlocks.TEMPORARY_48.get().asItem());
			tabData.accept(UiModItems.MONEY.get());
		}).withSearchBar());
		event.registerCreativeModeTab(new ResourceLocation("ui", "road_infrastructure"),
				builder -> builder.title(Component.translatable("item_group.ui.road_infrastructure")).icon(() -> new ItemStack(UiModBlocks.SVETOFOR_19.get())).displayItems((parameters, tabData) -> {
					tabData.accept(UiModBlocks.STOLB_2.get().asItem());
					tabData.accept(UiModBlocks.STOLB_3.get().asItem());
					tabData.accept(UiModBlocks.STOLB_4.get().asItem());
					tabData.accept(UiModBlocks.STOLB_5.get().asItem());
					tabData.accept(UiModBlocks.STOLB_6.get().asItem());
					tabData.accept(UiModBlocks.STOLB_9.get().asItem());
					tabData.accept(UiModBlocks.STOLB_7.get().asItem());
					tabData.accept(UiModBlocks.STOLB_8.get().asItem());
					tabData.accept(UiModBlocks.SVETOFOR_1.get().asItem());
					tabData.accept(UiModBlocks.SVETOFOR_2.get().asItem());
					tabData.accept(UiModBlocks.SVETOFOR_3.get().asItem());
					tabData.accept(UiModBlocks.SVETOFOR_5.get().asItem());
					tabData.accept(UiModBlocks.SVETOFOR_6.get().asItem());
					tabData.accept(UiModBlocks.SVETOFOR_10.get().asItem());
					tabData.accept(UiModBlocks.SVETOFOR_11.get().asItem());
					tabData.accept(UiModBlocks.SVETOFOR_12.get().asItem());
					tabData.accept(UiModBlocks.SVETOFOR_14.get().asItem());
					tabData.accept(UiModBlocks.SVETOFOR_15.get().asItem());
					tabData.accept(UiModBlocks.SVETOFOR_19.get().asItem());
					tabData.accept(UiModBlocks.SVETOFOR_20.get().asItem());
					tabData.accept(UiModBlocks.SVETOFOR_21.get().asItem());
					tabData.accept(UiModBlocks.SVETOFOR_23.get().asItem());
					tabData.accept(UiModBlocks.SVETOFOR_24.get().asItem());
					tabData.accept(UiModBlocks.OTB_1.get().asItem());
					tabData.accept(UiModBlocks.OTB_2.get().asItem());
					tabData.accept(UiModBlocks.POREBRIK_1.get().asItem());
					tabData.accept(UiModBlocks.POREBRIK_2.get().asItem());
					tabData.accept(UiModBlocks.POREBRIK_3.get().asItem());
					tabData.accept(UiModBlocks.STREETFENCE.get().asItem());
					tabData.accept(UiModBlocks.IRONFENCE.get().asItem());
					tabData.accept(UiModBlocks.STREET_FENCE_2.get().asItem());
					tabData.accept(UiModBlocks.KONUS_1.get().asItem());
					tabData.accept(UiModBlocks.POLE_PARKING.get().asItem());
					tabData.accept(UiModBlocks.WATER_FILLING_RED.get().asItem());
					tabData.accept(UiModBlocks.WATER_FILLING_BARRIERWHITE.get().asItem());
					tabData.accept(UiModBlocks.SPEEDBUMPSTART.get().asItem());
					tabData.accept(UiModBlocks.SPEED_BUMP.get().asItem());
					tabData.accept(UiModBlocks.OTB_TWOSIDE.get().asItem());
				})

		);
		event.registerCreativeModeTab(new ResourceLocation("ui", "transport_infrastructure"),
				builder -> builder.title(Component.translatable("item_group.ui.transport_infrastructure")).icon(() -> new ItemStack(Items.MINECART)).displayItems((parameters, tabData) -> {
					tabData.accept(UiModBlocks.EXITABLE_LIGHT.get().asItem());
					tabData.accept(UiModBlocks.EXITABLE_LIGHT_STOLB.get().asItem());
					tabData.accept(UiModBlocks.MANEVERLIGHT.get().asItem());
					tabData.accept(UiModBlocks.TV_STATION_SHOW_TRAIN.get().asItem());
					tabData.accept(UiModBlocks.STATION_SIGN.get().asItem());
					tabData.accept(UiModBlocks.RAILWAY_SHIELD.get().asItem());
					tabData.accept(UiModBlocks.MARKUPBEFOREWAYS.get().asItem());
					tabData.accept(UiModBlocks.TRAFFICLIGHT_TRAINS.get().asItem());
					tabData.accept(UiModBlocks.BALKA_1.get().asItem());
					tabData.accept(UiModBlocks.BALKA_2.get().asItem());
					tabData.accept(UiModBlocks.STOLB_4_OPORA.get().asItem());
					tabData.accept(UiModBlocks.STOLB_3_OPORA.get().asItem());
					tabData.accept(UiModBlocks.STOLB_1_OPORA.get().asItem());
					tabData.accept(UiModBlocks.SHIELD_TRAIN_FENCE.get().asItem());
				})

		);
	}
}
