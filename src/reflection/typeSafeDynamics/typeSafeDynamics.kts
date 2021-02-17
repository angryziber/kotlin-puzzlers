package reflection.typeSafeDynamics

import kotlin.reflect.full.memberProperties

fun <T: Any> T.toValues(): Map<String, Any?> = this::class.memberProperties.map { it.name to it.get(this) }.toMap()
