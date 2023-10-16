class PairSumInRotatedArray {

    public static int findBreakingPoint(int arr[], int n) {

        int start = 0, end = n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[(mid + 1) % n] && arr[mid] > arr[(mid - 1 + n) % n]) {
                return mid;
            }

            if (arr[mid] >= arr[start]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {11, 15, 6, 8, 9, 10};

        System.out.println(findBreakingPoint(arr, arr.length));
    }
}
