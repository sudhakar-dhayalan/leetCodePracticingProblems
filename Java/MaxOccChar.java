import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MaxOccChar {
    public static void main(String[] args) {
        printMaxOccurChar("Sudhakaarss");
    }

    private static void printMaxOccurChar(String text) {
        Map<Character, Integer>  charListWithCount = getCharListWithCount(text);
        char maxOccuringChar = getMaxOcurringChar(charListWithCount);
        System.out.println(maxOccuringChar);
    }

    private static char getMaxOcurringChar(Map<Character, Integer> charListWithCount) {
        char c = '\0';
        int max = 0;
        for (Map.Entry<Character, Integer> i: charListWithCount.entrySet()) {
            if (max < i.getValue()) {
                max = i.getValue();
                c = i.getKey();
            }
        }

        return c;
    }

    private static Map<Character, Integer> getCharListWithCount(String text) {
        Map<Character, Integer> mapOfCharAndCount = new Hashtable<>();
        List<Character> charList = text.chars().mapToObj(e -> (char) e).map(Character::toLowerCase).toList();
//        System.out.println(charList);
        for (int i = 0; i < charList.size(); i++) {
            char value = charList.get(i);
            if (mapOfCharAndCount.get(charList.get(i)) == null) {
                mapOfCharAndCount.put(value, 1);
            } else {
                int count = mapOfCharAndCount.get(value) + 1;
                mapOfCharAndCount.put(value, count);
            }
        }
//        System.out.println(mapOfCharAndCount);
        return mapOfCharAndCount;
    }
}
