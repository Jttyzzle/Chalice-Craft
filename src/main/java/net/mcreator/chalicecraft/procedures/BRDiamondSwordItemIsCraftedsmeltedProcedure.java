package net.mcreator.chalicecraft.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.enchantment.Enchantments;

import net.mcreator.chalicecraft.ChaliceCraftElements;

@ChaliceCraftElements.ModElement.Tag
public class BRDiamondSwordItemIsCraftedsmeltedProcedure extends ChaliceCraftElements.ModElement {
	public BRDiamondSwordItemIsCraftedsmeltedProcedure(ChaliceCraftElements instance) {
		super(instance, 1);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure BRDiamondSwordItemIsCraftedsmelted!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		itemstack.addEnchantment(Enchantments.FIRE_ASPECT, (int) 2);
	}
}
