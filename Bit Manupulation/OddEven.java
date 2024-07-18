class OddEven{
    public static void main(String[] args){
        
        int n = -10  ,mask = 1;

        int res = n&mask;

        if(res == 0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }

        int val = 4^2^2;
        System.out.println("This is xor : "+ val);
        System.out.println("This is xor : "+ ~(-3));
        System.out.println("This is xor : "+ ~(0));
        System.out.println("This is xor : "+ ~(3));
    }
}