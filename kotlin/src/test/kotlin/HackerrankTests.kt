import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class HackerrankTests {

    @ParameterizedTest
    @MethodSource("hackerRank01Data")
    fun test_hackerRank01(input: Array<Int>, output: Int) {
        Assertions.assertEquals(output, hackerRank01(input))
    }

    @ParameterizedTest
    @MethodSource("hackerRank02Data")
    fun test_hackerRank02(input: Int, output: String) {
        print(hackerRank02(input))
        Assertions.assertEquals(output, hackerRank02(input))
    }

    //not a real test
    @Test
    fun test_hackerRank03() {
        hackerRank03(arrayOf(1, 1, 1, 0, 0, 0, 0, -1 - 1 - 1))
    }

    @Test
    fun test_hackerRank04() {
        Assertions.assertEquals(arrayOf(1, 1).asList(), hackerRank04(arrayOf(5, 6, 7), arrayOf(3, 6, 10)).asList())
    }

    companion object {
        @JvmStatic
        fun hackerRank01Data() =
                listOf(
                        Arguments.of(arrayOf(1, 2, 3, 4), 1),
                        Arguments.of(arrayOf(1, 1, 1, 1), 4),
                        Arguments.of(emptyArray<Int>(), 0)
                )

        @JvmStatic
        fun hackerRank02Data() =
                listOf(
                        Arguments.of(1, "#"),
                        Arguments.of(2, " #\n##"),
                        Arguments.of(3, "  #\n ##\n###"),
                        Arguments.of(4, "   #\n  ##\n ###\n####")
                )
    }
}
