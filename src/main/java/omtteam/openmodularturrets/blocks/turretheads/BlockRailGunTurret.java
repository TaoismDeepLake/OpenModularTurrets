package omtteam.openmodularturrets.blocks.turretheads;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import omtteam.openmodularturrets.items.blocks.ItemBlockRailGunTurret;
import omtteam.openmodularturrets.reference.Names;
import omtteam.openmodularturrets.reference.Reference;
import omtteam.openmodularturrets.tileentity.turrets.RailGunTurretTileEntity;

import java.util.Random;

public class BlockRailGunTurret extends BlockAbstractTurretHead {
    public BlockRailGunTurret() {
        super();

        this.setUnlocalizedName(Names.Blocks.railGunTurret);
        this.setRegistryName(Reference.MOD_ID, Names.Blocks.railGunTurret);
    }

    @Override
    public ItemBlock getItemBlock(Block block) {
        return new ItemBlockRailGunTurret(block);
    }

    @Override
    public TileEntity createTileEntity(World world, IBlockState state) {
        return new RailGunTurretTileEntity();
    }

    @Override
    public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand) {
        for (int i = 0; i <= 5; i++) {
            Random random = new Random();
            worldIn.spawnParticle(EnumParticleTypes.REDSTONE, pos.getX() + (random.nextGaussian() / 10) + 0.5F, pos.getY(),
                    pos.getZ() + (random.nextGaussian() / 10) + 0.5F, (0), (50), (200));
        }
    }
}
