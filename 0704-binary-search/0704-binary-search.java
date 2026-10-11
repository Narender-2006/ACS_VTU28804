
class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(target<nums[mid]){
                high=mid-1;
            }
            else
             low=mid+1;
        }
        return -1;
    }
    public static void main(String a[]){
        Solution obj=new Solution();
        int  result=obj.search(new int[]{-1,0,3,5,9,12},9);
        System.out.println(result);
    }
}