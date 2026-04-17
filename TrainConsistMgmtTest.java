import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TrainConsistMgmtTest {

    @Test
    public void testSearchBogieFound() {
        String[] bogieIds = {"B101", "B103", "B105"};

        boolean result = TrainConsistMgmt.searchBogie(bogieIds, "B103");

        assertTrue(result);
    }

    @Test
    public void testSearchBogieNotFound() {
        String[] bogieIds = {"B101", "B103", "B105"};

        boolean result = TrainConsistMgmt.searchBogie(bogieIds, "B999");

        assertFalse(result);
    }

    @Test
    public void testSearchOnEmptyTrain() {
        String[] bogieIds = {};

        IllegalStateException exception = assertThrows(
                IllegalStateException.class,
                () -> TrainConsistMgmt.searchBogie(bogieIds, "B101")
        );

        assertTrue(exception.getMessage().contains("No bogies are available in the train"));
    }
}
