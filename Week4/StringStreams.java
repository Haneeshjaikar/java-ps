import java.util.regex.Pattern;
import java.util.*;
import java.nio.file.*;
import java.util.function.*;
import java.util.stream.*;

public class StringStreams {
  public static void main(String args[]) throws Exception {
    Pattern separator = Pattern.compile("[.,\\s]+");

    Map<String,Long> uniqueMap = Files.lines(Path.of("lorem-ipsum.txt"))
        .flatMap(ls -> separator.splitAsStream(ls))
        .map(word -> word.toLowerCase())
        .collect(
          Collectors.groupingBy(Function.identity(),
          Collectors.counting()));

    System.out.println("Top 5 most used words:");
    uniqueMap.keySet().stream()
        .sorted((a,b) -> uniqueMap.get(b).intValue() - uniqueMap.get(a).intValue())
        .limit(5)
        .forEach(key -> System.out.println("  " + key + ": " + uniqueMap.get(key)));

    System.out.println("\nWords occurring 24 or more times:");

    uniqueMap.keySet().stream()
        .filter(key -> uniqueMap.get(key) >= 24)
        .forEach(word -> System.out.println("  " + word));

    System.out.print("\nHow many words occur only once? ");

    long once = uniqueMap.keySet().stream().filter(key -> uniqueMap.get(key) == 1).count();
    System.out.println(once);

    System.out.println("\nThe longest words:");

    Map<Integer,List<String>> lengthMap = Files.lines(Path.of("lorem-ipsum.txt"))
        .flatMap(ls -> separator.splitAsStream(ls))
        .map(word -> word.toLowerCase())
        .distinct()
        .collect(Collectors.groupingBy(w -> w.length()));

    lengthMap.keySet().stream()
        .sorted((a,b) -> b.intValue() - a.intValue())
        .limit(1)
        .flatMap(key -> lengthMap.get(key).stream())
        .forEach(word -> System.out.println("  " + word));
  }
}
