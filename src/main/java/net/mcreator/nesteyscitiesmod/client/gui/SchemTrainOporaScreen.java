package net.mcreator.nesteyscitiesmod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;

import net.mcreator.nesteyscitiesmod.world.inventory.SchemTrainOporaMenu;
import net.mcreator.nesteyscitiesmod.network.SchemTrainOporaButtonMessage;
import net.mcreator.nesteyscitiesmod.UiMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class SchemTrainOporaScreen extends AbstractContainerScreen<SchemTrainOporaMenu> {
	private final static HashMap<String, Object> guistate = SchemTrainOporaMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_empty;
	Button button_empty1;

	public SchemTrainOporaScreen(SchemTrainOporaMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("ui:textures/screens/schem_train_opora.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("ui:textures/screens/chiertiezh_zhd-opora_nalozhieniie.png"));
		this.blit(ms, this.leftPos + -158, this.topPos + -49, 0, 0, 316, 244, 316, 244);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
	}

	@Override
	public void init() {
		super.init();
		button_empty = Button.builder(Component.translatable("gui.ui.schem_train_opora.button_empty"), e -> {
			if (true) {
				UiMod.PACKET_HANDLER.sendToServer(new SchemTrainOporaButtonMessage(0, x, y, z));
				SchemTrainOporaButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 72, this.topPos + -19, 30, 20).build();
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
		button_empty1 = Button.builder(Component.translatable("gui.ui.schem_train_opora.button_empty1"), e -> {
		}).bounds(this.leftPos + 112, this.topPos + -19, 30, 20).build();
		guistate.put("button:button_empty1", button_empty1);
		this.addRenderableWidget(button_empty1);
	}
}
