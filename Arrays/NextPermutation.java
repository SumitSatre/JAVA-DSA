import java.util.Arrays;
import java.util.Stack;

public class NextPermutation {

    // public static void main(String[] args) {
    //     String str = "dcd";
    //     String nextPerm = getNextPermutation(str);
    //     System.out.println("Next permutation of " + str + " is: " + nextPerm);
    // }

    public static String getNextPermutation(String str) {
        char[] arr = str.toCharArray();
        int n = arr.length;

        // Step 1: Find the largest index i such that arr[i] < arr[i + 1]
        int i = n - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        // If no such index exists, return "no answer" (or the smallest permutation)
        if (i < 0) {
            return "no answer"; // or return new String(arr);
        }

        // Step 2: Find the largest index j such that arr[i] < arr[j]
        int j = n - 1;
        while (arr[j] <= arr[i]) {
            j--;
        }

        // Step 3: Swap the value of arr[i] with that of arr[j]
        swap(arr, i, j);

        // Step 4: Reverse the sequence from arr[i + 1] to the end of the string
        reverse(arr, i + 1, n - 1);

        return new String(arr);
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void reverse(char[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 0, 1, 0, 0},
            {1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1},
            {1, 0, 0, 1, 0}
        };
        
        System.out.println("Maximum size of rectangle containing only 1s: " + maximalRectangle(matrix));
    }

    public static int maximalRectangle(int[][] matrix) {
        if (matrix.length == 0) return 0;
        int maxArea = 0;
        int[] height = new int[matrix[0].length];
        
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                // update the current row's histogram based on the matrix values
                if (matrix[row][col] == 0) {
                    height[col] = 0;
                } else {
                    height[col] += 1;
                }
            }
            // calculate the maximum area for the current histogram
            maxArea = Math.max(maxArea, largestRectangleArea(height));
        }
        
        return maxArea;
    }

    private static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int index = 0;

        while (index < heights.length) {
            if (stack.isEmpty() || heights[index] >= heights[stack.peek()]) {
                stack.push(index++);
            } else {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? index : index - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
        }

        while (!stack.isEmpty()) {
            int height = heights[stack.pop()];
            int width = stack.isEmpty() ? index : index - stack.peek() - 1;
            maxArea = Math.max(maxArea, height * width);
        }

        return maxArea;
    }
}
