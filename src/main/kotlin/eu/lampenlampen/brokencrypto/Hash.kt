package eu.lampenlampen.brokencrypto

import eu.lampenlampen.brokencrypto.hash.HashAlgorithm

object Hash {
	fun hash(alg: HashAlgorithm, data: ByteArray): ByteArray = alg.hash(data)
}