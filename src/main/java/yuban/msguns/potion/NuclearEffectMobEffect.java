
package yuban.msguns.potion;

import yuban.msguns.procedures.NuclearEffectposiyonXiaoGuogaQieretaShiProcedure;
import yuban.msguns.procedures.NuclearEffectehuekutogaYouXiaoShinoteitukuProcedure;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class NuclearEffectMobEffect extends MobEffect {
	public NuclearEffectMobEffect() {
		super(MobEffectCategory.HARMFUL, -16711936);
	}

	@Override
	public String getDescriptionId() {
		return "effect.msguns.nuclear_effect";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		NuclearEffectehuekutogaYouXiaoShinoteitukuProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		NuclearEffectposiyonXiaoGuogaQieretaShiProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
