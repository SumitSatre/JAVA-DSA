public class Basic {
    
    // Binary search function
    int binarySearch(int arr[], int size, int key) {
        int start = 0;
        int end = size - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2; // Calculate mid to avoid integer overflow
            
            if (arr[mid] == key) {
                return mid; // Key found at index mid
            }
            
            if (arr[mid] < key) {
                start = mid + 1; // Search the right half
            } else {
                end = mid - 1;   // Search the left half
            }
        }
        
        return -1; // Key not found
    }

    public static void main(String[] args) {
        Basic basic = new Basic(); // Create an instance of the Basic class
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15};
        int size = arr.length;
        int key = 7;
        
        int result = basic.binarySearch(arr, size, key);
        if (result != -1) {
            System.out.println("Key found at index: " + result);
        } else {
            System.out.println("Key not found");
        }
    }
}
