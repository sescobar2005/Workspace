class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int original = x;
        long reversed = 0;

        while (x > 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x = x / 10;
        }

        return original == reversed;
    }
}

public class Main {
    public static void main(String[] args) {
        int num = 121;
        boolean flag = new Solution().isPalindrome(num);
        System.out.println(flag);
    }
}
