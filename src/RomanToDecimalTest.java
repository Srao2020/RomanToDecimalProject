import static org.junit.Assert.*;

public class RomanToDecimalTest {

    @org.junit.Test
    public void romanToDecimal() {
        // valid
        assertEquals(RomanToDecimal.romanToDecimal("XIV"), 14);
        assertEquals(RomanToDecimal.romanToDecimal("IX"), 9);
        assertEquals(RomanToDecimal.romanToDecimal("IV"), 4);
        assertEquals(RomanToDecimal.romanToDecimal("XL"), 40);
        assertEquals(RomanToDecimal.romanToDecimal("XC"), 90);
        assertEquals(RomanToDecimal.romanToDecimal("CD"), 400);
        assertEquals(RomanToDecimal.romanToDecimal("CM"), 900);
        assertEquals(RomanToDecimal.romanToDecimal("XCIV"), 94);
        assertEquals(RomanToDecimal.romanToDecimal("xciv"), 94);
        assertEquals(RomanToDecimal.romanToDecimal("XIX"), 19);
        // invalid
        assertEquals(RomanToDecimal.romanToDecimal("hi mom"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("HXI"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("THISISCOOL"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("PIGS CAN FLYYYYY"), -1);
        // logically incorrect
        assertEquals(RomanToDecimal.romanToDecimal("IVIVIV"), 16);
        assertEquals(RomanToDecimal.romanToDecimal("IIIVX"), 16);
        assertEquals(RomanToDecimal.romanToDecimal("MCXCXI"), 1201);
        assertEquals(RomanToDecimal.romanToDecimal("XCMVI"), 896);


        assertNotEquals(RomanToDecimal.romanToDecimal("your mom"), 100);
        assertNotEquals(RomanToDecimal.romanToDecimal("ix"), 50);
    }
}