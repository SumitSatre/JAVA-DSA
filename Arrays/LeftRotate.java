public class LeftRotate {

  public static void leftRotate(int arr[], int d) {
    int n = arr.length;

    for (int i = 0; i < d; i++) {
      int ele = arr[0];

      for (int j = 1; j < n; j++) {
        arr[j - 1] = arr[j];
      }
      arr[n - 1] = ele;
    }

    for (int x : arr) {
      System.out.print(x + " ");
    }
    System.out.println();
  }

  static void rotateArr(int arr[], int d, int n) {
    d = d % n;
    reverse(arr, 0, d - 1);
    reverse(arr, d, n - 1);
    reverse(arr, 0, n - 1);
  }

  static void reverse(int arr[], int start, int end) {
    while (start < end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5, 6 };

    // leftRotate(arr , 6);
    // leftRotate(arr , 2);

    rotateArr(arr, 6, 6);
    for (int x : arr) {
      System.out.print(x + " ");
    }
    System.out.println();
  }
}
