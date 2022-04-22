import eu.lampenlampen.brokencrypto.hash.SingleByteSum
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class SingleByteSumTest : FunSpec({
	test("Number: 1") {
		val expected = 1
		val hashAlg = SingleByteSum()

		val result = hashAlg.hash(ByteArray(1) { expected.toByte() })
		result[0].toInt() shouldBe expected
	}

	test("Number: 12") {
		val expected = 12
		val hashAlg = SingleByteSum()

		val result = hashAlg.hash(ByteArray(1) { expected.toByte() })
		result[0].toInt() shouldBe expected
	}

	test("Number: a") {
		val expected = "a"
		val input = expected.toByteArray(Charsets.US_ASCII)
		val hashAlg = SingleByteSum()

		val result = hashAlg.hash(input)
		result[0].toInt() shouldBe 97
	}

	test("Number: abc") {
		val expected = "abc"
		val input = expected.toByteArray(Charsets.US_ASCII)
		val hashAlg = SingleByteSum()

		val result = hashAlg.hash(input)
		result[0].toInt() shouldBe 38
	}
})