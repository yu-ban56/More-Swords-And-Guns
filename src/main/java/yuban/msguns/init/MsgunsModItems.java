
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package yuban.msguns.init;

import yuban.msguns.item.ZincSwordItem;
import yuban.msguns.item.ZincShovelItem;
import yuban.msguns.item.ZincPickaxeItem;
import yuban.msguns.item.ZincIngotItem;
import yuban.msguns.item.ZincHoeItem;
import yuban.msguns.item.ZincAxeItem;
import yuban.msguns.item.ZincArmorItem;
import yuban.msguns.item.YellowCakeItem;
import yuban.msguns.item.UraniumPelletItem;
import yuban.msguns.item.UraniumDustItem;
import yuban.msguns.item.Uranium238Item;
import yuban.msguns.item.SteelIngotItem;
import yuban.msguns.item.SniperRifleItem;
import yuban.msguns.item.SniperBulletLauncherItem;
import yuban.msguns.item.SniperBulletItem;
import yuban.msguns.item.PlutoniumItem;
import yuban.msguns.item.NuclearWasteItem;
import yuban.msguns.item.NuclearRifleItem;
import yuban.msguns.item.NihoniumItem;
import yuban.msguns.item.NeutronLauncherItem;
import yuban.msguns.item.LeadIngotItem;
import yuban.msguns.item.LeadArmorItem;
import yuban.msguns.item.IodineTabletItem;
import yuban.msguns.item.IodineDustItem;
import yuban.msguns.item.GunRodItem;
import yuban.msguns.item.FusionEngineItem;
import yuban.msguns.item.FluoriteItem;
import yuban.msguns.item.FluoriteDustItem;
import yuban.msguns.item.EnergyGunItem;
import yuban.msguns.item.EmptyBulletItem;
import yuban.msguns.item.ChainsawItem;
import yuban.msguns.item.BismuthSwordItem;
import yuban.msguns.item.BismuthShovelItem;
import yuban.msguns.item.BismuthPickaxeItem;
import yuban.msguns.item.BismuthIngotItem;
import yuban.msguns.item.BismuthHoeItem;
import yuban.msguns.item.BismuthAxeItem;
import yuban.msguns.item.BismuthArmorItem;
import yuban.msguns.item.ArrowBowItem;
import yuban.msguns.item.AirRifleItem;
import yuban.msguns.MsgunsMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

