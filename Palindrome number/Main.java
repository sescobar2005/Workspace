class Solution {
    public boolean isPalindrome(int x){
        while (true) {
            int rest = x % 10;
            int num = x / 10;

            System.out.println(num);
            System.out.println(rest);
            return true;
        }
        
    }
    
}

public class Main {
    public static void main(String[] args) {
        int num = 121;
        boolean flag = new Solution().isPalindrome(num);
        System.out.println("Hola mundo " + flag);
    }
}
