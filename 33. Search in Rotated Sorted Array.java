//using while for repeatation despite of recursion 
//graph approach 
//tc 0(logn);


class Solution {
    public int search(int[] nums, int target) {
        int si = 0 ;
        int ei = nums.length-1;

        //looping 
        while(si<=ei){
            int mid= si+ (ei-si)/2;
            //if we get the target at mid 
            if(target==nums[mid]){
                return mid;
            }
            //checking on first line 
            if(nums[si]<=nums[mid]){
                if(nums[si]<= target && target<= nums[mid]){
                    ei=mid-1;
                }
                else{
                    si= mid+1;
                }

            }
            //if not on the first line 
            else{
                if(nums[mid]<=target && target<=nums[ei]){
                    si = mid +1;
                }
                else{
                    ei= mid-1;
                }
            }
        }
///if target not exist in the nums array 
        return -1;
        
    }
}
