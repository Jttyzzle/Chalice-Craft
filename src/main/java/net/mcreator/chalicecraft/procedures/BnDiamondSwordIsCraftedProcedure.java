package net.mcreator.chalicecraft.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.enchantment.Enchantments;

import net.mcreator.chalicecraft.ChaliceCraftElements;

@ChaliceCraftElements.ModElement.Tag
public class BnDiamondSwordIsCraftedProcedure extends ChaliceCraftElements.ModElement {
	public BnDiamondSwordIsCraftedProcedure(ChaliceCraftElements instance) {
		super(instance, 5);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure BnDiamondSwordIsCrafted!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		itemstack.addEnchantment(Enchantments.SMITE, (int) 3);
	}
}
