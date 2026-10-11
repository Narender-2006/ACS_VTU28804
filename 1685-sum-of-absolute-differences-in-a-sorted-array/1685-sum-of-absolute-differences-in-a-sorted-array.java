class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
    int n = nums.length;
    int totalSum = 0;
    for (int num : nums) totalSum += num;
    
    int leftSum = 0;
    int[] result = new int[n];
    
    for (int i = 0; i < n; i++) {
        int rightSum = totalSum - leftSum - nums[i];
        
        int leftDiff = (nums[i] * i) - leftSum;
        int rightDiff = rightSum - (nums[i] * (n - 1 - i));
        
        result[i] = leftDiff + rightDiff;
        leftSum += nums[i];
    }
    return result;}
public static void main(String a[]){
 Solution obj=new Solution();
 int []result=obj.getSumAbsoluteDifferences(new int[]{1,2,3,4});
 System.out.println(result);
}
}