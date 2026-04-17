import java.util.ArrayList;
import java.util.List;

class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

class PassengerBogie {
    private String bogieId;
    private String type;
    private int capacity;

    public PassengerBogie(String bogieId, String type, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Invalid capacity: Capacity must be greater than 0");
        }
        this.bogieId = bogieId;
        this.type = type;
        this.capacity = capacity;
    }

    public String getBogieId() {
        return bogieId;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "PassengerBogie{" +
                "bogieId='" + bogieId + '\'' +
                ", type='" + type + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}

public class TrainConsistMgmt {

    public static PassengerBogie createPassengerBogie(String bogieId, String type, int capacity)
            throws InvalidCapacityException {
        return new PassengerBogie(bogieId, type, capacity);
    }

    public static void main(String[] args) {
        List<PassengerBogie> trainConsist = new ArrayList<>();

        try {
            PassengerBogie b1 = createPassengerBogie("P1", "Passenger", 72);
            trainConsist.add(b1);
            System.out.println("Bogie added successfully: " + b1);

            PassengerBogie b2 = createPassengerBogie("P2", "Passenger", -5);
            trainConsist.add(b2);
            System.out.println("Bogie added successfully: " + b2);

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Final Train Consist:");
        for (PassengerBogie bogie : trainConsist) {
            System.out.println(bogie);
        }
    }
}
