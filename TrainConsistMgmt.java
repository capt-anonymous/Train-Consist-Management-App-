import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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

    public static Map<String, List<Bogie>> groupBogiesByType(List<Bogie> bogies) {
        return bogies.stream()
                .collect(Collectors.groupingBy(Bogie::getType));
    }

    public static void main(String[] args) {
        List<Bogie> bogieList = new ArrayList<>();

        bogieList.add(new Bogie("B1", "Passenger", 72));
        bogieList.add(new Bogie("B2", "Passenger", 58));
        bogieList.add(new Bogie("B3", "Goods", 65));
        bogieList.add(new Bogie("B4", "Goods", 40));
        bogieList.add(new Bogie("B5", "Sleeper", 80));

        Map<String, List<Bogie>> groupedBogies = groupBogiesByType(bogieList);

        System.out.println("Grouped Bogies by Type:");
        groupedBogies.forEach((type, bogies) -> {
            System.out.println(type + " -> " + bogies);
        });
    }
}
