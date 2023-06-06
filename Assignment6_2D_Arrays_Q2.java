

	public class Assignment6_2D_Arrays_Q2 {
	    public boolean searchMatrix(int[][] matrix, int target) {
	        int m = matrix.length;
	        int n = matrix[0].length;

	        int left = 0;
	        int right = m * n - 1;

	        while (left <= right) {
	            int mid = left + (right - left) / 2;
	            int midValue = matrix[mid / n][mid % n];

	            if (midValue == target) {
	                return true;
	            } else if (midValue < target) {
	                left = mid + 1;
	            } else {
	                right = mid - 1;
	            }
	        }

	        return false;
	    }

	    public static void main(String[] args) {
	    	Assignment6_2D_Arrays_Q2 searchMatrix = new Assignment6_2D_Arrays_Q2();
	        int[][] matrix = {
	            {1, 3, 5, 7},
	            {10, 11, 16, 20},
	            {23, 30, 34, 60}
	        };
	        int target = 3;
	        boolean result = searchMatrix.searchMatrix(matrix, target);
	        System.out.println("Result: " + result);
	    }
	}
