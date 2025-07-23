public class LongestPalindromicSubString {
    public static void main(String[] args) {
        SolutionLPSS solutionLPSS = new SolutionLPSS();
        System.out.println(solutionLPSS.longestPalindrome("babad"));
        System.out.println(solutionLPSS.longestPalindrome("cbbd"));
        System.out.println(solutionLPSS.longestPalindrome("malayalam"));
    }
}

class SolutionLPSS {
    public String longestPalindrome(String s) {
        if (s.isBlank()) return "";

        String longest = "";

        for (int i = 0; i < s.length(); i++) {
            String oddPalindrome = expandFromCenter(s, i, i);
            String evenPalindrome = expandFromCenter(s, i - 1, i);

            if (oddPalindrome.length() > longest.length()) {
                longest = oddPalindrome;
            }
            if (evenPalindrome.length() > longest.length()) {
                longest = evenPalindrome;
            }
        }

        return longest;
    }

    private String expandFromCenter(String str, int left, int right) {
        int j = 0;
        while (left - j >= 0 && (right + j) < str.length() && str.charAt(left - j) == str.charAt(right + j)) {
            j++;
        }
        j--; // loop fails and so going back to succeeded position
        return str.substring(left - j, right + j + 1);
        // 0,2 means substring will skip 2nd index, to capture that we add +1
    }
}