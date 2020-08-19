package co.uzzu.gtool

import kotlin.test.Test
import kotlin.test.assertEquals

class LibraryTest {
    @Test fun testSomeLibraryMethod() {
        val classUnderTest = Library()
        assertEquals("something", classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'something'")
    }
}
