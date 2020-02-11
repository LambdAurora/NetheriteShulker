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
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

/**
 * Represents the NetheriteShulker items.
 */
public class NetheriteShulkerItems
{
    private static final Item.Settings NETHERITE_SHULKER_SETTINGS = new Item.Settings().maxCount(1).fireproof().group(ItemGroup.DECORATIONS);
    public static final  BlockItem     NETHERITE_SHULKER_BOX      = register("netherite_shulker_box", new BlockItem(NetheriteShulkerBlocks.NETHERITE_SHULKER_BOX, NETHERITE_SHULKER_SETTINGS));

    private static <I extends Item> I register(String name, I item)
    {
        return Registry.register(Registry.ITEM, new Identifier(NetheriteShulker.NAMESPACE, name), item);
    }

    public static void init()
    {
        // NO-OP
    }
}
