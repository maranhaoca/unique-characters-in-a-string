import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueCharactersTest {

    @Test
    void if_has_unique_characters() {
        String input = "uniqe";

        boolean actual = UniqueCharacters.uniqueCharacters(input);
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    void if_has_no_unique_characters() {
        String input = "nouniquecharacters";

        boolean actual = UniqueCharacters.uniqueCharacters(input);
        boolean expected = false;

        assertEquals(expected, actual);
    }
}