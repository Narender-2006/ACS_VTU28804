import java.util.HashSet;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> window = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (i > k) {
                window.remove(nums[i - k - 1]);
            }
            

            if (!window.add(nums[i])) {
                return true;
            }
        }
        return false;
    }

    public static void main(String a[]) {
        Solution obj = new Solution();
        boolean result = obj.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 4);
        System.out.println(result);
    }
}
