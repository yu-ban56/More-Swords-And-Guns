
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package yuban.msguns.init;

import yuban.msguns.world.features.ores.ZincOreFeature;
import yuban.msguns.world.features.ores.UraniumOreFeature;
import yuban.msguns.world.features.ores.LeadOreFeature;
import yuban.msguns.world.features.ores.FluoriteOreFeature;
import yuban.msguns.world.features.ores.BismuthOreFeature;
import yuban.msguns.MsgunsMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

@Mod.EventBusSubscriber
public class MsgunsModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, MsgunsMod.MODID);
	public static final RegistryObject<Feature<?>> URANIUM_ORE = REGISTRY.register("uranium_ore", UraniumOreFeature::feature);
	public static final RegistryObject<Feature<?>> FLUORITE_ORE = REGISTRY.register("fluorite_ore", FluoriteOreFeature::feature);
	public static final RegistryObject<Feature<?>> LEAD_ORE = REGISTRY.register("lead_ore", LeadOreFeature::feature);
	public static final RegistryObject<Feature<?>> ZINC_ORE = REGISTRY.register("zinc_ore", ZincOreFeature::feature);
	public static final RegistryObject<Feature<?>> BISMUTH_ORE = REGISTRY.register("bismuth_ore", BismuthOreFeature::feature);
}
