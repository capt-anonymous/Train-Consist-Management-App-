import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TrainConsistMgmtTest {

    @Test
    public void testSortBogieTypesAlphabetically() {
        String[] types = {"Sleeper", "Goods", "Passenger", "Engines"};
        String[] expected = {"Engines", "Goods", "Passenger", "Sleeper"};

        TrainConsistMgmt.sortBogieTypes(types);

        assertArrayEquals(expected, types);
    }

    @Test
    public void testSortBogieTypesAlreadySorted() {
        String[] types = {"Box", "Flat", "Tank"};
        String[] expected = {"Box", "Flat", "Tank"};

        TrainConsistMgmt.sortBogieTypes(types);

        assertArrayEquals(expected, types);
    }
}
