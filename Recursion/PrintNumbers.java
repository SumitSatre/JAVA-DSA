class PrintNumbers{

    static void numbersInDecreasingOrder(int n){

        // base case
        if(n<1){
            return; 
        }

        System.out.print(n + "  ");
        numbersInDecreasingOrder(n-1);
    }

    static void numbersInIncreasingOrder(int n){

        // base case
        if(n<1){
            return; 
        }

        numbersInIncreasingOrder(n-1);
        System.out.print(n + "  ");
    }

    public static void main(String []args){
        numbersInDecreasingOrder(10);
        numbersInIncreasingOrder(10);
    }
}