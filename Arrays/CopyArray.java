class CopyArray {
    public static void main(String args[]) {
        int marks[] = {1,2,33};

        int arr[];
        arr = marks;

        arr[1] = 5454;

        System.out.println(marks[1]);

        
    }
}
