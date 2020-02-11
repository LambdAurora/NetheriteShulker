/*
 * Copyright © 2020 LambdAurora <aurora42lambda@gmail.com>
 *
 * This file is part of NetheriteShulker.
 *
 * Licensed under the MIT license. For more information,
 * see the LICENSE file.
 */

package me.lambdaurora.netherite_shulker;

import me.lambdaurora.netherite_shulker.registry.NetheriteShulkerItems;
import net.fabricmc.api.ModInitializer;

/**
 * Represents the NetheriteShulker mod.
 *
 * @author lambdaurora
 * @version 1.0.0
 * @since 1.0.0
 */
public class NetheriteShulker implements ModInitializer
{
    public static final String NAMESPACE = "netherite_shulker";

    @Override
    public void onInitialize()
    {
        NetheriteShulkerItems.init();
    }
}
