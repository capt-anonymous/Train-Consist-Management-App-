import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TrainConsistMgmtTest {

    @Test
    public void testValidTrainId() {
        assertTrue(TrainConsistMgmt.isValidTrainId("TRN-1234"));
    }

    @Test
    public void testInvalidTrainId() {
        assertFalse(TrainConsistMgmt.isValidTrainId("TRN1234"));
        assertFalse(TrainConsistMgmt.isValidTrainId("TRN-12"));
        assertFalse(TrainConsistMgmt.isValidTrainId("ABC-1234"));
    }

    @Test
    public void testValidCargoCode() {
        assertTrue(TrainConsistMgmt.isValidCargoCode("PET-AB"));
    }

    @Test
    public void testInvalidCargoCode() {
        assertFalse(TrainConsistMgmt.isValidCargoCode("PET-ab"));
        assertFalse(TrainConsistMgmt.isValidCargoCode("PET-123"));
        assertFalse(TrainConsistMgmt.isValidCargoCode("CARGO-AB"));
    }
}
