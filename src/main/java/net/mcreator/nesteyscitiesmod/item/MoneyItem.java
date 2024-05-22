
package net.mcreator.nesteyscitiesmod.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.nesteyscitiesmod.procedures.MoneyPriShchielchkiePKMPoBlokuProcedure;

public class MoneyItem extends Item {
	public MoneyItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		MoneyPriShchielchkiePKMPoBlokuProcedure.execute(context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}
