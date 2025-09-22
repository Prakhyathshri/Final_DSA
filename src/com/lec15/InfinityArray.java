package com.lec15;

public class InfinityArray {
    public static void main(String[] args) {

        int[] nums = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;
        System.out.println(ansFind(nums, target));
    }

    static int ansFind(int[] nums, int target){
        int start = 0;
        int end = 1;

        while (target > nums[end]){
            //so this condition will make sure the target > start and < end
            //else it will increase the array size by * 2
            int temp = end + 1;
            /*
SO this doubling the size is done to maintain the efficiency
If you increase end linearly (e.g., end = end + 1 each time),
it could take forever if the target is very far away.
By doubling the window size (* 2), you expand the search exponentially.
This means you’ll reach the region containing the target in O(log N)
expansions instead of O(N).
             */
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarysearch(nums, target, start, end);
        //now this will directly go and search the element in the range
    }

    static int binarysearch(int[] nums, int target, int start, int end){

        while(start <= end){
        int mid = start + (end - start) / 2;
            if (target > nums[mid]){
                start = mid + 1;
            } else if (target < nums[mid]){
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return - 1;
    }


}
