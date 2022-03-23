package net.mcreator.extrememinecraft.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.Entity;

import net.mcreator.extrememinecraft.ExtrememinecraftMod;

import java.util.Map;

public class SummonGarnetProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ExtrememinecraftMod.LOGGER.warn("Failed to load dependency entity for procedure SummonGarnet!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				ExtrememinecraftMod.LOGGER.warn("Failed to load dependency itemstack for procedure SummonGarnet!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote && _ent.world.getServer() != null) {
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
						"summon extrememinecraft:garnet ~ ~ ~");
			}
		}
		(itemstack).shrink((int) 1);
	}
}
