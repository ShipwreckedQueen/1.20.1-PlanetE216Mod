package net.shipwreckfantasy.planete216.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class PortalCoreBlock extends Block  {
    public PortalCoreBlock(BlockBehaviour.Properties pProperties) {
        super(pProperties);
    }

    public VoxelShape getShape(BlockState p_273399_, BlockGetter p_273568_, BlockPos p_273314_, CollisionContext p_273274_) {
        return Block.box(6.0D, 0.0D, 6.0D, 10.0D, 16.0D, 10.0D);
    }

}


