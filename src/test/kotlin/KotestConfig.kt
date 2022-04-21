import io.kotest.core.config.AbstractProjectConfig

/**
 * Used by the testing framework
 */
@Suppress("unused")
object KotestConfig : AbstractProjectConfig() {
	override val parallelism = 3
}