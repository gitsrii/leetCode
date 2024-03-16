import java.util.Arrays;

public class ReverseSubarrayMaximize {
    public static int maxValueAfterReverse(int[] nums) {

    int length=nums.length;
    int mid=(length/2);
    for(int i=1;i<mid;i++){
        int temp=nums[i];
        nums[i]=nums[mid+i];
        nums[mid+i]=temp;
        }

    int sum = 0;
    for (int i = 0; i < nums.length - 1; i++) {
        sum+= Math.abs(nums[i] - nums[i + 1]);
    }
        System.out.println(Arrays.toString(nums));
    return  sum;
}

    public static void main(String[] args) {
        int[] array={2,4,9,24,2,1,10};
        int result=maxValueAfterReverse(array);
        System.out.println("The result is:"+result);
    }
}
