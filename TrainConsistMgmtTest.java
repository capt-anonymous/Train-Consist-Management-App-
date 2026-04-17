import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrainConsistMgmtTest {

    @Test
    public void testGetTotalSeatingCapacity() {
        List<Bogie> bogieList = new ArrayList<>();

        bogieList.add(new Bogie("B1", "Passenger", 72));
        bogieList.add(new Bogie("B2", "Passenger", 58));
        bogieList.add(new Bogie("B3", "Sleeper", 65));
        bogieList.add(new Bogie("B4", "Goods", 40));

        int result = TrainConsistMgmt.getTotalSeatingCapacity(bogieList);

        assertEquals(235, result);
    }
}
