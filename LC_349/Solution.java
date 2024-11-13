// This solution is pretty Lengthy, time and space complexities are also bad but it is what it is. You can take a look at it and think how to solve it in a better way.

import java.util.ArrayList;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
		    ArrayList<Integer> numbers = new ArrayList<>();
        for (int num: nums1){
			int targetIndex = Solution.binarySearch(num,nums2);
			
			if(targetIndex != -1 && nums2[targetIndex] == num  ){
				numbers.add(num);
			}
		}
		int size = numbers.size();
		 int[] ansArray = numbers.stream().mapToInt(Integer::intValue).toArray();
		  int[] uniqueArray = Arrays.stream(ansArray).distinct().toArray();
		return uniqueArray;
		
    }
	
	public static int binarySearch(int target, int[] arr){
		Solution.bubbleSorting(arr);
		int start = 0;
		int end = arr.length - 1;
		
		while (start <= end){
			int mid = start + (end - start) / 2;
			if(target < arr[mid]){
				end = mid - 1;
			}
			else if(target > arr[mid]){
				start = mid + 1;
			}
			else {
				return mid;
			}
		}
		return -1;
	} 
	
	public static void bubbleSorting(int[] arr){
		for(int i = 0; i < arr.length; i++){
			for(int j = 1; j < arr.length - i; j++){
				if(arr[j-1] > arr[j]){
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;;
					
				}
			}
		}
	}
}