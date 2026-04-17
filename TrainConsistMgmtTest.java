import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TrainConsistMgmtTest {

    @Test
    public void testLoopAndStreamReturnSameCount() {
        List<Bogie> bogieList = new ArrayList<>();

        bogieList.add(new Bogie("B1", "Passenger", 72));
        bogieList.add(new Bogie("B2", "Passenger", 58));
        bogieList.add(new Bogie("B3", "Sleeper", 65));
        bogieList.add(new Bogie("B4", "Goods", 40));
        bogieList.add(new Bogie("B5", "Passenger", 80));

        List<Bogie> loopResult = TrainConsistMgmt.filterUsingLoop(bogieList);
        List<Bogie> streamResult = TrainConsistMgmt.filterUsingStream(bogieList);

        assertEquals(loopResult.size(), streamResult.size());
        assertEquals(3, loopResult.size());
    }

    @Test
    public void testExecutionTimeIsMeasured() {
        List<Bogie> bogieList = new ArrayList<>();

        bogieList.add(new Bogie("B1", "Passenger", 72));
        bogieList.add(new Bogie("B2", "Passenger", 58));
        bogieList.add(new Bogie("B3", "Sleeper", 65));
        bogieList.add(new Bogie("B4", "Goods", 40));
        bogieList.add(new Bogie("B5", "Passenger", 80));

        long loopTime = TrainConsistMgmt.measureLoopExecutionTime(bogieList);
        long streamTime = TrainConsistMgmt.measureStreamExecutionTime(bogieList);

        assertTrue(loopTime >= 0);
        assertTrue(streamTime >= 0);
    }
}
