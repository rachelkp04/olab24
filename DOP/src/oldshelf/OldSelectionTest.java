package oldshelf;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class OldSelectionTest {

    @Test
    void testGetAgeOrTitle_Comic() {
        Comic1 comic = new Comic1("Batman", 50);
        assertEquals("superman", OldSelection1.getAgeOrTitle(comic));
    }

    @Test
    void testGetAgeOrTitle_SomeObject() {
        Object someObject = new Object();
        assertEquals("", OldSelection1.getAgeOrTitle(SomeObject));
    }
}