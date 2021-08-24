import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumbers {

    @Test
    void shouldConvert1ToI() {
        assertEquals("I", toRoman(1));
    }

    private String toRoman(int i){
        return "I";
    }


}
