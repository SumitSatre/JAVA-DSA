import java.util.Arrays; 
class CopyArray {
    public static void main(String args[]) {
        int marks[] = {1,2,33};
        int m[] = {1,2,33};

        int arr[] = new int[5];
        // arr = marks;

        arr[1] = 5454;

        System.out.println(marks[1]);


        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.equals(marks , m));
    }
}
