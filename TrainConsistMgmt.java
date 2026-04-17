import java.util.Arrays;

public class TrainConsistMgmt {
    /**
     * UC 17: Sort bogie type names alphabetically using Java's built-in Arrays.sort() method.
     */
    public static void sortBogieTypes(String[] types) {
        Arrays.sort(types);
    }

    public static void main(String[] args) {
        String[] bogieTypes = {"Passenger", "Goods", "Sleeper", "Pantry", "Engines"};
        
        System.out.println("Original bogie types:");
        System.out.println(Arrays.toString(bogieTypes));

        sortBogieTypes(bogieTypes);

        System.out.println("Sorted bogie types (Alphabetical):");
        System.out.println(Arrays.toString(bogieTypes));
    }
}
