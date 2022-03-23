package net.mcreator.extrememinecraft.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.IRenderTypeBuffer;

import net.mcreator.extrememinecraft.entity.ToothlessEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class ToothlessRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(ToothlessEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModeldragonTest(), 0.5f) {
					{
						this.addLayer(new GlowingLayer<>(this));
					}

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("extrememinecraft:textures/dragontest.png");
					}
				};
			});
		}
	}

	@OnlyIn(Dist.CLIENT)
	private static class GlowingLayer<T extends Entity, M extends EntityModel<T>> extends LayerRenderer<T, M> {
		public GlowingLayer(IEntityRenderer<T, M> er) {
			super(er);
		}

		public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, T entitylivingbaseIn, float limbSwing,
				float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
			IVertexBuilder ivertexbuilder = bufferIn.getBuffer(RenderType.getEyes(new ResourceLocation("extrememinecraft:textures/dragontest.png")));
			this.getEntityModel().render(matrixStackIn, ivertexbuilder, 15728640, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		}
	}

	// Made with Blockbench 4.1.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModeldragonTest extends EntityModel<Entity> {
		private final ModelRenderer legBackRight;
		private final ModelRenderer legBackLeft;
		private final ModelRenderer legFrontLeft;
		private final ModelRenderer legFrontRight;
		private final ModelRenderer Body;
		private final ModelRenderer tail;
		private final ModelRenderer spikes;
		private final ModelRenderer spikes3;
		private final ModelRenderer spikes4;
		private final ModelRenderer spikes5;
		private final ModelRenderer spikes6;
		private final ModelRenderer spikes7;
		private final ModelRenderer spikes8;
		private final ModelRenderer spikes9;
		private final ModelRenderer spikes10;
		private final ModelRenderer spikes11;
		private final ModelRenderer head;
		private final ModelRenderer wings;
		private final ModelRenderer cube_r1;
		private final ModelRenderer wings2;
		private final ModelRenderer cube_r2;

		public ModeldragonTest() {
			textureWidth = 128;
			textureHeight = 128;
			legBackRight = new ModelRenderer(this);
			legBackRight.setRotationPoint(-7.0F, 14.0F, 12.0F);
			legBackRight.setTextureOffset(71, 102).addBox(-1.0F, 4.9564F, 0.999F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			legBackRight.setTextureOffset(0, 10).addBox(-1.0F, 1.9564F, -2.001F, 4.0F, 3.0F, 6.0F, 0.0F, false);
			legBackRight.setTextureOffset(57, 85).addBox(-1.0F, -1.0436F, -3.001F, 4.0F, 4.0F, 5.0F, 0.0F, false);
			legBackLeft = new ModelRenderer(this);
			legBackLeft.setRotationPoint(6.0F, 13.0F, 13.0F);
			legBackLeft.setTextureOffset(104, 0).addBox(-2.0F, 6.0F, 0.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			legBackLeft.setTextureOffset(33, 102).addBox(-2.0F, 3.0F, -2.0F, 4.0F, 3.0F, 5.0F, 0.0F, false);
			legBackLeft.setTextureOffset(77, 17).addBox(-2.0F, 0.0F, -4.0F, 4.0F, 4.0F, 5.0F, 0.0F, false);
			legFrontLeft = new ModelRenderer(this);
			legFrontLeft.setRotationPoint(7.0F, 13.0F, -3.0F);
			legFrontLeft.setTextureOffset(90, 85).addBox(-3.0F, 3.0F, -4.0F, 4.0F, 4.0F, 5.0F, 0.0F, false);
			legFrontLeft.setTextureOffset(0, 29).addBox(-3.0F, 0.0F, -3.0F, 4.0F, 5.0F, 5.0F, 0.0F, false);
			legFrontLeft.setTextureOffset(15, 106).addBox(-3.0F, 6.0F, -5.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			legFrontRight = new ModelRenderer(this);
			legFrontRight.setRotationPoint(-7.0F, 13.0F, -4.0F);
			setRotationAngle(legFrontRight, 0.0F, -0.0436F, 0.0F);
			legFrontRight.setTextureOffset(106, 46).addBox(-1.0F, 6.0F, -4.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			legFrontRight.setTextureOffset(52, 102).addBox(-1.0F, 3.0F, -3.0F, 4.0F, 3.0F, 5.0F, 0.0F, false);
			legFrontRight.setTextureOffset(0, 0).addBox(-1.0F, 0.0F, -2.0F, 5.0F, 4.0F, 5.0F, 0.0F, false);
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 24.0F, 0.0F);
			Body.setTextureOffset(0, 0).addBox(-8.0F, -17.0F, -8.0F, 16.0F, 6.0F, 22.0F, 0.0F, false);
			Body.setTextureOffset(0, 29).addBox(-6.0F, -17.0F, -12.0F, 12.0F, 6.0F, 22.0F, 0.0F, false);
			tail = new ModelRenderer(this);
			tail.setRotationPoint(0.0F, 24.0F, 0.0F);
			tail.setTextureOffset(0, 40).addBox(-2.0F, -17.0F, 14.0F, 4.0F, 4.0F, 5.0F, 0.0F, false);
			tail.setTextureOffset(0, 101).addBox(-2.0F, -16.0F, 16.0F, 4.0F, 3.0F, 5.0F, 0.0F, false);
			tail.setTextureOffset(100, 35).addBox(-2.0F, -14.0F, 18.0F, 4.0F, 3.0F, 5.0F, 0.0F, false);
			tail.setTextureOffset(100, 26).addBox(-2.0F, -12.0F, 20.0F, 4.0F, 3.0F, 5.0F, 0.0F, false);
			tail.setTextureOffset(19, 95).addBox(-2.0F, -11.0F, 27.0F, 4.0F, 3.0F, 5.0F, 0.0F, false);
			tail.setTextureOffset(0, 92).addBox(-2.0F, -13.0F, 32.0F, 4.0F, 3.0F, 5.0F, 0.0F, false);
			tail.setTextureOffset(94, 63).addBox(-2.0F, -12.0F, 29.0F, 4.0F, 3.0F, 5.0F, 0.0F, false);
			tail.setTextureOffset(99, 97).addBox(-2.0F, -10.2F, 22.0F, 4.0F, 3.0F, 5.0F, 0.0F, false);
			tail.setTextureOffset(96, 17).addBox(-2.0F, -10.3F, 24.0F, 4.0F, 3.0F, 5.0F, 0.0F, false);
			spikes = new ModelRenderer(this);
			spikes.setRotationPoint(1.0F, 1.0F, 10.0F);
			tail.addChild(spikes);
			spikes.setTextureOffset(0, 69).addBox(-1.0F, -20.0F, 4.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			spikes.setTextureOffset(54, 58).addBox(-1.0F, -20.0F, 7.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			spikes.setTextureOffset(56, 63).addBox(-1.0F, -21.0F, 5.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
			spikes3 = new ModelRenderer(this);
			spikes3.setRotationPoint(0.0F, 1.0F, 10.0F);
			tail.addChild(spikes3);
			spikes3.setTextureOffset(7, 64).addBox(-1.0F, -20.0F, 4.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			spikes3.setTextureOffset(49, 58).addBox(-1.0F, -20.0F, 7.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			spikes3.setTextureOffset(49, 63).addBox(-1.0F, -21.0F, 5.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
			spikes4 = new ModelRenderer(this);
			spikes4.setRotationPoint(0.0F, 4.0F, 16.0F);
			tail.addChild(spikes4);
			spikes4.setTextureOffset(0, 64).addBox(-1.0F, -20.0F, 4.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			spikes4.setTextureOffset(0, 10).addBox(-1.0F, -19.0F, 7.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			spikes4.setTextureOffset(62, 0).addBox(-1.0F, -21.0F, 5.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
			spikes5 = new ModelRenderer(this);
			spikes5.setRotationPoint(1.0F, 4.0F, 16.0F);
			tail.addChild(spikes5);
			spikes5.setTextureOffset(62, 17).addBox(-1.0F, -20.0F, 4.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			spikes5.setTextureOffset(0, 0).addBox(-1.0F, -19.0F, 7.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			spikes5.setTextureOffset(60, 10).addBox(-1.0F, -21.0F, 5.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
			spikes6 = new ModelRenderer(this);
			spikes6.setRotationPoint(1.0F, 8.0F, 20.0F);
			tail.addChild(spikes6);
			spikes6.setTextureOffset(61, 46).addBox(-1.0F, -20.0F, 4.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			spikes6.setTextureOffset(55, 12).addBox(-1.0F, -20.0F, 7.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			spikes6.setTextureOffset(7, 58).addBox(-1.0F, -21.0F, 5.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
			spikes7 = new ModelRenderer(this);
			spikes7.setRotationPoint(0.0F, 8.0F, 20.0F);
			tail.addChild(spikes7);
			spikes7.setTextureOffset(55, 17).addBox(-1.0F, -20.0F, 4.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			spikes7.setTextureOffset(54, 35).addBox(-1.0F, -20.0F, 7.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			spikes7.setTextureOffset(0, 58).addBox(-1.0F, -21.0F, 5.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
			spikes8 = new ModelRenderer(this);
			spikes8.setRotationPoint(0.0F, 6.0F, 24.0F);
			tail.addChild(spikes8);
			spikes8.setTextureOffset(54, 46).addBox(-1.0F, -20.0F, 4.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			spikes8.setTextureOffset(47, 41).addBox(-1.0F, -20.0F, 7.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			spikes8.setTextureOffset(55, 6).addBox(-1.0F, -21.0F, 5.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
			spikes8.setTextureOffset(54, 29).addBox(-1.0F, -21.0F, 5.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
			spikes9 = new ModelRenderer(this);
			spikes9.setRotationPoint(1.0F, 6.0F, 24.0F);
			tail.addChild(spikes9);
			spikes9.setTextureOffset(47, 46).addBox(-1.0F, -20.0F, 4.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			spikes9.setTextureOffset(0, 40).addBox(-1.0F, -20.0F, 7.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			spikes9.setTextureOffset(55, 0).addBox(-1.0F, -21.0F, 5.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
			spikes10 = new ModelRenderer(this);
			spikes10.setRotationPoint(0.0F, 5.0F, 29.0F);
			tail.addChild(spikes10);
			spikes10.setTextureOffset(14, 40).addBox(-1.0F, -20.0F, 4.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			spikes10.setTextureOffset(0, 29).addBox(-1.0F, -20.0F, 7.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			spikes10.setTextureOffset(52, 39).addBox(-1.0F, -21.0F, 5.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
			spikes10.setTextureOffset(47, 35).addBox(-1.0F, -21.0F, 5.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
			spikes11 = new ModelRenderer(this);
			spikes11.setRotationPoint(1.0F, 5.0F, 29.0F);
			tail.addChild(spikes11);
			spikes11.setTextureOffset(14, 29).addBox(-1.0F, -20.0F, 4.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			spikes11.setTextureOffset(16, 0).addBox(-1.0F, -20.0F, 7.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			spikes11.setTextureOffset(47, 29).addBox(-1.0F, -21.0F, 5.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
			spikes11.setTextureOffset(15, 10).addBox(-1.0F, -21.0F, 5.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(-1.0F, 24.0F, 15.0F);
			head.setTextureOffset(38, 85).addBox(-6.0F, -20.0F, -35.0F, 2.0F, 2.0F, 14.0F, 0.0F, false);
			head.setTextureOffset(0, 75).addBox(2.0F, -19.0F, -37.0F, 2.0F, 2.0F, 14.0F, 0.0F, false);
			head.setTextureOffset(19, 78).addBox(-3.0F, -19.0F, -37.0F, 2.0F, 2.0F, 14.0F, 0.0F, false);
			head.setTextureOffset(71, 85).addBox(6.0F, -20.0F, -35.0F, 2.0F, 2.0F, 14.0F, 0.0F, false);
			head.setTextureOffset(51, 63).addBox(-6.0F, -19.0F, -39.0F, 14.0F, 7.0F, 14.0F, 0.0F, false);
			wings = new ModelRenderer(this);
			wings.setRotationPoint(0.0F, 24.0F, 0.0F);
			wings.setTextureOffset(0, 58).addBox(7.0F, -16.0F, -7.0F, 16.0F, 0.0F, 16.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			wings.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0F, 0.0F, -0.3491F);
			cube_r1.setTextureOffset(53, 46).addBox(26.8F, -7.4F, -7.0F, 18.0F, 0.0F, 16.0F, 0.0F, false);
			wings2 = new ModelRenderer(this);
			wings2.setRotationPoint(0.0F, 24.0F, 2.0F);
			setRotationAngle(wings2, -3.1416F, 0.0F, 3.1416F);
			wings2.setTextureOffset(55, 0).addBox(7.0F, -16.0F, -7.0F, 16.0F, 0.0F, 16.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
			wings2.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.0F, 0.0F, -0.3491F);
			cube_r2.setTextureOffset(47, 29).addBox(26.8F, -7.4F, -7.0F, 18.0F, 0.0F, 16.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			legBackRight.render(matrixStack, buffer, packedLight, packedOverlay);
			legBackLeft.render(matrixStack, buffer, packedLight, packedOverlay);
			legFrontLeft.render(matrixStack, buffer, packedLight, packedOverlay);
			legFrontRight.render(matrixStack, buffer, packedLight, packedOverlay);
			Body.render(matrixStack, buffer, packedLight, packedOverlay);
			tail.render(matrixStack, buffer, packedLight, packedOverlay);
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			wings.render(matrixStack, buffer, packedLight, packedOverlay);
			wings2.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.legBackLeft.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.legBackRight.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.legFrontLeft.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.tail.rotateAngleY = f4 / (180F / (float) Math.PI);
			this.legFrontRight.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		}
	}

}
