import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TrainConsistMgmtTest {

    @Test
    public void testBogieIdFound() {
        String[] bogieIds = {"B104", "B101", "B109", "B103", "B107"};

        boolean result = TrainConsistMgmt.linearSearch(bogieIds, "B103");

        assertTrue(result);
    }

    @Test
    public void testBogieIdNotFound() {
        String[] bogieIds = {"B104", "B101", "B109", "B103", "B107"};

        boolean result = TrainConsistMgmt.linearSearch(bogieIds, "B999");

        assertFalse(result);
    }

    @Test
    public void testSearchFirstElement() {
        String[] bogieIds = {"B104", "B101", "B109", "B103", "B107"};

        boolean result = TrainConsistMgmt.linearSearch(bogieIds, "B104");

        assertTrue(result);
    }
}
