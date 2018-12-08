package leetcode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by Joe
 * 两数之和
 */
public class Num1 {

    //空间复杂度O(n)，时间复杂度O(n)
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int a = target - nums[i];
            if (map.containsKey(a)) {
                return new int[]{i, map.get(a)};
            }
            map.put(nums[i], i);


        }
        return new int[]{};
    }

    public static void main(String[] args) {
        Num1 num1 = new Num1();
        int[] dv = num1.twoSum(new int[]{3, 2, 4}, 6);
        System.out.println(Arrays.toString(dv));
    }
}
