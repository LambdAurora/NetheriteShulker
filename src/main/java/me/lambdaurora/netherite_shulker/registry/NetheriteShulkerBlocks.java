/*
 * Copyright © 2020 LambdAurora <aurora42lambda@gmail.com>
 *
 * This file is part of NetheriteShulker.
 *
 * Licensed under the MIT license. For more information,
 * see the LICENSE file.
 */

package me.lambdaurora.netherite_shulker.registry;

import me.lambdaurora.netherite_shulker.NetheriteShulker;
import me.lambdaurora.netherite_shulker.block.NetheriteShulkerBoxBlock;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

/**
 * Represents the NetheriteShulker blocks.
 */
public class NetheriteShulkerBlocks
{
    public static final NetheriteShulkerBoxBlock NETHERITE_SHULKER_BOX = register("netherite_shulker_box", new NetheriteShulkerBoxBlock(null, FabricBlockSettings.of(Material.SHULKER_BOX).strength(2.0F, 2.0F).dynamicBounds().nonOpaque().build()));

    private static <I extends Block> I register(String name, I item)
    {
        return Registry.register(Registry.BLOCK, new Identifier(NetheriteShulker.NAMESPACE, name), item);
    }

    public static void init()
    {
        // NO-OP
    }
}
