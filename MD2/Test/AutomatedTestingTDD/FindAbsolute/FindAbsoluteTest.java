package AutomatedTestingTDD.FindAbsolute;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindAbsoluteTest {
    // viết test
    // viết mã để pass test case (class)
    // Refractor mã nguồn
    @Test
    void testFindAbsolute0() {
        int number = 0;
        int expected = 0;

        int result = FindAbsolute.findAbsolute(number);
        assertEquals(expected, result);

    }

    @Test
    void testFindAbsolute1() {
        int number = 1;
        int expected = 1;

        int result = FindAbsolute.findAbsolute(number);
        assertEquals(expected, result);

    }

    void testFindAbsoluteNegative1() {
        int number = -1;
        int expected = 1;

        int result = FindAbsolute.findAbsolute(number);
        assertEquals(expected, result);
    }
}