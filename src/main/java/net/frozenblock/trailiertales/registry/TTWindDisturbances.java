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

import net.frozenblock.lib.wind.api.WindDisturbance;
import net.frozenblock.lib.wind.api.WindDisturbanceLogic;
import net.frozenblock.trailiertales.TTConstants;
import net.frozenblock.trailiertales.entity.Apparition;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Mth;
import net.minecraft.world.phys.Vec3;

public final class TTWindDisturbances {
	public static final Identifier APPARITION_WIND_DISTURBANCE = TTConstants.id("apparition");

	public static void init() {
		WindDisturbanceLogic.register(
			APPARITION_WIND_DISTURBANCE,
			(WindDisturbanceLogic.DisturbanceLogic<Apparition>) (source, level, origin, area, target) -> {
				if (source.isEmpty()) return null;

				final double distance = origin.distanceTo(target);
				if (distance > 6D) return null;

				final Vec3 differenceInPoses = origin.subtract(target);
				final double scaledDistance = (6D - distance) / 6D;
				final double strengthFromDistance = Mth.clamp((6D - distance) / 4.5D, 0D, 1D);
				final double x = scaledDistance * differenceInPoses.x * 0.3D;
				final double y = scaledDistance * differenceInPoses.y * 0.3D;
				final double z = scaledDistance * differenceInPoses.z * 0.3D;
				final Vec3 windVec = new Vec3(x, y, z);
				return new WindDisturbance.DisturbanceResult(strengthFromDistance, 6D - distance, windVec);
			}
		);
	}
}
