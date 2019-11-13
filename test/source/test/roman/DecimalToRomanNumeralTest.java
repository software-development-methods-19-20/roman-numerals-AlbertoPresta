package test.roman;

import dssc.roman.RomanNumeral;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecimalToRomanNumeralTest {


    @Test
    void zeroIsEmptyString() {
        check(0, "");
    }

    @Test
    @Disabled
    void oneIsI() {
        check(1, "I");
    }

    @Test
    void twoIsII() {
        check(2, "II");
    }

    @Test
    @Disabled
    void threeisIII() {
        check(3, "III");
    }

    @Test
    void fiveIsV() {
        check(5, "V");
    }

    @Test
    void tenIsX() {
        check(10, "X");
    }

    @Test
    void fiftyIsL() {
        check(50, "L");
    }

    @Test
    void hundredIsC() {
        check(100, "C");
    }


    @Test
    void fivehudredIsD() {
        check(500, "D");

    }

    @Test
    void thousandisM() {
        check(1000, "M");
    }


    private void check(int decimal, String expected) {
        RomanNumeral romanNumeral = new RomanNumeral(decimal);
        assertEquals(expected, romanNumeral.toString());
    }



