public class differenceMinAndMax{
    
    public static int differenceMinAndMax(int[] nums){
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        boolean flag = true;
        
        if(nums.length < 1) return 0;
        
        for(int i=0; i<nums.length; i++){
            for(int j=2; j<nums[i]; j++){
                if(nums[i] % j == 0) flag = false;
            }
            
            if(flag == true && nums[i] > 1){
                if(max < nums[i]) max = nums[i];
                if(min > nums[i]) min = nums[i];
            }
            flag = true;
        }
        
        return max-min;
    }

     public static void main(String []args){
         int[] nums = {19,22,13,8,7,24,14,-5,1};
         System.out.println(differenceMinAndMax(nums));
     }
}