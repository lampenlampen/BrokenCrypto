package eu.lampenlampen.brokencrypto.hash

class SingleByteSum : HashAlgorithm {
	override fun hash(data: ByteArray): ByteArray {
		var acc : Byte = 0

		for (byte in data) {
			acc = (acc + byte).toByte()
		}

		return ByteArray(1) {acc}
 	}
}