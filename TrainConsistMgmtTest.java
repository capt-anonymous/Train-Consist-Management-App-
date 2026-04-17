import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TrainConsistMgmtTest {

    @Test
    public void testGroupBogiesByType() {
        List<Bogie> bogieList = new ArrayList<>();

        bogieList.add(new Bogie("B1", "Passenger", 72));
        bogieList.add(new Bogie("B2", "Passenger", 58));
        bogieList.add(new Bogie("B3", "Goods", 65));
        bogieList.add(new Bogie("B4", "Goods", 40));
        bogieList.add(new Bogie("B5", "Sleeper", 80));

        Map<String, List<Bogie>> result = TrainConsistMgmt.groupBogiesByType(bogieList);

        assertEquals(3, result.size());
        assertEquals(2, result.get("Passenger").size());
        assertEquals(2, result.get("Goods").size());
        assertEquals(1, result.get("Sleeper").size());
        assertTrue(result.containsKey("Passenger"));
        assertTrue(result.containsKey("Goods"));
        assertTrue(result.containsKey("Sleeper"));
    }
}
