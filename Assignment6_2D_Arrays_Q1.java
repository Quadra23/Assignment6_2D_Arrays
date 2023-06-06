

	import java.util.ArrayList;
	import java.util.List;

	public class Assignment6_2D_Arrays_Q1 {
	    public int[] findPermutation(String s) {
	        int n = s.length();
	        int[] perm = new int[n + 1];
	        List<Integer> nums = new ArrayList<>();

	       
	        for (int i = 0; i <= n; i++) {
	            perm[i] = i;
	        }

	        
	        for (int i = 0; i < n; i++) {
	            if (s.charAt(i) == 'D') {
	                int j = i;
	                while (i < n && s.charAt(i) == 'D') {
	                    i++;
	                }
	                reverse(perm, j, i);
	            }
	        }

	       
	        for (int i = 0; i <= n; i++) {
	            nums.add(perm[i]);
	        }

	       
	        int[] permutation = new int[n + 1];
	        for (int i = 0; i <= n; i++) {
	            permutation[i] = nums.get(i);
	        }

	        return permutation;
	    }

	    
	    private void reverse(int[] perm, int start, int end) {
	        while (start < end) {
	            int temp = perm[start];
	            perm[start] = perm[end];
	            perm[end] = temp;
	            start++;
	            end--;
	        }
	    }

	    public static void main(String[] args) {
	    	Assignment6_2D_Arrays_Q1 reconstructPermutation = new Assignment6_2D_Arrays_Q1();
	        String s = "IDID";
	        int[] perm = reconstructPermutation.findPermutation(s);
	        System.out.println("Permutation: " + java.util.Arrays.toString(perm));
	    }
	}

