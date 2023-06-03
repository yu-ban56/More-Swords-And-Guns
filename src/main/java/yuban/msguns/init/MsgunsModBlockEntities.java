
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package yuban.msguns.init;

import yuban.msguns.block.entity.FissionReactorBlockEntity;
import yuban.msguns.MsgunsMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

public class MsgunsModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, MsgunsMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> FISSION_REACTOR = register("fission_reactor", MsgunsModBlocks.FISSION_REACTOR, FissionReactorBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
