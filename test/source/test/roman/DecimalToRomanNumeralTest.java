package test.roman;

import dssc.roman.RomanNumeral;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertion.assertEquals;
public class DecimalToRomanNumeralTest {


    @Test
    void zeroIsEmptyString(){
        RomanNumeral romanNumeral = new RomanNumeral(0);
        assertEquals("",romanNumeral.toString());
    }

    @Test

    void oneIsI(){
        RomanNumeral romanNumeral = new RomanNumeral(1);
        assertEquals("I",romanNumeral.toString());
    }
}
