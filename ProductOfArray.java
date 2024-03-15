import java.util.Arrays;

public class ProductOfArray {

    public static int[] productexceptSelf(int[] nums) {
        int result[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = 1;
        }
        int left = 1;
        int right = 1;
        // Calculate left products
        for (int i = 0; i < nums.length; i++) {
            result[i] = result[i]* left;
            left =left * nums[i];
        }
        // Calculate right products and multiply with left products
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] =result[i] * right;
            right = right* nums[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int [] nums ={1,2,3,4};
        int[] result = productexceptSelf(nums);
        System.out.println("The result is:"+ Arrays.toString(result));
    }
}