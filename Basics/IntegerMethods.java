class IntegerMethods{
    public static void main(String[] args) {
        int x = 12345;
        int result = 0;

        while(x > 0){
            int decimal = x % 10;
            x = x /10;

            result = 10 * result + decimal;
        }

        System.out.println(result);
    }
}
