
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nesteyscitiesmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.nesteyscitiesmod.block.entity.TrashcanBigBlockEntity;
import net.mcreator.nesteyscitiesmod.block.entity.TrashCanStreetBlockEntity;
import net.mcreator.nesteyscitiesmod.block.entity.StorageboxBlockEntity;
import net.mcreator.nesteyscitiesmod.block.entity.PostamatOzonBlockEntity;
import net.mcreator.nesteyscitiesmod.block.entity.MailboxBlockEntity;
import net.mcreator.nesteyscitiesmod.block.entity.LoftTrashBlockEntity;
import net.mcreator.nesteyscitiesmod.block.entity.LaptopBlockEntity;
import net.mcreator.nesteyscitiesmod.block.entity.CassaComputerBlockEntity;
import net.mcreator.nesteyscitiesmod.UiMod;

public class UiModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, UiMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> LOFT_TRASH = register("loft_trash", UiModBlocks.LOFT_TRASH, LoftTrashBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CASSA_COMPUTER = register("cassa_computer", UiModBlocks.CASSA_COMPUTER, CassaComputerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> MAILBOX = register("mailbox", UiModBlocks.MAILBOX, MailboxBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> STORAGEBOX = register("storagebox", UiModBlocks.STORAGEBOX, StorageboxBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> POSTAMAT_OZON = register("postamat_ozon", UiModBlocks.POSTAMAT_OZON, PostamatOzonBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TRASHCAN_BIG = register("trashcan_big", UiModBlocks.TRASHCAN_BIG, TrashcanBigBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TRASH_CAN_STREET = register("trash_can_street", UiModBlocks.TRASH_CAN_STREET, TrashCanStreetBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> LAPTOP = register("laptop", UiModBlocks.LAPTOP, LaptopBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
