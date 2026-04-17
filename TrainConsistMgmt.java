import java.util.ArrayList;
import java.util.List;

class GoodsBogie {
    private String bogieId;
    private String type;
    private String cargo;

    public GoodsBogie(String bogieId, String type, String cargo) {
        this.bogieId = bogieId;
        this.type = type;
        this.cargo = cargo;
    }

    public String getBogieId() {
        return bogieId;
    }

    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return "GoodsBogie{" +
                "bogieId='" + bogieId + '\'' +
                ", type='" + type + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}

public class TrainConsistMgmt {

    public static boolean isSafetyCompliant(List<GoodsBogie> bogies) {
        return bogies.stream()
                .allMatch(b -> {
                    if (b.getType().equalsIgnoreCase("Cylindrical")) {
                        return b.getCargo().equalsIgnoreCase("Petroleum");
                    }
                    return true;
                });
    }

    public static void main(String[] args) {
        List<GoodsBogie> goodsBogieList = new ArrayList<>();

        goodsBogieList.add(new GoodsBogie("G1", "Cylindrical", "Petroleum"));
        goodsBogieList.add(new GoodsBogie("G2", "Box", "Coal"));
        goodsBogieList.add(new GoodsBogie("G3", "Flat", "Steel"));
        goodsBogieList.add(new GoodsBogie("G4", "Cylindrical", "Petroleum"));

        boolean result = isSafetyCompliant(goodsBogieList);

        if (result) {
            System.out.println("The train is safety compliant.");
        } else {
            System.out.println("The train is NOT safety compliant.");
        }
    }
}
