class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int firstOccurenceInSecond = returnCount(nums1, nums2);
        int secondOccurenceInFirst = returnCount(nums2, nums1);     
        return new int[]{firstOccurenceInSecond, secondOccurenceInFirst};    
    }

    int returnCount(int[] arr1, int[] arr2){
        int count = 0;
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length;j++){
                if(arr1[i] == arr2[j]){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}