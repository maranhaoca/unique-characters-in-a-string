import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueCharactersTest {

    @Test
    void if_has_upper_case() {
        String input = "AaBbCc";

        boolean actual = UniqueCharacters.isUniqueCharacters(input);
        boolean expected = false;
        
        assertEquals(expected, actual);
    }
    
    @Test
    void if_has_blank_spaces() {
        String input = "a b c d";

        boolean actual = UniqueCharacters.isUniqueCharacters(input);
        boolean expected = true;

        assertEquals(expected, actual);
    }
    
    @Test
    void if_has_unique_characters() {
        String input = "uniqe";

        boolean actual = UniqueCharacters.isUniqueCharacters(input);
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    void if_has_no_unique_characters() {
        String input = "nouniquecharacters";

        boolean actual = UniqueCharacters.isUniqueCharacters(input);
        boolean expected = false;

        assertEquals(expected, actual);
    }
}
