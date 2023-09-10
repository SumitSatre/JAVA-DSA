import java.lang.Math;

public class BinaryToDecimal {
    
    public static void ConvertBinaryToDecimal(int binaryNumber){

        int i = 0;
        int result = 0;

        while(binaryNumber != 0){
            
            int bit = binaryNumber % 10;
            binaryNumber /= 10;

            result += ((int) bit)* Math.pow(2 , i);
            i++;
        }

        System.out.println("Binary to Decimal Conversion: " +result);
    }

    public static void main(String [] args){

        ConvertBinaryToDecimal(101);
    }
}
