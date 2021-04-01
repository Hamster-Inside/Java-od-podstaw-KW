package data.types;

import java.math.BigDecimal;

public class J01_variable_declaration {
    public static void main(String[] args) {

        double number = 24;
        number = 98.123456789d;
        System.out.println("Variables main -> " + number);
        int array[] = {5, 55, 555};
        int numArr[] = new int[10];

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        double doubleArr[] = new double[5];
        doubleArr[0] = 0.2342342;
        doubleArr[1] = 1.23423423;
        for (int j = 0; j < doubleArr.length; j++) {
            System.out.println(doubleArr[j]);
        }

        double num = 4.0d;
        double sqrt = Math.sqrt(num);
        System.out.println(sqrt);
       for (double k=0; k<11; k++) {
           BigDecimal randomowa = new BigDecimal(Math.random());
           System.out.println("random = " + randomowa);
       }

    }
}
