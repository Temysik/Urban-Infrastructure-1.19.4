
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nesteyscitiesmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.nesteyscitiesmod.world.inventory.TrashcanBigGUIMenu;
import net.mcreator.nesteyscitiesmod.world.inventory.TrashCanStreetGUIMenu;
import net.mcreator.nesteyscitiesmod.world.inventory.StorageBosGUIMenu;
import net.mcreator.nesteyscitiesmod.world.inventory.SmartphoneSettingsGUIMenu;
import net.mcreator.nesteyscitiesmod.world.inventory.SmartphoneHomapageGUIMenu;
import net.mcreator.nesteyscitiesmod.world.inventory.SmartphoneContactsGUIMenu;
import net.mcreator.nesteyscitiesmod.world.inventory.SchemTrainOporaMenu;
import net.mcreator.nesteyscitiesmod.world.inventory.SchemMainMenuMenu;
import net.mcreator.nesteyscitiesmod.world.inventory.OutputGazonMenu;
import net.mcreator.nesteyscitiesmod.world.inventory.NumberGazonMenu;
import net.mcreator.nesteyscitiesmod.world.inventory.MainMenuGazonMenu;
import net.mcreator.nesteyscitiesmod.world.inventory.MailboxGUIMenu;
import net.mcreator.nesteyscitiesmod.world.inventory.LaptopMainMenuGUIMenu;
import net.mcreator.nesteyscitiesmod.world.inventory.GUIMoneyMenu;
import net.mcreator.nesteyscitiesmod.world.inventory.CassaGUIMenu;
import net.mcreator.nesteyscitiesmod.world.inventory.BankomatGUIMenu;
import net.mcreator.nesteyscitiesmod.UiMod;

public class UiModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, UiMod.MODID);
	public static final RegistryObject<MenuType<StorageBosGUIMenu>> STORAGE_BOX_GUI = REGISTRY.register("storage_box_gui", () -> IForgeMenuType.create(StorageBosGUIMenu::new));
	public static final RegistryObject<MenuType<TrashcanBigGUIMenu>> TRASHCAN_BIG_GUI = REGISTRY.register("trashcan_big_gui", () -> IForgeMenuType.create(TrashcanBigGUIMenu::new));
	public static final RegistryObject<MenuType<MailboxGUIMenu>> MAILBOX_GUI = REGISTRY.register("mailbox_gui", () -> IForgeMenuType.create(MailboxGUIMenu::new));
	public static final RegistryObject<MenuType<TrashCanStreetGUIMenu>> TRASH_CAN_STREET_GUI = REGISTRY.register("trash_can_street_gui", () -> IForgeMenuType.create(TrashCanStreetGUIMenu::new));
	public static final RegistryObject<MenuType<SmartphoneHomapageGUIMenu>> SMARTPHONE_HOMAPAGE_GUI = REGISTRY.register("smartphone_homapage_gui", () -> IForgeMenuType.create(SmartphoneHomapageGUIMenu::new));
	public static final RegistryObject<MenuType<SmartphoneContactsGUIMenu>> SMARTPHONE_CONTACTS_GUI = REGISTRY.register("smartphone_contacts_gui", () -> IForgeMenuType.create(SmartphoneContactsGUIMenu::new));
	public static final RegistryObject<MenuType<SmartphoneSettingsGUIMenu>> SMARTPHONE_SETTINGS_GUI = REGISTRY.register("smartphone_settings_gui", () -> IForgeMenuType.create(SmartphoneSettingsGUIMenu::new));
	public static final RegistryObject<MenuType<BankomatGUIMenu>> BANKOMAT_GUI = REGISTRY.register("bankomat_gui", () -> IForgeMenuType.create(BankomatGUIMenu::new));
	public static final RegistryObject<MenuType<CassaGUIMenu>> CASSA_GUI = REGISTRY.register("cassa_gui", () -> IForgeMenuType.create(CassaGUIMenu::new));
	public static final RegistryObject<MenuType<LaptopMainMenuGUIMenu>> LAPTOP_MAIN_MENU_GUI = REGISTRY.register("laptop_main_menu_gui", () -> IForgeMenuType.create(LaptopMainMenuGUIMenu::new));
	public static final RegistryObject<MenuType<SchemMainMenuMenu>> SCHEM_MAIN_MENU = REGISTRY.register("schem_main_menu", () -> IForgeMenuType.create(SchemMainMenuMenu::new));
	public static final RegistryObject<MenuType<SchemTrainOporaMenu>> SCHEM_TRAIN_OPORA = REGISTRY.register("schem_train_opora", () -> IForgeMenuType.create(SchemTrainOporaMenu::new));
	public static final RegistryObject<MenuType<GUIMoneyMenu>> GUI_MONEY = REGISTRY.register("gui_money", () -> IForgeMenuType.create(GUIMoneyMenu::new));
	public static final RegistryObject<MenuType<NumberGazonMenu>> NUMBER_GAZON = REGISTRY.register("number_gazon", () -> IForgeMenuType.create(NumberGazonMenu::new));
	public static final RegistryObject<MenuType<OutputGazonMenu>> OUTPUT_GAZON = REGISTRY.register("output_gazon", () -> IForgeMenuType.create(OutputGazonMenu::new));
	public static final RegistryObject<MenuType<MainMenuGazonMenu>> MAIN_MENU_GAZON = REGISTRY.register("main_menu_gazon", () -> IForgeMenuType.create(MainMenuGazonMenu::new));
}
