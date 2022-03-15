package git;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author rd20
 */
public class Index {
    public void add() {

    }

    public void clear() {

    }

    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("a", null);
        hashMap.put("b", null);
        hashMap.put("c", null);

        Map<String, String> collect = Arrays.asList("a", "b", "c").stream().collect(Collectors.toMap(Function.identity(), hashMap::get));
        System.out.println(collect);
    }
}
