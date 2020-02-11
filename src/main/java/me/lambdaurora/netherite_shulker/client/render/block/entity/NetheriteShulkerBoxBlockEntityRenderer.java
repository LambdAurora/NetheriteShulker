/*
 * Copyright © 2020 LambdAurora <aurora42lambda@gmail.com>
 *
 * This file is part of NetheriteShulker.
 *
 * Licensed under the MIT license. For more information,
 * see the LICENSE file.
 */

package me.lambdaurora.netherite_shulker.client.render.block.entity;

import net.minecraft.block.entity.ShulkerBoxBlockEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher;
import net.minecraft.client.render.block.entity.ShulkerBoxBlockEntityRenderer;
import net.minecraft.client.render.entity.model.ShulkerEntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class NetheriteShulkerBoxBlockEntityRenderer extends ShulkerBoxBlockEntityRenderer
{
    public NetheriteShulkerBoxBlockEntityRenderer(ShulkerEntityModel<?> model, BlockEntityRenderDispatcher dispatcher)
    {
        super(model, dispatcher);
    }

    public void render(ShulkerBoxBlockEntity blockEntity, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {

    }
}
