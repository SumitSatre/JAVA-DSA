public class CreationOfArrays {
    public static void main(String[] args){
        int marks[] ;
        marks = new int[20];

        marks[0] = 9;

        int numbers[]  = {1,2,3,4,5,6,7,8,9};

        for(int i = 0 ; i<numbers.length ;i++ ){
            System.out.print(numbers[i] + "  ");
        }

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }
}
