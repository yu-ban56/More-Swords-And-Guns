package yuban.msguns.procedures;

import yuban.msguns.init.MsgunsModMobEffects;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class IodineTabletYoukuritukusitatokiProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MsgunsModMobEffects.NUCLEAR_EFFECT.get()) : false) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "effect clear @s msguns:nuclear_effect");
				}
			}
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MsgunsModMobEffects.NUCLEAR_EFFECT.get(),
						(int) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MsgunsModMobEffects.NUCLEAR_EFFECT.get()) ? _livEnt.getEffect(MsgunsModMobEffects.NUCLEAR_EFFECT.get()).getDuration() : 0) - 80), 1, (false), (false)));
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "clear @s msguns:iodine_tablet 1");
				}
			}
		}
	}
}
