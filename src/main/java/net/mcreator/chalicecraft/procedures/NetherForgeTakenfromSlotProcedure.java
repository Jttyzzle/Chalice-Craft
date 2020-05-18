package net.mcreator.chalicecraft.procedures;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.chalicecraft.ChaliceCraftElements;

@ChaliceCraftElements.ModElement.Tag
public class NetherForgeTakenfromSlotProcedure extends ChaliceCraftElements.ModElement {
	public NetherForgeTakenfromSlotProcedure(ChaliceCraftElements instance) {
		super(instance, 32);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure NetherForgeTakenfromSlot!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).giveExperiencePoints((int) 7);
	}
}
