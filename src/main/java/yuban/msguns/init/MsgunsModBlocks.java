
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package yuban.msguns.init;

import yuban.msguns.block.ZincOreBlock;
import yuban.msguns.block.ZincBlockBlock;
import yuban.msguns.block.UraniumOreBlock;
import yuban.msguns.block.UraniumBlockBlock;
import yuban.msguns.block.SteelBlockBlock;
import yuban.msguns.block.NuclearAirBlock;
import yuban.msguns.block.LeadOreBlock;
import yuban.msguns.block.LeadBlockBlock;
import yuban.msguns.block.FluoriteOreBlock;
import yuban.msguns.block.FluoriteBlockBlock;
import yuban.msguns.block.FissionReactorBlock;
import yuban.msguns.block.BismuthOreBlock;
import yuban.msguns.block.BismuthBlockBlock;
import yuban.msguns.MsgunsMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class MsgunsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MsgunsMod.MODID);
	public static final RegistryObject<Block> URANIUM_BLOCK = REGISTRY.register("uranium_block", () -> new UraniumBlockBlock());
	public static final RegistryObject<Block> URANIUM_ORE = REGISTRY.register("uranium_ore", () -> new UraniumOreBlock());
	public static final RegistryObject<Block> FLUORITE_ORE = REGISTRY.register("fluorite_ore", () -> new FluoriteOreBlock());
	public static final RegistryObject<Block> FLUORITE_BLOCK = REGISTRY.register("fluorite_block", () -> new FluoriteBlockBlock());
	public static final RegistryObject<Block> LEAD_ORE = REGISTRY.register("lead_ore", () -> new LeadOreBlock());
	public static final RegistryObject<Block> LEAD_BLOCK = REGISTRY.register("lead_block", () -> new LeadBlockBlock());
	public static final RegistryObject<Block> NUCLEAR_AIR = REGISTRY.register("nuclear_air", () -> new NuclearAirBlock());
	public static final RegistryObject<Block> STEEL_BLOCK = REGISTRY.register("steel_block", () -> new SteelBlockBlock());
	public static final RegistryObject<Block> FISSION_REACTOR = REGISTRY.register("fission_reactor", () -> new FissionReactorBlock());
	public static final RegistryObject<Block> ZINC_ORE = REGISTRY.register("zinc_ore", () -> new ZincOreBlock());
	public static final RegistryObject<Block> ZINC_BLOCK = REGISTRY.register("zinc_block", () -> new ZincBlockBlock());
	public static final RegistryObject<Block> BISMUTH_ORE = REGISTRY.register("bismuth_ore", () -> new BismuthOreBlock());
	public static final RegistryObject<Block> BISMUTH_BLOCK = REGISTRY.register("bismuth_block", () -> new BismuthBlockBlock());
}
