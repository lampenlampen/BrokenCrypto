package eu.lampenlampen.brokencrypto.hash

interface HashAlgorithm {
	fun hash(data: ByteArray): ByteArray
}