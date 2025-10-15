package interview_problems;

public class SubStringBetweenAChar {
    public static void main(String[] args) {
        String s = "I am at skidata tech";
        char c = 'a';
        System.out.println(charCountBetweenChar(s, c)); // mtskidt
    }

    private static String charCountBetweenChar(String s, char ignore) {
        int left = 0, right = 0;

        String out = "";
        boolean firstInstanceFound = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(right) != ignore && !firstInstanceFound) {
                left++;
                right++;
            } else if (s.charAt(right) == ignore && !firstInstanceFound) {
                firstInstanceFound = true;
                right++;
            } else if (firstInstanceFound && s.charAt(right) != ignore) {
                right++;
            } else if (firstInstanceFound && s.charAt(right) == ignore) {
                out += s.substring(left + 1, right);
                left = right;
                right++;
            }
        }
        return out.replace(" ", "");
    }
}
