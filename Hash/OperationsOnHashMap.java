import java.util.HashMap;
import java.util.Map;

public class OperationsOnHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Sumit", 1);
        map.put("Saurabh", 2);
        map.put("Aditya", 6);
        System.out.println(map);

        System.out.println("is contain key " + map.containsKey("i"));
        System.out.println("is contain value " + map.containsValue("i"));

        System.out.println("is contain key " + map.get("Sumit")); // if not present key then null

        map.forEach((key, value) -> {
            System.out.println("Key: " + key + ", Value: " + value);
        });

        map.remove("Saurabh");
        System.out.println(map.entrySet());

        // method to iterate
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}
