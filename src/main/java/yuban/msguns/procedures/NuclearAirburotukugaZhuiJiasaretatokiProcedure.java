package yuban.msguns.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class NuclearAirburotukugaZhuiJiasaretatokiProcedure {
	private static int blocks;
	static {
		blocks = 0;
	}
	public static void execute(LevelAccessor world, double x, double y, double z) {
		et();
		Thread t = new Thread(() -> {
		try{
			Thread.sleep(3600000);
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			minus();
		}catch(Exception e){e.printStackTrace();}
		});
		t.setName("Nuclear Air Worker" + blocks);
		t.start();
	}

	private static void minus() {
		blocks--;
	}

	private static void et()
	{blocks++;
	}
}
