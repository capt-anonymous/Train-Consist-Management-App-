import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TrainConsistMgmtTest {

    @Test
    public void testValidPassengerBogieCreation() throws InvalidCapacityException {
        PassengerBogie bogie = TrainConsistMgmt.createPassengerBogie("P1", "Passenger", 72);

        assertEquals("P1", bogie.getBogieId());
        assertEquals("Passenger", bogie.getType());
        assertEquals(72, bogie.getCapacity());
    }

    @Test
    public void testInvalidPassengerBogieCreation() {
        InvalidCapacityException exception = assertThrows(
                InvalidCapacityException.class,
                () -> TrainConsistMgmt.createPassengerBogie("P2", "Passenger", 0)
        );

        assertEquals("Invalid capacity: Capacity must be greater than 0", exception.getMessage());
    }

    @Test
    public void testNegativeCapacityPassengerBogieCreation() {
        InvalidCapacityException exception = assertThrows(
                InvalidCapacityException.class,
                () -> TrainConsistMgmt.createPassengerBogie("P3", "Passenger", -10)
        );

        assertEquals("Invalid capacity: Capacity must be greater than 0", exception.getMessage());
    }
}
