import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DroidTest {

    @Test
    void testToString() {
        Droid test = new Droid("Chris");
        assertEquals("Hello, I'm the droid: Chris", test.toString());
    }

    @Test
    void performTask() {
        Droid test = new Droid("Chris");
        assertEquals(test.batteryLevel, 100);
        test.performTask("Dance");
        assertEquals(test.batteryLevel, 90);
    }

    @Test
    void energyReport() {
        Droid test = new Droid("Chris");
        assertEquals(test.energyReport(), 100);
    }

    @Test
    void energyTransfer() {
        Droid test = new Droid("Chris");
        Droid test2 = new Droid("David");
        test.performTask("Test");
        assertEquals(test.energyReport(), 90);
        test.energyTransfer(test2);
        assertEquals(test.energyReport(), 100);
    }
}