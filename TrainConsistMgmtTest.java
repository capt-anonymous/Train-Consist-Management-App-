import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TrainConsistMgmtTest {

    @Test
    public void testSafetyCompliantTrain() {
        List<GoodsBogie> bogieList = new ArrayList<>();

        bogieList.add(new GoodsBogie("G1", "Cylindrical", "Petroleum"));
        bogieList.add(new GoodsBogie("G2", "Box", "Coal"));
        bogieList.add(new GoodsBogie("G3", "Flat", "Steel"));

        boolean result = TrainConsistMgmt.isSafetyCompliant(bogieList);

        assertTrue(result);
    }

    @Test
    public void testNonSafetyCompliantTrain() {
        List<GoodsBogie> bogieList = new ArrayList<>();

        bogieList.add(new GoodsBogie("G1", "Cylindrical", "Petroleum"));
        bogieList.add(new GoodsBogie("G2", "Cylindrical", "Water"));
        bogieList.add(new GoodsBogie("G3", "Box", "Coal"));

        boolean result = TrainConsistMgmt.isSafetyCompliant(bogieList);

        assertFalse(result);
    }
}
