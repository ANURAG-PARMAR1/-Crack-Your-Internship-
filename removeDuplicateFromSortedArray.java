class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 1) return 1;
        int l=0,r=1,n=nums.length;

        while(r<n) {
            if(nums[l] == nums[r]) r++;
            else {
                int temp = nums[l+1];
                nums[l+1] = nums[r];
                nums[r] = temp;
                r++;l++;
            }
        }
        return l+1;


    }
}