public class MsgunsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MsgunsMod.MODID);
	public static final RegistryObject<Item> SNIPER_BULLET = REGISTRY.register("sniper_bullet", () -> new SniperBulletItem());
	public static final RegistryObject<Item> CHAINSAW = REGISTRY.register("chainsaw", () -> new ChainsawItem());
	public static final RegistryObject<Item> SNIPER_RIFLE = REGISTRY.register("sniper_rifle", () -> new SniperRifleItem());
	public static final RegistryObject<Item> EMPTY_BULLET = REGISTRY.register("empty_bullet", () -> new EmptyBulletItem());
	public static final RegistryObject<Item> URANIUM_BLOCK = block(MsgunsModBlocks.URANIUM_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> URANIUM_ORE = block(MsgunsModBlocks.URANIUM_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> URANIUM_DUST = REGISTRY.register("uranium_dust", () -> new UraniumDustItem());
	public static final RegistryObject<Item> NUCLEAR_RIFLE = REGISTRY.register("nuclear_rifle", () -> new NuclearRifleItem());
	public static final RegistryObject<Item> YELLOW_CAKE = REGISTRY.register("yellow_cake", () -> new YellowCakeItem());
	public static final RegistryObject<Item> URANIUM_PELLET = REGISTRY.register("uranium_pellet", () -> new UraniumPelletItem());
	public static final RegistryObject<Item> FLUORITE_ORE = block(MsgunsModBlocks.FLUORITE_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> FLUORITE_BLOCK = block(MsgunsModBlocks.FLUORITE_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> FLUORITE = REGISTRY.register("fluorite", () -> new FluoriteItem());
	public static final RegistryObject<Item> FLUORITE_DUST = REGISTRY.register("fluorite_dust", () -> new FluoriteDustItem());
	public static final RegistryObject<Item> ENERGY_GUN = REGISTRY.register("energy_gun", () -> new EnergyGunItem());
	public static final RegistryObject<Item> LEAD_ORE = block(MsgunsModBlocks.LEAD_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> LEAD_BLOCK = block(MsgunsModBlocks.LEAD_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> LEAD_INGOT = REGISTRY.register("lead_ingot", () -> new LeadIngotItem());
	public static final RegistryObject<Item> LEAD_ARMOR_HELMET = REGISTRY.register("lead_armor_helmet", () -> new LeadArmorItem.Helmet());
	public static final RegistryObject<Item> LEAD_ARMOR_CHESTPLATE = REGISTRY.register("lead_armor_chestplate", () -> new LeadArmorItem.Chestplate());
	public static final RegistryObject<Item> LEAD_ARMOR_LEGGINGS = REGISTRY.register("lead_armor_leggings", () -> new LeadArmorItem.Leggings());
	public static final RegistryObject<Item> LEAD_ARMOR_BOOTS = REGISTRY.register("lead_armor_boots", () -> new LeadArmorItem.Boots());
	public static final RegistryObject<Item> NUCLEAR_AIR = block(MsgunsModBlocks.NUCLEAR_AIR, null);
	public static final RegistryObject<Item> AIR_RIFLE = REGISTRY.register("air_rifle", () -> new AirRifleItem());
	public static final RegistryObject<Item> ARROW_BOW = REGISTRY.register("arrow_bow", () -> new ArrowBowItem());
	public static final RegistryObject<Item> GUN_ROD = REGISTRY.register("gun_rod", () -> new GunRodItem());
	public static final RegistryObject<Item> STEEL_BLOCK = block(MsgunsModBlocks.STEEL_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> STEEL_INGOT = REGISTRY.register("steel_ingot", () -> new SteelIngotItem());
	public static final RegistryObject<Item> SNIPER_BULLET_LAUNCHER = REGISTRY.register("sniper_bullet_launcher", () -> new SniperBulletLauncherItem());
	public static final RegistryObject<Item> IODINE_TABLET = REGISTRY.register("iodine_tablet", () -> new IodineTabletItem());
	public static final RegistryObject<Item> IODINE_DUST = REGISTRY.register("iodine_dust", () -> new IodineDustItem());
	public static final RegistryObject<Item> FISSION_REACTOR = block(MsgunsModBlocks.FISSION_REACTOR, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> NUCLEAR_WASTE = REGISTRY.register("nuclear_waste", () -> new NuclearWasteItem());
	public static final RegistryObject<Item> URANIUM_238 = REGISTRY.register("uranium_238", () -> new Uranium238Item());
	public static final RegistryObject<Item> PLUTONIUM = REGISTRY.register("plutonium", () -> new PlutoniumItem());
	public static final RegistryObject<Item> NEUTRON_LAUNCHER = REGISTRY.register("neutron_launcher", () -> new NeutronLauncherItem());
	public static final RegistryObject<Item> ZINC_ARMOR_HELMET = REGISTRY.register("zinc_armor_helmet", () -> new ZincArmorItem.Helmet());
	public static final RegistryObject<Item> ZINC_ARMOR_CHESTPLATE = REGISTRY.register("zinc_armor_chestplate", () -> new ZincArmorItem.Chestplate());
	public static final RegistryObject<Item> ZINC_ARMOR_LEGGINGS = REGISTRY.register("zinc_armor_leggings", () -> new ZincArmorItem.Leggings());
	public static final RegistryObject<Item> ZINC_ARMOR_BOOTS = REGISTRY.register("zinc_armor_boots", () -> new ZincArmorItem.Boots());
	public static final RegistryObject<Item> BISMUTH_ARMOR_HELMET = REGISTRY.register("bismuth_armor_helmet", () -> new BismuthArmorItem.Helmet());
	public static final RegistryObject<Item> BISMUTH_ARMOR_CHESTPLATE = REGISTRY.register("bismuth_armor_chestplate", () -> new BismuthArmorItem.Chestplate());
	public static final RegistryObject<Item> BISMUTH_ARMOR_LEGGINGS = REGISTRY.register("bismuth_armor_leggings", () -> new BismuthArmorItem.Leggings());
	public static final RegistryObject<Item> BISMUTH_ARMOR_BOOTS = REGISTRY.register("bismuth_armor_boots", () -> new BismuthArmorItem.Boots());
	public static final RegistryObject<Item> ZINC_ORE = block(MsgunsModBlocks.ZINC_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ZINC_BLOCK = block(MsgunsModBlocks.ZINC_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BISMUTH_ORE = block(MsgunsModBlocks.BISMUTH_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BISMUTH_BLOCK = block(MsgunsModBlocks.BISMUTH_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ZINC_INGOT = REGISTRY.register("zinc_ingot", () -> new ZincIngotItem());
	public static final RegistryObject<Item> BISMUTH_INGOT = REGISTRY.register("bismuth_ingot", () -> new BismuthIngotItem());
	public static final RegistryObject<Item> ZINC_PICKAXE = REGISTRY.register("zinc_pickaxe", () -> new ZincPickaxeItem());
	public static final RegistryObject<Item> ZINC_AXE = REGISTRY.register("zinc_axe", () -> new ZincAxeItem());
	public static final RegistryObject<Item> ZINC_SWORD = REGISTRY.register("zinc_sword", () -> new ZincSwordItem());
	public static final RegistryObject<Item> ZINC_SHOVEL = REGISTRY.register("zinc_shovel", () -> new ZincShovelItem());
	public static final RegistryObject<Item> ZINC_HOE = REGISTRY.register("zinc_hoe", () -> new ZincHoeItem());
	public static final RegistryObject<Item> BISMUTH_PICKAXE = REGISTRY.register("bismuth_pickaxe", () -> new BismuthPickaxeItem());
	public static final RegistryObject<Item> BISMUTH_AXE = REGISTRY.register("bismuth_axe", () -> new BismuthAxeItem());
	public static final RegistryObject<Item> BISMUTH_SWORD = REGISTRY.register("bismuth_sword", () -> new BismuthSwordItem());
	public static final RegistryObject<Item> BISMUTH_SHOVEL = REGISTRY.register("bismuth_shovel", () -> new BismuthShovelItem());
	public static final RegistryObject<Item> BISMUTH_HOE = REGISTRY.register("bismuth_hoe", () -> new BismuthHoeItem());
	public static final RegistryObject<Item> NIHONIUM = REGISTRY.register("nihonium", () -> new NihoniumItem());
	public static final RegistryObject<Item> FUSION_ENGINE = REGISTRY.register("fusion_engine", () -> new FusionEngineItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
