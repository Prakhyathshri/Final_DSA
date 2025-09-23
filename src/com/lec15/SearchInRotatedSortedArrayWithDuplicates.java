package com.lec15;

public class SearchInRotatedSortedArrayWithDuplicates {
    public static void main(String[] args) {

    }

    static int findPivotWithDuplicate(int[] nums){
        int start = 0, end = nums.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;

            //Pivot found at mid
            //we use mid < end, so that in last iteration,it doesnt go out of bound
            if (mid < end && nums[mid] > nums[mid + 1]){
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid -1]){
                return mid - 1;
            }
             //if elem at mid, s and e are equal then skip the duplicates
            if (nums[mid] == nums[start] && nums[mid] == nums[end]){
                //skip the duplicates
                //NOTE: what if these elements at start and end were the pivot ?
                //check if start is pivot
                if (nums[start] > nums[start + 1]){
                    return start;
                }
                start++;
                //check if end is pivot
                if (nums[end] < nums[end - 1]){
                    return end - 1;
                }
                end --;
            }
            //left side is sorted, so pivot should be in right
            else if(nums[start] < nums[mid] || nums[start] == nums[mid] && nums[mid] > nums[end]){
                start = mid + 1;
            } else {
                end = mid - 1;
            }

//            if (nums[mid] <= nums[start]){
//                end = mid - 1;
//            } else {
//                start = mid + 1;
//            }
        }
        return -1;
    }
}
