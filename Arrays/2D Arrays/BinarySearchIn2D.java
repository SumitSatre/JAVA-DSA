public class BinarySearchIn2D {

    public static void BinarySearchIn2DArray(int arr[][], int key) {
        int row = 0;
        int col = arr[0].length - 1;
        // int count = 0;

        while (row < arr.length && col >= 0) {
            // count++;
            if (arr[row][col] == key) {
                // System.out.println("Count is : " + count);
                System.out.println("The element is found at : (" + row + "," + col + ")");
                return;
            } else if (key < arr[row][col]) {
                col--;
            } else {
                row++;
            }
        }
    }

    public static void main(String[] args) {

        // 4*4 matrix
        int arr4[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

        // 3*3 matrix
        //int arr3[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        BinarySearchIn2DArray(arr4, 13);
    }
}
