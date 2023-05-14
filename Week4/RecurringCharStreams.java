import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


public class RecurringCharStreams {

    public static void main(String[] args) {

        String s = "hello world  ! @#I2i";

        Map<Character, Long> countMap = s.chars()
                .filter(c -> !Character.isWhitespace(c))
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(countMap);

        Map<Character, Long> top3Recurring = countMap.entrySet().stream()
                .sorted(Map.Entry.<Character, Long>comparingByValue().reversed())
                .limit(3)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println(top3Recurring);
    }
}