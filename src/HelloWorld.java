public class HelloWorld{
    public static void main(String[] args) {
        new HelloWorld().runApp();
    }
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i =0; i < nums.length; i++){
            for(int j =i+1; j < nums.length;j++){
                if(nums[i]+nums[j]==target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
    void runApp() {
        int[] array = {3,2,4};
    System.out.println(twoSum(array,9));
    }
}

