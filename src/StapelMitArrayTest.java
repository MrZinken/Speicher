import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StapelMitArrayTest {
    private int maxGroesse = 12;
    StapelMitArray stapel = new StapelMitArray(maxGroesse);

    @Test
    void sizeTest() {
        int size = stapel.size();
        Assertions.assertEquals(12, size);
    }

    @Test
    void capacityTest() {
        int size = stapel.capacity();
        Assertions.assertEquals(12, size);
    }

    @Test
    void emptyTest() {
        boolean empty = stapel.isEmpty();
        Assertions.assertTrue(empty);
    }

}