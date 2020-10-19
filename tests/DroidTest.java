import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DroidTest {

    @Test
    void testToString() {
        Droid test = new Droid("Chris");
        assertEquals("Hello, I'm the droid: Chris", test.toString());
    }

    @Test
    void performTask() {
    }

    @Test
    void energyReport() {
    }

    @Test
    void energyTransfer() {
    }
}