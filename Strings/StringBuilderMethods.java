import java.util.*;
import java.lang.*;

public class StringBuilderMethods {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(5);

        sb.append("abcdrfg");

        System.out.println( sb );

        //sb.chars().forEach((ch));

        sb.toString().chars().forEach(ch -> {
            System.out.print(ch + " ");
        });

        sb.chars().forEach(ch -> {
            System.out.print(ch + " ");
        });

        int cap = sb.capacity();
        System.out.println(cap);

        char[] chs = {'a' , 'b' , 'f' , 'f'};

        StringBuilder str = new StringBuilder("45");

        int a = Integer.parseInt(Character.toString('4'));

        System.out.println(Character.getNumericValue('0'));

        str.append(123);

        System.out.println(str);

        StringBuilder x = new StringBuilder("45");
        x.insert(2 , "Sumit");
        x.insert(2 , " ");

        x.replace(0 , 2 , "Satre");

        // x.setLength(2);

        System.out.println(x);
    }
}

//s.split("\\s+")
