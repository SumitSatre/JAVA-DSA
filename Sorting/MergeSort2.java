public class MergeSort2 {

  public static void mergTwoSortedArrays(int arr[], int start, int end) {
    int mid = (start + end) / 2;
    int length1 = mid - start + 1;
    int length2 = end - mid;

    int a1[] = new int[length1];
    int a2[] = new int[length2];

    int s = 0;
    int k = start;
    while (s < length1) {
      a1[s++] = arr[k++];
    }

    s = 0;
    while (s < length2) {
      a2[s++] = arr[k++];
    }

    k = start;
    int i = 0, j = 0;

    while (i < length1 && j < length2) {
      if(a1[i] <= a2[j]){
        arr[k++] = a1[i++];
      }

      else if(a1[i] >= a2[j]){
        arr[k++] = a2[j++];
      }
    }

    while(i<length1){
      arr[k++] = a1[i++];
    }

    while(i<length2){
      arr[k++] = a2[j++];
    }
  }

  public static void mergSort(int arr[], int start, int end) {

    if (start >= end) {
      return;
    }

    int mid = (start + end) / 2;

    mergSort(arr, start, mid);
    mergSort(arr, mid + 1, end);

    mergTwoSortedArrays(arr, start, end);
  }

  public static void main(String[] args) {

    int arr[] = { 1, 5, 9, 2, 8, 89 };

    mergSort(arr, 0, 5);

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + "  ");
    }

  }
}