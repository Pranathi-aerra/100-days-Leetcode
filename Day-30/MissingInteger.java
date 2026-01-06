public class MissingInteger {
    
    public int missingNumber(int[] nums) {
          int sum=0;
          for(int i=0;i<nums.length;i++)
          {
            sum+=nums[i];
          }
          int tsum= (nums.length*(nums.length+1))/2;
          return tsum-sum;
    }

}
