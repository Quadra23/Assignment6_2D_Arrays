

	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.List;
	import java.util.Map;

	public class Assignment6_2D_Arrays_Q6 {
	    public static int[] findOriginalArray(int[] changed) {
	        if (changed.length % 2 != 0) {
	            return new int[0]; 
	        }

	        Map<Integer, Integer> countMap = new HashMap<>();
	        List<Integer> originalList = new ArrayList<>();

	        
	        for (int num : changed) {
	            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
	        }

	        
	        for (int num : changed) {
	            if (countMap.containsKey(num) && countMap.containsKey(num * 2)) {
	                originalList.add(num);
	                int freq = countMap.get(num);
	                if (freq == 1) {
	                    countMap.remove(num);
	                } else {
	                    countMap.put(num, freq - 1);
	                }
	                countMap.put(num * 2, countMap.get(num * 2) - 1);
	            }
	        }

	        if (originalList.size() != changed.length / 2) {
	            return new int[0];
	        }

	        int[] originalArray = new int[originalList.size()];
	        for (int i = 0; i < originalList.size(); i++) {
	            originalArray[i] = originalList.get(i);
	        }

	        return originalArray;
	    }

	    public static void main(String[] args) {
	        int[] changed = {1, 3, 4, 2, 6, 8};
	        int[] original = findOriginalArray(changed);

	        if (original.length == 0) {
	            System.out.println("No valid original array exists for the given changed array.");
	        } else {
	            System.out.print("Original Array: [");
	            for (int i = 0; i < original.length; i++) {
	                if (i > 0) {
	                    System.out.print(", ");
	                }
	                System.out.print(original[i]);
	            }
	            System.out.println("]");
	        }
	    }
	}

