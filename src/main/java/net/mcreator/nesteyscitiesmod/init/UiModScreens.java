
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nesteyscitiesmod.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.nesteyscitiesmod.client.gui.TrashcanBigGUIScreen;
import net.mcreator.nesteyscitiesmod.client.gui.TrashCanStreetGUIScreen;
import net.mcreator.nesteyscitiesmod.client.gui.StorageBosGUIScreen;
import net.mcreator.nesteyscitiesmod.client.gui.SmartphoneSettingsGUIScreen;
import net.mcreator.nesteyscitiesmod.client.gui.SmartphoneHomapageGUIScreen;
import net.mcreator.nesteyscitiesmod.client.gui.SmartphoneContactsGUIScreen;
import net.mcreator.nesteyscitiesmod.client.gui.SchemTrainOporaScreen;
import net.mcreator.nesteyscitiesmod.client.gui.SchemMainMenuScreen;
import net.mcreator.nesteyscitiesmod.client.gui.OutputGazonScreen;
import net.mcreator.nesteyscitiesmod.client.gui.NumberGazonScreen;
import net.mcreator.nesteyscitiesmod.client.gui.MainMenuGazonScreen;
import net.mcreator.nesteyscitiesmod.client.gui.MailboxGUIScreen;
import net.mcreator.nesteyscitiesmod.client.gui.GUIMoneyScreen;
import net.mcreator.nesteyscitiesmod.client.gui.CassaGUIScreen;
import net.mcreator.nesteyscitiesmod.client.gui.BankomatGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class UiModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(UiModMenus.STORAGE_BOX_GUI.get(), StorageBosGUIScreen::new);
			MenuScreens.register(UiModMenus.TRASHCAN_BIG_GUI.get(), TrashcanBigGUIScreen::new);
			MenuScreens.register(UiModMenus.MAILBOX_GUI.get(), MailboxGUIScreen::new);
			MenuScreens.register(UiModMenus.TRASH_CAN_STREET_GUI.get(), TrashCanStreetGUIScreen::new);
			MenuScreens.register(UiModMenus.SMARTPHONE_HOMAPAGE_GUI.get(), SmartphoneHomapageGUIScreen::new);
			MenuScreens.register(UiModMenus.SMARTPHONE_CONTACTS_GUI.get(), SmartphoneContactsGUIScreen::new);
			MenuScreens.register(UiModMenus.SMARTPHONE_SETTINGS_GUI.get(), SmartphoneSettingsGUIScreen::new);
			MenuScreens.register(UiModMenus.BANKOMAT_GUI.get(), BankomatGUIScreen::new);
			MenuScreens.register(UiModMenus.CASSA_GUI.get(), CassaGUIScreen::new);
			MenuScreens.register(UiModMenus.SCHEM_MAIN_MENU.get(), SchemMainMenuScreen::new);
			MenuScreens.register(UiModMenus.SCHEM_TRAIN_OPORA.get(), SchemTrainOporaScreen::new);
			MenuScreens.register(UiModMenus.GUI_MONEY.get(), GUIMoneyScreen::new);
			MenuScreens.register(UiModMenus.NUMBER_GAZON.get(), NumberGazonScreen::new);
			MenuScreens.register(UiModMenus.OUTPUT_GAZON.get(), OutputGazonScreen::new);
			MenuScreens.register(UiModMenus.MAIN_MENU_GAZON.get(), MainMenuGazonScreen::new);
		});
	}
}
