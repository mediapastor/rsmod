package gg.rsmod.plugins.api.ext

import gg.rsmod.game.model.Tile
import gg.rsmod.game.model.World

/**
 * @author Tom <rspsmods@gmail.com>
 */

fun Tile.isMulti(world: World): Boolean {
    val region = toRegionId()
    val chunk = toChunkCoords().hashCode()
    return world.multiCombatChunks.contains(chunk) || world.multiCombatRegions.contains(region)
}