
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package yuban.msguns.init;

import yuban.msguns.entity.SniperRifleEntity;
import yuban.msguns.entity.NuclearRifleEntity;
import yuban.msguns.entity.EnergyGunEntity;
import yuban.msguns.entity.ArrowBowEntity;
import yuban.msguns.entity.AirRifleEntity;
import yuban.msguns.MsgunsMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MsgunsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MsgunsMod.MODID);
	public static final RegistryObject<EntityType<SniperRifleEntity>> SNIPER_RIFLE = register("projectile_sniper_rifle",
			EntityType.Builder.<SniperRifleEntity>of(SniperRifleEntity::new, MobCategory.MISC).setCustomClientFactory(SniperRifleEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<NuclearRifleEntity>> NUCLEAR_RIFLE = register("projectile_nuclear_rifle",
			EntityType.Builder.<NuclearRifleEntity>of(NuclearRifleEntity::new, MobCategory.MISC).setCustomClientFactory(NuclearRifleEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<EnergyGunEntity>> ENERGY_GUN = register("projectile_energy_gun",
			EntityType.Builder.<EnergyGunEntity>of(EnergyGunEntity::new, MobCategory.MISC).setCustomClientFactory(EnergyGunEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<AirRifleEntity>> AIR_RIFLE = register("projectile_air_rifle",
			EntityType.Builder.<AirRifleEntity>of(AirRifleEntity::new, MobCategory.MISC).setCustomClientFactory(AirRifleEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ArrowBowEntity>> ARROW_BOW = register("projectile_arrow_bow",
			EntityType.Builder.<ArrowBowEntity>of(ArrowBowEntity::new, MobCategory.MISC).setCustomClientFactory(ArrowBowEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
	}
}
