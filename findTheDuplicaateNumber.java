class Solution {
    public int findDuplicate(int[] nums) {
        int left = 1;
        int right = nums.length-1;

        while(left < right) {
            int mid = (left + right)/2;
            int count=0;
            for(int num:nums) {
                if(num <= mid) count++;
            }
            // Left side
            if(count > mid)  right = mid;
            else left = mid+1;
        }
        return left;
    }
}