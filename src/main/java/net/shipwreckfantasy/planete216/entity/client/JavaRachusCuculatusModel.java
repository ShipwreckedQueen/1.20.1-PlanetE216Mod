package net.shipwreckfantasy.planete216.entity.client;// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class JavaRachusCuculatusModel<T extends Entity> extends HierarchicalModel<T> {
	private final ModelPart FullBody;
	private final ModelPart head;

	public JavaRachusCuculatusModel(ModelPart root) {
		this.FullBody = root.getChild("FullBody");
		this.head = FullBody.getChild("HeadandNeck").getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition FullBody = partdefinition.addOrReplaceChild("FullBody", CubeListBuilder.create(), PartPose.offset(0.0F, 15.0F, 0.0F));

		PartDefinition Body = FullBody.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.0F, -1.0F));

		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -6.75F, 0.5F, 0.0F, 0.5F, 1.25F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.0F, 1.75F, 0.0F, -0.6109F, 0.0F));

		PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(8, 20).addBox(-1.0F, -0.5F, -6.25F, 0.0F, 0.75F, 1.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.0F, 1.75F, -1.5708F, -0.6109F, 0.0F));

		PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(4, 0).addBox(-1.0F, -6.75F, 0.5F, 0.0F, 0.5F, 1.25F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 1.0F, 0.5F, 0.0F, 0.5672F, 0.0F));

		PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(25, 5).addBox(-1.0F, -0.5F, -6.25F, 0.0F, 0.75F, 1.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 1.0F, 0.5F, -1.5708F, 0.5672F, 0.0F));

		PartDefinition cube_r5 = Body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 17).addBox(7.0F, -13.0F, -6.0F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 10.0F, -2.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition LeftWing = FullBody.addOrReplaceChild("LeftWing", CubeListBuilder.create().texOffs(0, 29).addBox(-0.25F, -0.5F, -1.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 17).addBox(-0.25F, 1.5F, 3.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(4.25F, -1.5F, -2.0F));

		PartDefinition RightWing = FullBody.addOrReplaceChild("RightWing", CubeListBuilder.create().texOffs(26, 28).addBox(-0.75F, -0.5F, -1.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.75F, 1.5F, 3.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.25F, -1.5F, -2.0F));

		PartDefinition Tail = FullBody.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(34, 3).addBox(-0.5F, -1.0F, -0.8F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.0F, 3.0F));

		PartDefinition LTail = Tail.addOrReplaceChild("LTail", CubeListBuilder.create(), PartPose.offset(1.0F, 1.0F, -0.5F));

		PartDefinition cube_r6 = LTail.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(10, 32).addBox(-0.4F, -2.0F, -1.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 0.218F, 0.0F));

		PartDefinition RTail = Tail.addOrReplaceChild("RTail", CubeListBuilder.create(), PartPose.offset(-1.25F, 1.0F, -0.5F));

		PartDefinition cube_r7 = RTail.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(28, 20).addBox(-0.9F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.25F, 0.0F, 1.5F, 0.0F, -0.218F, 0.0F));

		PartDefinition HeadandNeck = FullBody.addOrReplaceChild("HeadandNeck", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -4.0F));

		PartDefinition Head = HeadandNeck.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0F, -6.5F, -1.0F));

		PartDefinition cube_r8 = Head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(24, -1).addBox(-1.45F, -3.0F, 2.25F, 3.0F, 3.75F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(20, 36).addBox(-0.95F, -4.5F, 3.0F, 2.0F, 1.5F, 1.7F, new CubeDeformation(0.0F))
		.texOffs(0, 6).addBox(-0.95F, -5.25F, 2.5F, 2.0F, 0.75F, 2.2F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5F, 1.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition HeadFeathers = Head.addOrReplaceChild("HeadFeathers", CubeListBuilder.create().texOffs(0, 5).addBox(1.0F, -1.75F, 0.5F, 0.0F, 0.5F, 1.25F, new CubeDeformation(0.0F))
		.texOffs(0, 6).addBox(-1.0F, -1.75F, 0.5F, 0.0F, 0.5F, 1.25F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.5F, 1.0F));

		PartDefinition cube_r9 = HeadFeathers.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(14, 25).addBox(-1.0F, -0.5F, -6.25F, 0.0F, 0.75F, 1.5F, new CubeDeformation(0.0F))
		.texOffs(25, 6).addBox(1.0F, -0.5F, -6.25F, 0.0F, 0.75F, 1.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition Neck = HeadandNeck.addOrReplaceChild("Neck", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r10 = Neck.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(14, 24).addBox(-2.0F, -0.5F, -3.0F, 4.0F, 4.0F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r11 = Neck.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(14, 17).addBox(-3.0F, 1.5F, -3.75F, 6.0F, 4.0F, 2.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r12 = Neck.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(34, 11).addBox(-1.0F, -3.0F, -2.75F, 2.0F, 3.75F, 2.75F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition leftLeg = FullBody.addOrReplaceChild("leftLeg", CubeListBuilder.create().texOffs(0, 2).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(3.25F, 1.75F, -1.0F));

		PartDefinition LFoot = leftLeg.addOrReplaceChild("LFoot", CubeListBuilder.create(), PartPose.offset(0.0F, 7.0F, 0.75F));

		PartDefinition cube_r13 = LFoot.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(14, 24).addBox(-0.4F, -0.25F, 2.15F, 1.05F, 1.75F, 0.65F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.0F, 1.25F, 2.4F, 0.3F, 1.5F, 0.4F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5F, 0.25F, -1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r14 = LFoot.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 0).addBox(-0.2F, 1.0F, 2.4F, 0.3F, 1.75F, 0.4F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5F, 0.25F, -1.5708F, 0.2618F, 0.0F));

		PartDefinition cube_r15 = LFoot.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 0).addBox(0.2F, 1.0F, 2.4F, 0.3F, 1.75F, 0.4F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5F, 0.25F, -1.5708F, -0.2618F, 0.0F));

		PartDefinition LMidLeg = leftLeg.addOrReplaceChild("LMidLeg", CubeListBuilder.create(), PartPose.offset(0.0F, 4.5F, 2.0F));

		PartDefinition cube_r16 = LMidLeg.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(36, 31).addBox(-0.4F, -1.25F, 0.4F, 1.05F, 3.5F, 1.15F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition LTopLeg = leftLeg.addOrReplaceChild("LTopLeg", CubeListBuilder.create(), PartPose.offset(0.25F, 2.0F, 0.5F));

		PartDefinition cube_r17 = LTopLeg.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(35, 25).addBox(-1.0F, -1.75F, -1.5F, 2.25F, 2.5F, 2.75F, new CubeDeformation(0.0F))
		.texOffs(16, 32).addBox(-0.75F, 0.25F, -1.0F, 1.75F, 2.0F, 1.75F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.25F, 0.5F, 0.5F, 0.4363F, 0.0F, 0.0F));

		PartDefinition RightLeg = FullBody.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -3.0F, -2.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.5F, 3.75F, 0.0F));

		PartDefinition RFoot = RightLeg.addOrReplaceChild("RFoot", CubeListBuilder.create(), PartPose.offset(0.0F, 5.0F, -0.25F));

		PartDefinition cube_r18 = RFoot.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(12, 17).addBox(-0.4F, -0.25F, 2.15F, 1.05F, 1.75F, 0.65F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.0F, 1.25F, 2.4F, 0.3F, 1.5F, 0.4F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5F, 0.25F, -1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r19 = RFoot.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 0).addBox(0.2F, 1.0F, 2.4F, 0.3F, 1.75F, 0.4F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5F, 0.25F, -1.5708F, -0.2618F, 0.0F));

		PartDefinition cube_r20 = RFoot.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 0).addBox(-0.2F, 1.0F, 2.4F, 0.3F, 1.75F, 0.4F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5F, 0.25F, -1.5708F, 0.2618F, 0.0F));

		PartDefinition RMidLeg = RightLeg.addOrReplaceChild("RMidLeg", CubeListBuilder.create(), PartPose.offset(28.5F, 3.75F, 2.5F));

		PartDefinition cube_r21 = RMidLeg.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(8, 17).addBox(-0.4F, -1.25F, 0.4F, 1.05F, 3.5F, 1.15F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-28.5F, -1.25F, -2.5F, -0.5236F, 0.0F, 0.0F));

		PartDefinition RTopleg = RightLeg.addOrReplaceChild("RTopleg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.5F, 0.0F));

		PartDefinition cube_r22 = RTopleg.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(34, 18).addBox(-1.0F, -1.75F, -1.5F, 2.25F, 2.5F, 2.75F, new CubeDeformation(0.0F))
		.texOffs(6, 29).addBox(-0.75F, 0.25F, -1.0F, 1.75F, 2.0F, 1.75F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4363F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		FullBody.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return FullBody;
	}
}