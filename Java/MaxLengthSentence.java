import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaxLengthSentence {
    public static void main(String[] args) {

        List<String> stationeryList = Arrays.asList("this ", "is ", "  some person  ", "from banglore");

        Optional<String> longest = stationeryList.stream()
                .map(String::trim)
                .max(Comparator.comparingInt(String::length));

        longest.ifPresent(s -> System.out.println(s));

    }
}
