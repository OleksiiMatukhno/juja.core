package ua.com.juja.core.lab09;

public class ArrayFilter {
    public static int [] filterEven(int [] nums){
        int index = 0;
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                result[index] = nums[i];
                index++;
            }
        }
        return result;
    }
}
