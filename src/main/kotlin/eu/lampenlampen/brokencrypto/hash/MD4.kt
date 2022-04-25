package eu.lampenlampen.brokencrypto.hash

class MD4 : HashAlgorithm {
	override fun hash(data: ByteArray): ByteArray {
		return Output(ProcessMessage(InitializeMDBuffer(AppendLength(AppendPaddingBits(data)))))
	}

	private fun AppendPaddingBits(data: ByteArray): ByteArray {
		val msgBits = data.size * 8
		val a = msgBits % 512

		if (a < 448) {
			// padd to 488 bits
			val missingBytes = a / 8

		}

	}

	private fun AppendLength(data: ByteArray): ByteArray {}

	private fun InitializeMDBuffer(data: ByteArray): ByteArray {}

	private fun ProcessMessage(data: ByteArray): ByteArray {}

	private fun Output(data: ByteArray): ByteArray {}

}