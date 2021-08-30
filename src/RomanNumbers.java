import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumbers {

    @Test
    void shouldConvert1ToI() {
        assertEquals("I", toRoman(1));
    }

    private String toRoman(int i){
        String out;
        if (i == 4){
            out = "IV";
        }
        else if (i == 5){
            out = "V";
        }
        else if (i == 6){
            out = "IV";
        }
        else if (i == 1){
           out = "I";
        } else if (i == 2){
            out = "II";
        } else if (i == 3){
            out = "III";
        } else {
            out = null;
        }
        return out;
    }


    private String toRomanLokke(int i){
        String out = "";

        for (int j = 0; j < i; j++) {
            out = out + "I";

        }
           return out;
        }


    @Test
    void shouldConvert2ToII (){
        assertEquals("II" , toRoman(2));
    }

    @Test
    void shouldConvert2ToIII (){
        assertEquals("III" , toRomanLokke(3));
    }

    @Test
    void shouldConvert2ToIv (){
        assertEquals("IV" , toRoman(4));
    }
    @Test
    void shouldConvert2ToV (){
        assertEquals("V" , toRoman(5));
    }

}
