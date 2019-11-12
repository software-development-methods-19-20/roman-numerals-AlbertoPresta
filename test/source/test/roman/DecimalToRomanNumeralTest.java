package test.roman;

import dssc.roman.Romannumeral;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertion.assertEquals;
public class DecimalToRomanNumeralTest {


    @Test
    void zeroIsEmptyString(){
        RomanNumeral romanNumeral = new RomanNumeral(0);
        assertEquals("",romanNumeral.toString());
    }

}
