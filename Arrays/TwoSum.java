public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        for(int i =0; i<size-1;i++){
            int targetsum = target - nums[i];
            for(int j =i+1;j<size;j++){
                if(targetsum == nums[j]){
                    return new int[]{i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }

    public static void main (String[] args){
        int[] arr = {2,7,11,15};
        int target = 9;
        int[] result = twoSum(arr,target);
        System.out.println(result[0] + " " + result[1]);
    }
}
