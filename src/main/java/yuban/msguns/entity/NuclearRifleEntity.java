
package yuban.msguns.entity;

import yuban.msguns.procedures.NuclearRifleFeibiDaoJugaenteiteiniDangtatutatokiProcedure;
import yuban.msguns.procedures.NuclearRifleFeibiDaoJugaburotukuniDangtatutatokiProcedure;
import yuban.msguns.init.MsgunsModItems;
import yuban.msguns.init.MsgunsModEntities;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.util.RandomSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class NuclearRifleEntity extends AbstractArrow implements ItemSupplier {
	public NuclearRifleEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(MsgunsModEntities.NUCLEAR_RIFLE.get(), world);
	}

	public NuclearRifleEntity(EntityType<? extends NuclearRifleEntity> type, Level world) {
		super(type, world);
	}

	public NuclearRifleEntity(EntityType<? extends NuclearRifleEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public NuclearRifleEntity(EntityType<? extends NuclearRifleEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(MsgunsModItems.URANIUM_DUST.get());
	}

	@Override
	protected ItemStack getPickupItem() {
		return new ItemStack(MsgunsModItems.URANIUM_DUST.get());
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void onHitEntity(EntityHitResult entityHitResult) {
		super.onHitEntity(entityHitResult);
		NuclearRifleFeibiDaoJugaenteiteiniDangtatutatokiProcedure.execute(entityHitResult.getEntity());
	}

	@Override
	public void onHitBlock(BlockHitResult blockHitResult) {
		super.onHitBlock(blockHitResult);
		NuclearRifleFeibiDaoJugaburotukuniDangtatutatokiProcedure.execute(this.level, blockHitResult.getBlockPos().getX(), blockHitResult.getBlockPos().getY(), blockHitResult.getBlockPos().getZ());
	}

	@Override
	public void tick() {
		super.tick();
		if (this.inGround)
			this.discard();
	}

	public static NuclearRifleEntity shoot(Level world, LivingEntity entity, RandomSource random, float power, double damage, int knockback) {
		NuclearRifleEntity entityarrow = new NuclearRifleEntity(MsgunsModEntities.NUCLEAR_RIFLE.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(true);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		entityarrow.setSecondsOnFire(100);
		world.addFreshEntity(entityarrow);
		world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.PLAYERS, 1, 1f / (random.nextFloat() * 0.5f + 1) + (power / 2));
		return entityarrow;
	}

	public static NuclearRifleEntity shoot(LivingEntity entity, LivingEntity target) {
		NuclearRifleEntity entityarrow = new NuclearRifleEntity(MsgunsModEntities.NUCLEAR_RIFLE.get(), entity, entity.level);
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 1.5f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(2);
		entityarrow.setKnockback(3);
		entityarrow.setCritArrow(true);
		entityarrow.setSecondsOnFire(100);
		entity.level.addFreshEntity(entityarrow);
		entity.level.playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.PLAYERS, 1, 1f / (RandomSource.create().nextFloat() * 0.5f + 1));
		return entityarrow;
	}
}
