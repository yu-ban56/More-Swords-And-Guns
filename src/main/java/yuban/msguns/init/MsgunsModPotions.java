
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package yuban.msguns.init;

import yuban.msguns.MsgunsMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

public class MsgunsModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, MsgunsMod.MODID);
	public static final RegistryObject<Potion> NUCLEAR_POTION = REGISTRY.register("nuclear_potion", () -> new Potion(new MobEffectInstance(MsgunsModMobEffects.NUCLEAR_EFFECT.get(), 1200, 0, false, true)));
}
