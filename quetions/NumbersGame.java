public class NumbersGame {
    static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    static boolean checkNumberWithDigitSum(int X, int N) {
        return X + digitSum(X) == N;
    }

    static int findNumberWithDigitSum(int N) {
        int low = 1, high = N;
        while (low <= high) {
            int mid = (low + high) / 2;
            System.out.println(mid);
            if (checkNumberWithDigitSum(mid, N)) {
                return mid;
            } else if (mid + digitSum(mid) < N) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int N = 1000;
        System.out.println("This is ans : " + findNumberWithDigitSum(N));
}
}

