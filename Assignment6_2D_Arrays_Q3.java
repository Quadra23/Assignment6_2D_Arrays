
public class Assignment6_2D_Arrays_Q3 {
	
	    public static boolean isValidMountainArray(int[] arr) {
	        if (arr.length < 3) {
	            return false;
	        }

	        int i = 0;
	        int n = arr.length;

	     
	        while (i < n - 1 && arr[i] < arr[i + 1]) {
	            i++;
	        }

	        
	        if (i == 0 || i == n - 1) {
	            return false;
	        }

	      
	        while (i < n - 1 && arr[i] > arr[i + 1]) {
	            i++;
	        }

	        return i == n - 1;
	    }

	    public static void main(String[] args) {
	        int[] arr = {2, 1};
	        boolean result = isValidMountainArray(arr);
	        System.out.println("Result: " + result);
	    }
	}

