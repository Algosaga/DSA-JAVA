public class Solution{
	
	public static void main(String[] args){
		int[] arr = {0,1,2,4,2,1};
		System.out.println(Solution.findInMountainArray(3,arr));
		System.out.println(Solution.peakIndex(arr));
	}
	public static int findInMountainArray(int target, int[] mountainArr) {
	
        int peak = Solution.peakIndex(mountainArr);
		
		int itemInAscending = Solution.binarySearchForAscending(0,peak,target,mountainArr);
		int itemInDescending = Solution.binarySearchForDescending(peak,mountainArr.length-1,target,mountainArr);
		
		if(itemInAscending != -1 && itemInDescending != -1){
			return itemInAscending;
		}
		else if(itemInAscending == -1){
			return itemInDescending;
		}
		
		return itemInAscending;
		
		
    }
	
	public static int peakIndex(int[] arr){
		int start = 0;
		int end = arr.length-1;
		
		while(start < end){
		int mid = start + (end - start) / 2;
		
		if(arr[mid] > arr[mid + 1]){
			end = mid;
		}
		
		else{
			start = mid + 1;
		}
		}
		return start;
	} 
	
	public static int binarySearchForAscending(int start, int end, int target, int[] arr){
		while(start <= end){
			int mid = start + (end - start) / 2;
			
			if(target > arr[mid]){
				start = mid + 1;
			}
			else if(target < arr[mid]){
				end = mid - 1;
			}
			else{
				return mid;
			}
		}
		return -1;
	}
	
	public static int binarySearchForDescending(int start, int end, int target, int[] arr){
		while(start <= end){
			int mid = start + (end - start) / 2;
			
			if(target > arr[mid]){
				end = mid - 1;
			}
			
			else if(target < arr[mid]){
				start = mid + 1;
			}
			else{
				
				return mid;
			}
		}
		return -1;
	}
	
	
}