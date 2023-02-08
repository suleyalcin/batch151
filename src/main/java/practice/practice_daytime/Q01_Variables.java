package practice.practice_daytime;

public class Q01_Variables {

    public static void main(String[] args) {

        //Bir variable başlat
        int age = 15;
        int number = 43;
        String isim = "Ali";

        System.out.println(age);
        System.out.println("number = " + number);
        System.out.println("isim = " + isim);

        //Variable değerini kopyala
        int myAge = age;
        System.out.println("myAge = " + myAge);
        String onunIsmi = isim;
        System.out.println("onunIsmi = " + onunIsmi);

        //Aynı satırda çoklu variable deklere et
        int year = 2022, month = 5, day = 15;
        System.out.println("month = " + month);
        System.out.println("year = " + year);

        //Bir variable değerini güncelle
        year = 2023;
        System.out.println("year = " + year);

        year = 2030;
        System.out.println("year = " + year);

        isim = "Veli";
        System.out.println("isim = " + isim);
        System.out.println("onunIsmi = " + onunIsmi);

        //Bir variable deklere et : x
        double x;

        //Bir variable başlat : y
        double y = 55.6;

        //Başka bir variable başlat : z
        double z = 10;

        //x değişkenini y değişkeni ile başlat
        x = y;
        //Variable'i güncelle
        x = 15.3;

        //Değişkenleri yazdır
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

    }
}
