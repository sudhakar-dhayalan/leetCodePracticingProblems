import java.util.ArrayList;
import java.util.List;

public class LengthOfLongestSubString {
    public static void main(String[] args) {

        StrInputClass in = new StrInputClass();
        in.longestStrLength("abcabcbb"); // 3
        in.longestStrLength("abcdabcbb"); // 4

    }
}


class StrInputClass {
    public void longestStrLength(String s) {
        int max_length = 0;
        int startIndex = 0;
        int endIndex = 0;

        List<Character> li = new ArrayList<>();
//        System.out.println(s.length());
        while (endIndex < s.length()) {
            if (!li.contains(s.charAt(endIndex))) {
                li.add(s.charAt(endIndex));
                max_length = Math.max(max_length, li.size());
                endIndex++;
            } else {
                li.remove(Character.valueOf(s.charAt(startIndex)));
                startIndex++;
            }
//            System.out.println(li);
        }
        System.out.println(max_length);
    }
}