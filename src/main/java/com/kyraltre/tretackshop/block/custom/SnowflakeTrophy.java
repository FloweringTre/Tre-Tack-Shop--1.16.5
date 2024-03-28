package com.kyraltre.tretackshop.block.custom;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class SnowflakeTrophy extends Block {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public SnowflakeTrophy(AbstractBlock.Properties pProperties) {
        super(pProperties);
    }

    public static final VoxelShape SHAPE = Block.makeCuboidShape(6, 0, 6, 10, 15, 10);

    @Override
    public VoxelShape getShape(BlockState pState, IBlockReader pLevel, BlockPos pPos, ISelectionContext pContext) {
        return SHAPE;
    }

    /* FACING CODE FROM FURNACE*/
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext pContext) {
        return this.getDefaultState().with(FACING, pContext.getPlacementHorizontalFacing().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState pState, Rotation pRotation) {
        return pState.with(FACING, pRotation.rotate(pState.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState pState, Mirror pMirror) {
        return pState.rotate(pMirror.toRotation(pState.get(FACING)));
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(FACING);
    }

}
