
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package yuban.msguns.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MsgunsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(MsgunsModEntities.SNIPER_RIFLE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MsgunsModEntities.NUCLEAR_RIFLE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MsgunsModEntities.ENERGY_GUN.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MsgunsModEntities.AIR_RIFLE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MsgunsModEntities.ARROW_BOW.get(), ThrownItemRenderer::new);
	}
}
