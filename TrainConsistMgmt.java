import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Bogie {
    private String name;
    private int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Bogie Name: " + name + ", Capacity: " + capacity;
    }
}

public class TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC7 - Sort Passenger Bogies by Capacity ");
        System.out.println("========================================\n");

        // Create a list to store passenger bogies
        List<Bogie> bogieList = new ArrayList<>();

        // Add bogies
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 78));
        bogieList.add(new Bogie("First Class", 24));

        System.out.println("Before Sorting:");
        for (Bogie bogie : bogieList) {
            System.out.println(bogie);
        }

        // Sort bogies based on seating capacity using Comparator
        bogieList.sort(Comparator.comparingInt(Bogie::getCapacity));

        System.out.println("\nAfter Sorting by Capacity (Ascending):");
        for (Bogie bogie : bogieList) {
            System.out.println(bogie);
        }

        System.out.println("\nProgram continues...");
    }
}
