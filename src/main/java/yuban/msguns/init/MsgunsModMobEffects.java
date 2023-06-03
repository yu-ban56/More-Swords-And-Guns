
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package yuban.msguns.init;

import yuban.msguns.potion.NuclearEffectMobEffect;
import yuban.msguns.MsgunsMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

public class MsgunsModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, MsgunsMod.MODID);
	public static final RegistryObject<MobEffect> NUCLEAR_EFFECT = REGISTRY.register("nuclear_effect", () -> new NuclearEffectMobEffect());
}
