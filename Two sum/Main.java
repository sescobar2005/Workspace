class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                int suma = 0;

                if (i == j) {
                    continue;
                }
                
                suma = nums[i] + nums[j];

                if (suma == target) {
                    int pos[] = {i, j};
                    return pos;
                }
            }

        }
        return null;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;

        int[] resultado = new Solution().twoSum(nums, target);
        System.out.println(java.util.Arrays.toString(resultado));
    }
}