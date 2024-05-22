package net.mcreator.nesteyscitiesmod.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.nesteyscitiesmod.network.UiModVariables;
import net.mcreator.nesteyscitiesmod.init.UiModItems;

public class MoneyPriShchielchkiePKMPoBlokuProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(UiModItems.MONEY.get());
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
		{
			double _setval = (entity.getCapability(UiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new UiModVariables.PlayerVariables())).Money + 5;
			entity.getCapability(UiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Money = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
