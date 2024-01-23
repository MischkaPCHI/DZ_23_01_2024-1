import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("add1",7);
        map.put("add2",9);
        int sum = map.get("add1") + map.get("add2");
        map.put("sum", sum);
        System.out.println(map);


    }
}