class Solution {
    
    public int mergeSort(int [] nums,int left,int right) {
        if(left>=right) return 0;
        int mid = (left+right)/2;
        int count = mergeSort(nums,left,mid);
        count += mergeSort(nums,mid+1,right);
        count += merge(nums,left,mid,right);
        return count;
    }

    public int merge(int [] nums,int left,int mid,int right) {
        int j=mid+1,count=0;
        for(int i=left;i<=mid;i++) {
            while(j<=right && nums[i]>(2 * (long)nums[j])) {
                j++;
            }
            count += ( j - (mid+1)); 

        }

        ArrayList<Integer> list = new ArrayList<>();
        int i = left;
        j = mid+1;
        while(i <= mid && j<= right) {
            if(nums[i] <= nums[j]) {
                list.add(nums[i]);
                i++;
            }
            else{
                list.add(nums[j]);
                j++;
            } 
        }

        while(i<=mid) {
            list.add(nums[i]);
                i++;
        }

        while(j <= right) {
            list.add(nums[j]);
                j++;
        }

        for(int k=left;k<=right;k++) {
            nums[k] = list.get(k-left);
        }
        return count;
    }
    public int reversePairs(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
    }
}
