package net.mcreator.nesteyscitiesmod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class OstanovkaMobPriObnovlieniiTikaSushchnostiProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setDeltaMovement(new Vec3(0, 0, 0));
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) < 2) {
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth(2);
		}
	}
}
