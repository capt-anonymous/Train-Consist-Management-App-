import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrainConsistMgmtTest {

    @Test
    public void testFilterBogiesByCapacity() {
        List<Bogie> bogieList = new ArrayList<>();

        bogieList.add(new Bogie("B1", "Passenger", 72));
        bogieList.add(new Bogie("B2", "Passenger", 58));
        bogieList.add(new Bogie("B3", "Passenger", 65));
        bogieList.add(new Bogie("B4", "Goods", 40));

        List<Bogie> result = TrainConsistMgmt.filterBogiesByCapacity(bogieList);

        assertEquals(2, result.size());
        assertEquals("B1", result.get(0).getBogieId());
        assertEquals("B3", result.get(1).getBogieId());
    }
}
