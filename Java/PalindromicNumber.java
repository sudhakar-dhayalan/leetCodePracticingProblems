public class PalindromicNumber {
    public static void main(String[] args) {
        SolutionPN sol = new SolutionPN();
        System.out.println(sol.isPalindrome(1001));
        System.out.println(sol.isPalindrome(11));
        System.out.println(sol.isPalindrome(1023));

        System.out.println(sol.isPalindrome_1(1001));
        System.out.println(sol.isPalindrome_1(1023));
    }
}

class SolutionPN {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        String str = x + "";
        return checkPalindrome(str);
    }

    public boolean isPalindrome_1(int x) {
        String num = String.valueOf(x);
        String reversed = new StringBuilder(num).reverse().toString();
        return num.equals(reversed);
    }

    private boolean checkPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while(left < right) {
            if (str.charAt(left) == str.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }
}