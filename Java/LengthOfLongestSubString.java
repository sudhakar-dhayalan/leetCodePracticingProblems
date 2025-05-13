import java.util.ArrayList;
import java.util.List;

public class LengthOfLongestSubString {
    public static void main(String[] args) {

        StrInputClass in = new StrInputClass();
        in.longestStrLength("abcabcbb"); // 3
        in.longestStrLength("abcdabcbb"); // 4

        in.longestStrLengthOwnLogic("abcabcbb"); // 3
        in.longestStrLengthOwnLogic("abcdabcbb"); // 4

    }
}


class StrInputClass {
    public void longestStrLengthOwnLogic(String str) {
        List<Character> list = new ArrayList<>();
        int max_length = 0;

        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            if (!list.contains(c)) {
                list.add(c);
//                System.out.println(list);
                max_length = Math.max(max_length, list.size());
            } else {
                list.remove(0);
                i--;
            }
        }
        System.out.println(max_length);
    }

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