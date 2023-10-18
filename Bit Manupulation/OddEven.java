class OddEven{
    public static void main(String[] args){
        
        int n = 3  ,mask = 1;

        int res = n&mask;

        if(res == 0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }
    }
}