class XOR{

    // this method is used to frind xor of 1 to n elements directly
    static int getxor(int n){
        switch(n%4){
            case 0:
                return n;
            
            case 1:
                return 1;
            
            case 2:
                return n+1;

            case 3:
                return 0;
        }

        return -1;
    }

    public static void main(String []args){
        int n = 555;
        int xor = 0 ;

        for(int i = 1 ; i<=n ;i++){
            xor ^= i;
        }

        System.out.println("Xor is : " + xor);
        System.out.println("Xor is : " +  getxor(n));
    }
}