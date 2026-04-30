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

import net.frozenblock.lib.block.sound.api.BlockSoundTypeOverwrites;
import net.frozenblock.trailiertales.config.TTBlockConfig;
import net.frozenblock.trailiertales.tag.TTBlockTags;

public final class TTBlockSoundTypeOverwrites {

	public static void init() {
		BlockSoundTypeOverwrites.addBlockTag(TTBlockTags.SOUND_UNPOLISHED_BRICKS, TTSounds.BRICKS, TTBlockConfig.UNPOLISHED_BRICKS_SOUNDS::get);
		BlockSoundTypeOverwrites.addBlockTag(TTBlockTags.SOUND_POLISHED_BRICKS, TTSounds.POLISHED_BRICKS, TTBlockConfig.POLISHED_BRICKS_SOUNDS::get);
		BlockSoundTypeOverwrites.addBlockTag(TTBlockTags.SOUND_POLISHED_CALCITE, TTSounds.POLISHED_CALCITE, TTBlockConfig.POLISHED_CALCITE_SOUNDS::get);
		BlockSoundTypeOverwrites.addBlockTag(TTBlockTags.SOUND_CALCITE_BRICKS, TTSounds.CALCITE_BRICKS_ALT, TTBlockConfig.CALCITE_BRICKS_SOUNDS::get);
		BlockSoundTypeOverwrites.addBlockTag(TTBlockTags.SOUND_POLISHED, TTSounds.POLISHED, TTBlockConfig.POLISHED_SOUNDS::get);
		BlockSoundTypeOverwrites.addBlockTag(TTBlockTags.SOUND_POLISHED_DEEPSLATE, TTSounds.POLISHED_DEEPSLATE, TTBlockConfig.POLISHED_DEEPSLATE_SOUNDS::get);
		BlockSoundTypeOverwrites.addBlockTag(TTBlockTags.SOUND_POLISHED_TUFF, TTSounds.POLISHED_TUFF, TTBlockConfig.POLISHED_TUFF_SOUNDS::get);
		BlockSoundTypeOverwrites.addBlockTag(TTBlockTags.SOUND_POLISHED_BASALT, TTSounds.POLISHED_BASALT, TTBlockConfig.POLISHED_BASALT_SOUNDS::get);
		BlockSoundTypeOverwrites.addBlockTag(TTBlockTags.SOUND_POLISHED_RESIN, TTSounds.POLISHED_RESIN, TTBlockConfig.POLISHED_SOUNDS::get);
	}
}
