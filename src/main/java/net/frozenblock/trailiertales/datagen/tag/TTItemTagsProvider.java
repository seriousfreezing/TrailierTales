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

package net.frozenblock.trailiertales.datagen.tag;

import java.util.concurrent.CompletableFuture;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.frozenblock.trailiertales.references.TTBlockItemIds;
import net.frozenblock.trailiertales.references.TTItemIds;
import net.frozenblock.trailiertales.tag.TTItemTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.references.ItemIds;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.BlockItemTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public final class TTItemTagsProvider extends FabricTagsProvider.ItemTagsProvider {

	public TTItemTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
		super(output, registries);
	}

	private TagKey<Item> getTag(String id) {
		return TagKey.create(this.registryKey, Identifier.parse(id));
	}

	@Override
	protected void addTags(HolderLookup.Provider arg) {
		this.builder(ConventionalItemTags.MUSIC_DISCS)
			.add(TTItemIds.MUSIC_DISC_STASIS)
			.add(TTItemIds.MUSIC_DISC_FAUSSE_VIE)
			.add(TTItemIds.MUSIC_DISC_OSSUAIRE);

		this.builder(BlockItemTags.SAND.item())
			.add(TTBlockItemIds.SUSPICIOUS_RED_SAND);

		this.builder(BlockItemTags.DIRT.item())
			.add(TTBlockItemIds.SUSPICIOUS_DIRT);

		this.builder(ItemTags.DECORATED_POT_SHERDS)
			.add(TTItemIds.AURORA_POTTERY_SHERD)
			.add(TTItemIds.BAIT_POTTERY_SHERD)
			.add(TTItemIds.BLOOM_POTTERY_SHERD)
			.add(TTItemIds.BOLT_POTTERY_SHERD)
			.add(TTItemIds.BULLSEYE_POTTERY_SHERD)
			.add(TTItemIds.CARRIER_POTTERY_SHERD)
			.add(TTItemIds.CLUCK_POTTERY_SHERD)
			.add(TTItemIds.CRAWL_POTTERY_SHERD)
			.add(TTItemIds.CRESCENT_POTTERY_SHERD)
			.add(TTItemIds.CULTIVATOR_POTTERY_SHERD)
			.add(TTItemIds.DROUGHT_POTTERY_SHERD)
			.add(TTItemIds.ENCLOSURE_POTTERY_SHERD)
			.add(TTItemIds.ESSENCE_POTTERY_SHERD)
			.add(TTItemIds.EYE_POTTERY_SHERD)
			.add(TTItemIds.FOCUS_POTTERY_SHERD)
			.add(TTItemIds.FROST_POTTERY_SHERD)
			.add(TTItemIds.HARE_POTTERY_SHERD)
			.add(TTItemIds.HEIGHT_POTTERY_SHERD)
			.add(TTItemIds.HUMP_POTTERY_SHERD)
			.add(TTItemIds.ILLUMINATOR_POTTERY_SHERD)
			.add(TTItemIds.INCIDENCE_POTTERY_SHERD)
			.add(TTItemIds.LUMBER_POTTERY_SHERD)
			.add(TTItemIds.NAVIGATOR_POTTERY_SHERD)
			.add(TTItemIds.NEEDLES_POTTERY_SHERD)
			.add(TTItemIds.OMEN_POTTERY_SHERD)
			.add(TTItemIds.PLUME_POTTERY_SHERD)
			.add(TTItemIds.PROTECTION_POTTERY_SHERD)
			.add(TTItemIds.SHED_POTTERY_SHERD)
			.add(TTItemIds.SHINE_POTTERY_SHERD)
			.add(TTItemIds.SHOWER_POTTERY_SHERD)
			.add(TTItemIds.SPADE_POTTERY_SHERD)
			.add(TTItemIds.SPROUT_POTTERY_SHERD)
			.add(TTItemIds.VESSEL_POTTERY_SHERD)
			.add(TTItemIds.WITHER_POTTERY_SHERD);

		this.builder(ItemTags.VILLAGER_PLANTABLE_SEEDS)
			.add(TTBlockItemIds.CYAN_ROSE_CROP)
			.add(TTBlockItemIds.MANEDROP_CROP)
			.add(TTBlockItemIds.GUZMANIA_CROP)
			.add(TTBlockItemIds.DAWNTRAIL_CROP)
			.add(TTBlockItemIds.LITHOPS_CROP);

		this.builder(ItemTags.CHICKEN_FOOD)
			.add(TTBlockItemIds.CYAN_ROSE_CROP)
			.add(TTBlockItemIds.GUZMANIA_CROP)
			.add(TTBlockItemIds.LITHOPS_CROP);

		this.builder(ItemTags.PARROT_FOOD)
			.add(TTBlockItemIds.CYAN_ROSE_CROP)
			.add(TTBlockItemIds.GUZMANIA_CROP)
			.add(TTBlockItemIds.LITHOPS_CROP);

		this.builder(ItemTags.SNIFFER_FOOD)
			.add(TTBlockItemIds.CYAN_ROSE_CROP)
			.add(TTBlockItemIds.MANEDROP_CROP)
			.add(TTBlockItemIds.GUZMANIA_CROP)
			.add(TTBlockItemIds.DAWNTRAIL_CROP)
			.add(TTBlockItemIds.LITHOPS_CROP);

		this.builder(BlockItemTags.SMALL_FLOWERS.item())
			.add(TTBlockItemIds.CYAN_ROSE)
			.add(TTBlockItemIds.DAWNTRAIL);

		this.builder(BlockItemTags.BEE_FOOD.item())
			.add(TTBlockItemIds.CYAN_ROSE)
			.add(TTBlockItemIds.MANEDROP)
			.add(TTBlockItemIds.GUZMANIA);

		this.builder(BlockItemTags.STAIRS.item())
			.add(TTBlockItemIds.GRANITE_BRICK_STAIRS)
			.add(TTBlockItemIds.MOSSY_GRANITE_BRICK_STAIRS)
			.add(TTBlockItemIds.DIORITE_BRICK_STAIRS)
			.add(TTBlockItemIds.MOSSY_DIORITE_BRICK_STAIRS)
			.add(TTBlockItemIds.ANDESITE_BRICK_STAIRS)
			.add(TTBlockItemIds.MOSSY_ANDESITE_BRICK_STAIRS)
			.add(TTBlockItemIds.CALCITE_STAIRS)
			.add(TTBlockItemIds.POLISHED_CALCITE_STAIRS)
			.add(TTBlockItemIds.CALCITE_BRICK_STAIRS)
			.add(TTBlockItemIds.MOSSY_CALCITE_BRICK_STAIRS)
			.add(TTBlockItemIds.MOSSY_TUFF_BRICK_STAIRS)
			.add(TTBlockItemIds.MOSSY_BRICK_STAIRS)
			.add(TTBlockItemIds.PALE_MOSSY_RESIN_BRICK_STAIRS)
			.add(TTBlockItemIds.MOSSY_COBBLED_DEEPSLATE_STAIRS)
			.add(TTBlockItemIds.MOSSY_DEEPSLATE_BRICK_STAIRS)
			.add(TTBlockItemIds.MOSSY_DEEPSLATE_TILE_STAIRS)
			.add(TTBlockItemIds.POLISHED_RESIN_STAIRS)
			.add(TTBlockItemIds.CUT_SANDSTONE_STAIRS)
			.add(TTBlockItemIds.CUT_RED_SANDSTONE_STAIRS)
			.add(TTBlockItemIds.CHORAL_END_STONE_STAIRS)
			.add(TTBlockItemIds.CHORAL_END_STONE_BRICK_STAIRS)
			.add(TTBlockItemIds.END_STONE_STAIRS);

		this.builder(BlockItemTags.SLABS.item())
			.add(TTBlockItemIds.GRANITE_BRICK_SLAB)
			.add(TTBlockItemIds.MOSSY_GRANITE_BRICK_SLAB)
			.add(TTBlockItemIds.DIORITE_BRICK_SLAB)
			.add(TTBlockItemIds.MOSSY_DIORITE_BRICK_SLAB)
			.add(TTBlockItemIds.ANDESITE_BRICK_SLAB)
			.add(TTBlockItemIds.MOSSY_ANDESITE_BRICK_SLAB)
			.add(TTBlockItemIds.CALCITE_SLAB)
			.add(TTBlockItemIds.POLISHED_CALCITE_SLAB)
			.add(TTBlockItemIds.CALCITE_BRICK_SLAB)
			.add(TTBlockItemIds.MOSSY_CALCITE_BRICK_SLAB)
			.add(TTBlockItemIds.MOSSY_TUFF_BRICK_SLAB)
			.add(TTBlockItemIds.MOSSY_BRICK_SLAB)
			.add(TTBlockItemIds.PALE_MOSSY_RESIN_BRICK_SLAB)
			.add(TTBlockItemIds.MOSSY_COBBLED_DEEPSLATE_SLAB)
			.add(TTBlockItemIds.MOSSY_DEEPSLATE_BRICK_SLAB)
			.add(TTBlockItemIds.MOSSY_DEEPSLATE_TILE_SLAB)
			.add(TTBlockItemIds.POLISHED_RESIN_SLAB)
			.add(TTBlockItemIds.CHORAL_END_STONE_SLAB)
			.add(TTBlockItemIds.CHORAL_END_STONE_BRICK_SLAB)
			.add(TTBlockItemIds.END_STONE_SLAB);

		this.builder(BlockItemTags.WALLS.item())
			.add(TTBlockItemIds.STONE_WALL)
			.add(TTBlockItemIds.GRANITE_BRICK_WALL)
			.add(TTBlockItemIds.MOSSY_GRANITE_BRICK_WALL)
			.add(TTBlockItemIds.DIORITE_BRICK_WALL)
			.add(TTBlockItemIds.MOSSY_DIORITE_BRICK_WALL)
			.add(TTBlockItemIds.ANDESITE_BRICK_WALL)
			.add(TTBlockItemIds.CALCITE_WALL)
			.add(TTBlockItemIds.POLISHED_CALCITE_WALL)
			.add(TTBlockItemIds.CALCITE_BRICK_WALL)
			.add(TTBlockItemIds.MOSSY_CALCITE_BRICK_WALL)
			.add(TTBlockItemIds.MOSSY_ANDESITE_BRICK_WALL)
			.add(TTBlockItemIds.MOSSY_TUFF_BRICK_WALL)
			.add(TTBlockItemIds.MOSSY_BRICK_WALL)
			.add(TTBlockItemIds.PALE_MOSSY_RESIN_BRICK_WALL)
			.add(TTBlockItemIds.MOSSY_COBBLED_DEEPSLATE_WALL)
			.add(TTBlockItemIds.MOSSY_DEEPSLATE_BRICK_WALL)
			.add(TTBlockItemIds.MOSSY_DEEPSLATE_TILE_WALL)
			.add(TTBlockItemIds.POLISHED_RESIN_WALL)
			.add(TTBlockItemIds.SMOOTH_SANDSTONE_WALL)
			.add(TTBlockItemIds.CUT_SANDSTONE_WALL)
			.add(TTBlockItemIds.SMOOTH_RED_SANDSTONE_WALL)
			.add(TTBlockItemIds.CUT_RED_SANDSTONE_WALL)
			.add(TTBlockItemIds.PRISMARINE_BRICK_WALL)
			.add(TTBlockItemIds.DARK_PRISMARINE_WALL)
			.add(TTBlockItemIds.CHORAL_END_STONE_BRICK_WALL)
			.add(TTBlockItemIds.CHORAL_END_STONE_WALL)
			.add(TTBlockItemIds.END_STONE_WALL)
			.add(TTBlockItemIds.PURPUR_WALL);

		this.builder(TTItemTags.BRUSH_ENCHANTABLE)
			.add(ItemIds.BRUSH);

		this.builder(ItemTags.DURABILITY_ENCHANTABLE)
			.add(ItemIds.BRUSH);
	}
}
