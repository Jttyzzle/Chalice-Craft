
package net.mcreator.chalicecraft.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.entity.LivingEntity;

import net.mcreator.chalicecraft.procedures.ChaliceProcedure;
import net.mcreator.chalicecraft.ChaliceCraftElements;

@ChaliceCraftElements.ModElement.Tag
public class GoldenChaliceItem extends ChaliceCraftElements.ModElement {
	@ObjectHolder("chalicecraft:goldenchalice")
	public static final Item block = null;
	public GoldenChaliceItem(ChaliceCraftElements instance) {
		super(instance, 28);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(1)
					.food((new Food.Builder()).hunger(4).saturation(2f).setAlwaysEdible().build()));
			setRegistryName("goldenchalice");
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.DRINK;
		}

		@Override
		public ItemStack onItemUseFinish(ItemStack itemStack, World world, LivingEntity entity) {
			ItemStack retval = super.onItemUseFinish(itemStack, world, entity);
			int x = (int) entity.posX;
			int y = (int) entity.posY;
			int z = (int) entity.posZ;
			{
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("entity", entity);
				ChaliceProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}
	}
}
