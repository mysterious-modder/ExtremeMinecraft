
package net.mcreator.extrememinecraft.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.extrememinecraft.ExtrememinecraftModElements;

@ExtrememinecraftModElements.ModElement.Tag
public class Ruby_setPickaxeItem extends ExtrememinecraftModElements.ModElement {
	@ObjectHolder("extrememinecraft:ruby_set_pickaxe")
	public static final Item block = null;

	public Ruby_setPickaxeItem(ExtrememinecraftModElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1561;
			}

			public float getEfficiency() {
				return 24f;
			}

			public float getAttackDamage() {
				return 18f;
			}

			public int getHarvestLevel() {
				return 20;
			}

			public int getEnchantability() {
				return 140;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(RubyItem.block));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("ruby_set_pickaxe"));
	}
}
