
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package yuban.msguns.init;

import yuban.msguns.world.inventory.FissionReactorGUIMenu;
import yuban.msguns.MsgunsMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

public class MsgunsModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, MsgunsMod.MODID);
	public static final RegistryObject<MenuType<FissionReactorGUIMenu>> FISSION_REACTOR_GUI = REGISTRY.register("fission_reactor_gui", () -> IForgeMenuType.create(FissionReactorGUIMenu::new));
}
