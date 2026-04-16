/*
 * Copyright 2025-2026 FrozenBlock
 * This file is part of Trailier Tales.
 *
 * This program is free software; you can modify it under
 * the terms of version 1 of the FrozenBlock Modding Oasis License
 * as published by FrozenBlock Modding Oasis.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * FrozenBlock Modding Oasis License for more details.
 *
 * You should have received a copy of the FrozenBlock Modding Oasis License
 * along with this program; if not, see <https://github.com/FrozenBlock/Licenses>.
 */

package net.frozenblock.trailiertales.registry;

import java.util.function.BiConsumer;
import net.frozenblock.lib.item.impl.sherd.DecoratedPotPatternRegistryEntrypoint;
import net.frozenblock.trailiertales.TTConstants;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.entity.DecoratedPotPattern;

public final class TTDecoratedPotPatternRegistry implements DecoratedPotPatternRegistryEntrypoint {
	public static final ResourceKey<DecoratedPotPattern> AURORA = create("aurora");
	public static final ResourceKey<DecoratedPotPattern> BAIT = create("bait");
	public static final ResourceKey<DecoratedPotPattern> BLOOM = create("bloom");
	public static final ResourceKey<DecoratedPotPattern> BOLT = create("bolt");
	public static final ResourceKey<DecoratedPotPattern> BULLSEYE = create("bullseye");
	public static final ResourceKey<DecoratedPotPattern> CARRIER = create("carrier");
	public static final ResourceKey<DecoratedPotPattern> CLUCK = create("cluck");
	public static final ResourceKey<DecoratedPotPattern> CRAWL = create("crawl");
	public static final ResourceKey<DecoratedPotPattern> CRESCENT = create("crescent");
	public static final ResourceKey<DecoratedPotPattern> CULTIVATOR = create("cultivator");
	public static final ResourceKey<DecoratedPotPattern> DROUGHT = create("drought");
	public static final ResourceKey<DecoratedPotPattern> ENCLOSURE = create("enclosure");
	public static final ResourceKey<DecoratedPotPattern> ESSENCE = create("essence");
	public static final ResourceKey<DecoratedPotPattern> EYE = create("eye");
	public static final ResourceKey<DecoratedPotPattern> FOCUS = create("focus");
	public static final ResourceKey<DecoratedPotPattern> FROST = create("frost");
	public static final ResourceKey<DecoratedPotPattern> HARE = create("hare");
	public static final ResourceKey<DecoratedPotPattern> HEIGHT = create("height");
	public static final ResourceKey<DecoratedPotPattern> HUMP = create("hump");
	public static final ResourceKey<DecoratedPotPattern> ILLUMINATOR = create("illuminator");
	public static final ResourceKey<DecoratedPotPattern> INCIDENCE = create("incidence");
	public static final ResourceKey<DecoratedPotPattern> LUMBER = create("lumber");
	public static final ResourceKey<DecoratedPotPattern> NAVIGATOR = create("navigator");
	public static final ResourceKey<DecoratedPotPattern> NEEDLES = create("needles");
	public static final ResourceKey<DecoratedPotPattern> OMEN = create("omen");
	public static final ResourceKey<DecoratedPotPattern> PLUME = create("plume");
	public static final ResourceKey<DecoratedPotPattern> PROTECTION = create("protection");
	public static final ResourceKey<DecoratedPotPattern> SHED = create("shed");
	public static final ResourceKey<DecoratedPotPattern> SHINE = create("shine");
	public static final ResourceKey<DecoratedPotPattern> SHOWER = create("shower");
	public static final ResourceKey<DecoratedPotPattern> SPADE = create("spade");
	public static final ResourceKey<DecoratedPotPattern> SPROUT = create("sprout");
	public static final ResourceKey<DecoratedPotPattern> VESSEL = create("vessel");
	public static final ResourceKey<DecoratedPotPattern> WITHER = create("wither");

	@Override
	public void itemToPatternMappings(BiConsumer<ResourceKey<Item>, ResourceKey<DecoratedPotPattern>> itemToPattern) {

	}

	@Override
	public void bootstrap(Registry<DecoratedPotPattern> registry) {
		register(registry, AURORA);
		register(registry, BAIT);
		register(registry, BLOOM);
		register(registry, BOLT);
		register(registry, BULLSEYE);
		register(registry, CARRIER);
		register(registry, CLUCK);
		register(registry, CRAWL);
		register(registry, CRESCENT);
		register(registry, CULTIVATOR);
		register(registry, DROUGHT);
		register(registry, ENCLOSURE);
		register(registry, ESSENCE);
		register(registry, EYE);
		register(registry, FOCUS);
		register(registry, FROST);
		register(registry, HARE);
		register(registry, HEIGHT);
		register(registry, HUMP);
		register(registry, ILLUMINATOR);
		register(registry, INCIDENCE);
		register(registry, LUMBER);
		register(registry, NAVIGATOR);
		register(registry, NEEDLES);
		register(registry, OMEN);
		register(registry, PLUME);
		register(registry, PROTECTION);
		register(registry, SHED);
		register(registry, SHINE);
		register(registry, SHOWER);
		register(registry, SPADE);
		register(registry, SPROUT);
		register(registry, VESSEL);
		register(registry, WITHER);
	}

	private static void register(Registry<DecoratedPotPattern> registry, ResourceKey<DecoratedPotPattern> pattern) {
		DecoratedPotPatternRegistryEntrypoint.register(
			registry,
			pattern,
			TTConstants.id(pattern.identifier().getPath() + "_pottery_pattern")
		);
	}

	private static ResourceKey<DecoratedPotPattern> create(String id) {
		return ResourceKey.create(Registries.DECORATED_POT_PATTERN, TTConstants.id(id));
	}

}
