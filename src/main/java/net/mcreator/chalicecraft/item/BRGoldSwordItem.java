
package net.mcreator.chalicecraft.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.entity.player.PlayerEntity;

import net.mcreator.chalicecraft.procedures.BRDiamondSwordItemIsCraftedsmeltedProcedure;
import net.mcreator.chalicecraft.ChaliceCraftElements;

@ChaliceCraftElements.ModElement.Tag
public class BRGoldSwordItem extends ChaliceCraftElements.ModElement {
	@ObjectHolder("chalicecraft:brgoldsword")
	public static final Item block = null;
	public BRGoldSwordItem(ChaliceCraftElements instance) {
		super(instance, 12);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 1561;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 0;
			}

			public int getEnchantability() {
				return 10;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, -2.4f, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public void onCreated(ItemStack itemstack, World world, PlayerEntity entity) {
				super.onCreated(itemstack, world, entity);
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("itemstack", itemstack);
					BRDiamondSwordItemIsCraftedsmeltedProcedure.executeProcedure($_dependencies);
				}
			}
		}.setRegistryName("brgoldsword"));
	}
}
