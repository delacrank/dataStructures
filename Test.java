import java.util.*;

public class Test {

    public static void main(String[] args) {
	HashMap<Integer, String> map = new HashMap<>();

	map.put(1, "one");
	map.put(1, "two");

	System.out.println(map.get(1));
    }

}
