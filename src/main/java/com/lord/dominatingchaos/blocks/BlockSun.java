package com.lord.dominatingchaos.blocks;

import com.lord.dominatingchaos.tile.TileEntitySun;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class BlockSun extends Block implements ITileEntityProvider {

    public BlockSun() {
        super(Material.GLASS);

        setRegistryName("sun_block");
        setTranslationKey("sun_block");
        setLightLevel(1.0F);
        setBlockUnbreakable();
        setResistance(6000000.0F);
    }

    @Override
    public EnumBlockRenderType getRenderType(IBlockState state) {
        return EnumBlockRenderType.INVISIBLE;
    }

    @Nullable
    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntitySun();
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }
}