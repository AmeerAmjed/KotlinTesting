import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MainKtTest {

    @Test
    fun should_ReturnRercentageLetterA_When_ListHaveLetterA_Test1() {

        // give a list
        val testList: List<String> =listOf("d", "b", "c")

        //when
        val result: Any = percentageLetterA(testList)
        val executionResult: Int = -1

        //then
        assertEquals(executionResult, result)
    }

    @Test
    fun should_ReturnRercentageLetterA_When_ListHaveLetterA_Test2() {

        // give a list
        val testList: List<String> =listOf("aa", "b", "c")

        //when
        val result: Any = percentageLetterA(testList)
        val executionResult: Int = -1

        //then
        assertEquals(executionResult, result)

    }

    @Test
    fun should_ReturnRercentageLetterA_When_ListHaveLetterA_Test3() {

        // give a list
        val testList: List<String> =listOf("a", "b", "c")

        //when
        val result: Any = percentageLetterA(testList)
        val executionResult: Double = 33.3

        //then
        assertEquals(executionResult, result)

    }

    @Test
    fun should_ReturnRercentageLetterA_When_ListHaveLetterA_Test4() {

        // give a list
        val testList: List<String> =listOf("a", "a", "g","gf")

        //when
        val result: Any = percentageLetterA(testList)
        val executionResult: Int = -1

        //then
        assertEquals(executionResult, result)

    }

    @Test
    fun should_ReturnRercentageLetterA_When_ListHaveLetterA_Test5() {

        // give a list
        var testList: List<String> =listOf("a", "a", "g","b")

        //when
        var result: Any = percentageLetterA(testList)
        val executionResult: Double = 66.7
        //then
        assertEquals(executionResult, result)

    }

    @Test
    fun should_ReturnRercentageLetterA_When_ListHaveLetterA_Test6() {

        // give a list
        var testList: List<String> =listOf("0", "1", "2","3")

        //when
        var result: Any = percentageLetterA(testList)
        val executionResult: Int = -1
        //then
        assertEquals(executionResult, result)

    }
}