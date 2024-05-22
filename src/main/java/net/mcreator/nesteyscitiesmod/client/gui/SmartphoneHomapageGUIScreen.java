package net.mcreator.nesteyscitiesmod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;

import net.mcreator.nesteyscitiesmod.world.inventory.SmartphoneHomapageGUIMenu;
import net.mcreator.nesteyscitiesmod.network.SmartphoneHomapageGUIButtonMessage;
import net.mcreator.nesteyscitiesmod.UiMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class SmartphoneHomapageGUIScreen extends AbstractContainerScreen<SmartphoneHomapageGUIMenu> {
	private final static HashMap<String, Object> guistate = SmartphoneHomapageGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_contacts_icon;
	ImageButton imagebutton_group_1;
	ImageButton imagebutton_phone_icon;
	ImageButton imagebutton_browser_icon;

	public SmartphoneHomapageGUIScreen(SmartphoneHomapageGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("ui:textures/screens/smartphone_homapage_gui.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("ui:textures/screens/homepage_phone.png"));
		this.blit(ms, this.leftPos + -73, this.topPos + -20, 0, 0, 125, 175, 125, 175);

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
		imagebutton_contacts_icon = new ImageButton(this.leftPos + -46, this.topPos + -2, 25, 25, 0, 0, 25, new ResourceLocation("ui:textures/screens/atlas/imagebutton_contacts_icon.png"), 25, 50, e -> {
			if (true) {
				UiMod.PACKET_HANDLER.sendToServer(new SmartphoneHomapageGUIButtonMessage(0, x, y, z));
				SmartphoneHomapageGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_contacts_icon", imagebutton_contacts_icon);
		this.addRenderableWidget(imagebutton_contacts_icon);
		imagebutton_group_1 = new ImageButton(this.leftPos + -1, this.topPos + -2, 25, 25, 0, 0, 25, new ResourceLocation("ui:textures/screens/atlas/imagebutton_group_1.png"), 25, 50, e -> {
		});
		guistate.put("button:imagebutton_group_1", imagebutton_group_1);
		this.addRenderableWidget(imagebutton_group_1);
		imagebutton_phone_icon = new ImageButton(this.leftPos + -55, this.topPos + 34, 40, 40, 0, 0, 40, new ResourceLocation("ui:textures/screens/atlas/imagebutton_phone_icon.png"), 40, 80, e -> {
		});
		guistate.put("button:imagebutton_phone_icon", imagebutton_phone_icon);
		this.addRenderableWidget(imagebutton_phone_icon);
		imagebutton_browser_icon = new ImageButton(this.leftPos + -1, this.topPos + 43, 25, 25, 0, 0, 25, new ResourceLocation("ui:textures/screens/atlas/imagebutton_browser_icon.png"), 25, 50, e -> {
		});
		guistate.put("button:imagebutton_browser_icon", imagebutton_browser_icon);
		this.addRenderableWidget(imagebutton_browser_icon);
	}
}
