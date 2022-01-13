public class differenceMinAndMax{
    
    public static int differenceMinAndMax(int[] nums){
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        if(nums.length < 1) return 0;
        
        for(int i=0; i<nums.length; i++){
            for(int j=2; j<i; j++){
                if(nums[i] % j == 0) break;
                if(nums[i] > max) max = nums[i];
                if(nums[i] < min) min = nums[i];
            }
        }
        return max-min;
    }

     public static void main(String []args){
         int[] nums = {19,22,13,8,7,24,14,-5,-1};
         System.out.println(differenceMinAndMax(nums));
     }
}