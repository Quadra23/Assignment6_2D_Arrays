

	public class Assignment6_2D_Arrays_Q7 {
	    public static int[][] generateMatrix(int n) {
	        int[][] matrix = new int[n][n];

	        int num = 1;
	        int rowStart = 0;
	        int rowEnd = n - 1;
	        int colStart = 0;
	        int colEnd = n - 1;

	        while (rowStart <= rowEnd && colStart <= colEnd) {
	            
	            for (int i = colStart; i <= colEnd; i++) {
	                matrix[rowStart][i] = num++;
	            }
	            rowStart++;

	           
	            for (int i = rowStart; i <= rowEnd; i++) {
	                matrix[i][colEnd] = num++;
	            }
	            colEnd--;

	            
	            if (rowStart <= rowEnd) {
	                for (int i = colEnd; i >= colStart; i--) {
	                    matrix[rowEnd][i] = num++;
	                }
	                rowEnd--;
	            }

	          
	            if (colStart <= colEnd) {
	                for (int i = rowEnd; i >= rowStart; i--) {
	                    matrix[i][colStart] = num++;
	                }
	                colStart++;
	            }
	        }

	        return matrix;
	    }

	    public static void main(String[] args) {
	        int n = 3;
	        int[][] matrix = generateMatrix(n);

	        
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	}

