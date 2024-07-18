import java.util.ArrayList;

public class RearrangeElementsBySign {

    public static int[] alternateNumbers1(int[] a) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for (int ele : a) {
            if (ele > 0) {
                pos.add(ele);
            } else {
                neg.add(ele);
            }
        }

        int k = 0;
        for (int i = 0; i < a.length; i = i + 2) {
            a[i] = pos.get(k);
            a[i + 1] = neg.get(k);
            k++;
        }

        return a;
    }

    public static int[] alternateNumbers2(int[] a) {

        int pos = 0;
        int neg = 1;

        int i = 0;

        int ans[] = new int[a.length];

        while (i < a.length) {
            if (a[i] > 0) {
                ans[pos] = a[i];
                pos = pos + 2;
            } else {
                ans[neg] = a[i];
                neg = neg + 2;
            }
            i++;
        }

        return ans;
    }

    public static void main(String[] args) {

    }
}
