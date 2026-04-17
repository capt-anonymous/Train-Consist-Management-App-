import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Bogie {
    private String bogieId;
    private String type;
    private int capacity;

    public Bogie(String bogieId, String type, int capacity) {
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
        return "Bogie{" +
                "bogieId='" + bogieId + '\'' +
                ", type='" + type + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}

public class TrainConsistMgmt {

    public static List<Bogie> filterBogiesByCapacity(List<Bogie> bogies) {
        return bogies.stream()
                .filter(b -> b.getType().equalsIgnoreCase("Passenger") && b.getCapacity() > 60)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Bogie> bogieList = new ArrayList<>();

        bogieList.add(new Bogie("B1", "Passenger", 72));
        bogieList.add(new Bogie("B2", "Passenger", 58));
        bogieList.add(new Bogie("B3", "Passenger", 65));
        bogieList.add(new Bogie("B4", "Goods", 40));

        List<Bogie> filteredBogies = filterBogiesByCapacity(bogieList);

        System.out.println("Filtered Passenger Bogies with capacity > 60:");
        filteredBogies.forEach(System.out::println);
    }
}
