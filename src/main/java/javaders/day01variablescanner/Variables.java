package javaders.day01variablescanner;

public class Variables {
    //byte, short, integer,long, double, float
    // veri tiplerinin max ve min degerlerini yazdiralim.

    public static void main(String[] args) {

        byte byteMax =Byte.MAX_VALUE;
        byte byteMin =Byte.MIN_VALUE;
        System.out.println("byteMax = "+byteMax);//sout byteMax = 127
        System.out.println("byteMin = " + byteMin);//soutv  byteMin = -128
//ctrl+z==>geri gelme

        long longMax = Long.MAX_VALUE;
        long longMin = Long.MIN_VALUE;

        System.out.println("longMax = " + longMax);//9223372036854775807
        System.out.println("longMin = " + longMin);//longMin = -9223372036854775808

        double doubleMax = Double.MAX_VALUE;
        double doubleMin = Double.MIN_VALUE;

        System.out.println("doubleMax = " + doubleMax);//doubleMax = 1.7976931348623157E308
        System.out.println("doubleMin = " + doubleMin);//doubleMin = 4.9E-324

        float floatMax = Float.MAX_VALUE;
        float floatMin = Float.MIN_VALUE;

        System.out.println("floatMax = " + floatMax);//floatMax = 3.4028235E38
        System.out.println("floatMin = " + floatMin);//   1.4E-45


    }//main
}//class body
