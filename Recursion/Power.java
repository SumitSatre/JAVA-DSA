class Power {

    static int optimisedPower(int x , int n){
        if(n==0){
            return 1;
        }

        int halfPower = optimisedPower(x , n/2);
        System.out.println(halfPower);
        int halfPowerSqaure = halfPower * halfPower;

        if(n%2 != 0){
            halfPowerSqaure = x * halfPowerSqaure;
        } 

        return halfPowerSqaure;
        
    }

    public static void main(String[] args){
        System.out.println(optimisedPower(3 , 2));
    }
}