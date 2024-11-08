 public class Solution {
    public static void main(String[] args) {
        int[] arr = {2, 3, 45, 67, 88,92,68,54,44, 34, 16, 4, 1};
        System.out.println(Solution.peakIndexInMountainArray(arr));
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) { 
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
               
                end = mid;
            } else {
                
                start = mid + 1;
            }
        }

       
        return start;
    }
}

 
 //This one is little more efficient in tems of memory.
  public class Solution{
	public static void main(String[] args){
		int[] arr = {2,3,45,67,34,16,4,1};
		System.out.println(Solution.peakIndexInMountainArray(arr));
	}
	
	 public static int peakIndexInMountainArray(int[] arr) {
       int start = 0;
		int end = arr.length - 1;
		int temp = 0;

        if(arr.length == 1){
            return 0;
        }
		
		 while(start <= end){
		int mid = start + (end - start) / 2;
            if(mid == 0){
                return mid + 1;
            }
			
			 if(arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1] ){
                return mid;
             }
			else if(arr[mid] < arr[mid - 1]){
				 end = mid - 1;
			 }
            
			else if(arr[mid] > arr[mid - 1]){
				 start = mid + 1;
			 }
			 else{
				temp = mid;
                return temp;
			 }

			
		 }
		 return temp;
    }
}
