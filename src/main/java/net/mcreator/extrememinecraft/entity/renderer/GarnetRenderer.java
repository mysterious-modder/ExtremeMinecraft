package net.mcreator.extrememinecraft.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.extrememinecraft.entity.GarnetEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class GarnetRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(GarnetEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelgarnet_future(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("extrememinecraft:textures/garnet.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelgarnet_future extends EntityModel<Entity> {
		private final ModelRenderer Hair;
		private final ModelRenderer NecktoHead;
		private final ModelRenderer RightShoulder;
		private final ModelRenderer LeftShoulder;
		private final ModelRenderer RightArm;
		private final ModelRenderer LeftArm;
		private final ModelRenderer Chestplate;
		private final ModelRenderer Hips;
		private final ModelRenderer RightLeg;
		private final ModelRenderer LeftLeg;
		private final ModelRenderer bb_main;

		public Modelgarnet_future() {
			textureWidth = 128;
			textureHeight = 128;
			Hair = new ModelRenderer(this);
			Hair.setRotationPoint(0.0F, 24.0F, 0.0F);
			Hair.setTextureOffset(20, 23).addBox(-8.0F, -42.0F, -3.0F, 5.0F, 7.0F, 10.0F, 0.0F, false);
			Hair.setTextureOffset(0, 0).addBox(-8.0F, -48.0F, -3.0F, 16.0F, 6.0F, 10.0F, 0.0F, false);
			Hair.setTextureOffset(0, 16).addBox(3.0F, -42.0F, -3.0F, 5.0F, 7.0F, 10.0F, 0.0F, false);
			Hair.setTextureOffset(44, 40).addBox(-3.0F, -42.0F, 2.0F, 6.0F, 7.0F, 5.0F, 0.0F, false);
			NecktoHead = new ModelRenderer(this);
			NecktoHead.setRotationPoint(0.0F, 24.0F, 0.0F);
			NecktoHead.setTextureOffset(0, 0).addBox(-1.0F, -35.0F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			NecktoHead.setTextureOffset(0, 50).addBox(-3.0F, -42.0F, -3.0F, 6.0F, 7.0F, 5.0F, 0.0F, false);
			RightShoulder = new ModelRenderer(this);
			RightShoulder.setRotationPoint(0.0F, 24.0F, 0.0F);
			RightShoulder.setTextureOffset(52, 8).addBox(-9.0F, -34.0F, -3.0F, 5.0F, 3.0F, 5.0F, 0.0F, false);
			LeftShoulder = new ModelRenderer(this);
			LeftShoulder.setRotationPoint(0.0F, 24.0F, 0.0F);
			LeftShoulder.setTextureOffset(42, 0).addBox(4.0F, -34.0F, -3.0F, 5.0F, 3.0F, 5.0F, 0.0F, false);
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(0.0F, 24.0F, 0.0F);
			RightArm.setTextureOffset(30, 57).addBox(-7.5F, -31.0F, -1.5F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			RightArm.setTextureOffset(58, 22).addBox(-8.9F, -20.0F, -1.5F, 4.0F, 5.0F, 2.0F, 0.0F, false);
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(0.0F, 24.0F, 0.0F);
			LeftArm.setTextureOffset(22, 57).addBox(5.5F, -31.0F, -1.5F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			LeftArm.setTextureOffset(60, 29).addBox(4.85F, -20.0F, -1.5F, 4.0F, 5.0F, 2.0F, 0.0F, false);
			Chestplate = new ModelRenderer(this);
			Chestplate.setRotationPoint(0.0F, 24.0F, 0.0F);
			Chestplate.setTextureOffset(0, 33).addBox(-3.0F, -28.0F, -2.0F, 6.0F, 1.0F, 3.0F, 0.0F, false);
			Chestplate.setTextureOffset(0, 40).addBox(-4.0F, -33.0F, -3.0F, 8.0F, 5.0F, 5.0F, 0.0F, false);
			Hips = new ModelRenderer(this);
			Hips.setRotationPoint(0.0F, 24.0F, 0.0F);
			Hips.setTextureOffset(20, 16).addBox(-3.0F, -24.0F, -2.0F, 6.0F, 2.0F, 3.0F, 0.0F, false);
			Hips.setTextureOffset(61, 36).addBox(-2.0F, -25.0F, -2.0F, 4.0F, 1.0F, 3.0F, 0.0F, false);
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(0.0F, 24.0F, 0.0F);
			RightLeg.setTextureOffset(40, 16).addBox(-4.0F, -22.0F, -3.0F, 4.0F, 12.0F, 5.0F, 0.0F, false);
			RightLeg.setTextureOffset(56, 52).addBox(-3.0F, -10.0F, -2.0F, 3.0F, 10.0F, 3.0F, 0.0F, false);
			RightLeg.setTextureOffset(50, 33).addBox(-3.0F, -2.0F, -5.0F, 3.0F, 2.0F, 4.0F, 0.0F, false);
			RightLeg.setTextureOffset(0, 4).addBox(-2.5F, -1.0F, -6.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(0.0F, 24.0F, 0.0F);
			LeftLeg.setTextureOffset(26, 40).addBox(0.0F, -22.0F, -3.0F, 4.0F, 12.0F, 5.0F, 0.0F, false);
			LeftLeg.setTextureOffset(44, 52).addBox(0.0F, -10.0F, -2.0F, 3.0F, 10.0F, 3.0F, 0.0F, false);
			LeftLeg.setTextureOffset(58, 16).addBox(0.0F, -2.0F, -5.0F, 3.0F, 2.0F, 4.0F, 0.0F, false);
			LeftLeg.setTextureOffset(0, 6).addBox(0.5F, -1.0F, -6.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			bb_main = new ModelRenderer(this);
			bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
			bb_main.setTextureOffset(57, 0).addBox(-2.0F, -27.0F, -2.0F, 4.0F, 2.0F, 3.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Hair.render(matrixStack, buffer, packedLight, packedOverlay);
			NecktoHead.render(matrixStack, buffer, packedLight, packedOverlay);
			RightShoulder.render(matrixStack, buffer, packedLight, packedOverlay);
			LeftShoulder.render(matrixStack, buffer, packedLight, packedOverlay);
			RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
			LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
			Chestplate.render(matrixStack, buffer, packedLight, packedOverlay);
			Hips.render(matrixStack, buffer, packedLight, packedOverlay);
			RightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
			LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
			bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.Hair.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.Hair.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.RightArm.rotateAngleZ = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.LeftLeg.rotateAngleZ = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.LeftArm.rotateAngleZ = MathHelper.cos(f * 0.6662F) * f1;
			this.RightLeg.rotateAngleZ = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.LeftShoulder.rotateAngleZ = MathHelper.cos(f * 0.6662F) * f1;
			this.NecktoHead.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.NecktoHead.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.RightShoulder.rotateAngleZ = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		}
	}

}
