package introduction.day01variables;

public class Variables01 {

    public static void main(String[] args) {
        //java bu satiri okumaz. Kendimize veya baskasina aciklamidir.
       /*
       java bu satirlari da okumaz
        */
        //Variable olusturma
        //data type + variable name + atama operatoru + data + noktali virgul
        int age = 13;
        //java cumlesi ==> Statement
        //Data type + Varibale Name ==> Variable Declaration
        //Assignment Operator(atama operatoru) + Variable degeri ==> Assignment
        //Eger variable Declaration yapar, assignment yapmazsaniz Java kendi degerlerini (default==>varsayilan) koyar
        //Default degerler sayilar icin sifirdir.
        //Dilbilgisindeki nokta ne ise java daki noktali virgul ayni seydir. ve statementin bittigini gosterir
        //java da esittir demek "==". Yani Matematik te "=", java da "=="
        /*
            Java da temelde iki tip data vardir.
            1)primitive data type:
                char, boolean, byte, short, int, long, float, double
            2)non-primitive data type:
                String
        */
        //Ornek 1: Ogrenci ismi icin variable olusuturup deger olarak Ali Can atayiniz
        //String'lere verilen degerler daima cift tirnak icinde olmalidir
        String studentName = "Ali Can";
        //String bir variable olusturup ona her hangi bir atama yapmazsak java o variable a
        //default olarak "null" koyar
        //null demek 0 demek degil, 0 da coding te bir degerdir
        //null demek ici bos obje demektir.
        //yani icinde variable veya method bulunmayan default obje demektir
        // {}
        //char data type:
        //Tek karakterler icin kullanilir. ornegin ==> A, x, ?, 5
        //Ornek 2 : char data type'inda bir ismin ilk harfi olarak bir variable olusturunuz ve bir deger atayiniz.
        //Note : char data type'inda degerler tek tirnak icin konulmalidir.
        char isminIlkHarfi = 'A';
        //boolean data type:
        //boolean'lar sadece iki farkli deger alabilir; true (dogru) yada false (yanlis)
        //Ornek 3: boolean data type'inda emeklimisin icin bir variable olusturun ve false degerini atayin
        boolean emeklimisin = false;
        //byte data type:
        //tam sayilar icindir hafizada 1 byte yer kaplar
        //byte: -128 den +127 ye kadar tamsayi degerleri icin kullanilir
        //Ornek 4 : byte data type'inda ogrenci yasi icin bir variable  olusturunuz ve deger atayiniz.
        byte studentAge = 23;
        //short data type:
        //tam sayilar icindir hafizada 2 byte yer kaplar
        //short : -32768 ile 32767 arasindaki tamsayilar icin kullanilir
        //Ornek 5 : Site nufusu icin bir variable olusturun ve deger atayiniz
        short siteNufusu = 1200;
        //int data type:
        //tam sayilar icindir hafizada 4 byte yer kaplar
        //int -2,147,483,648 ile 2,147,483,647 arasindaki sayilar icindir
        //Ornek 6: Ulke nufusu icin bir variable olusturun ve deger atamasi yapiniz
        int countryPopulation = 186478463;
        //long data type:
        //tam sayilar icindir hafizada 8 byte yer kaplar
        //long: -9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807 arasindaki sayilar icindir
        //Ornek 7: insan vücudundaki hucre sayisi icin variable olusturup deger atamasi yapiniz.
        //Note: Bir deger long ise sonuna "L"(tercih edilir) veya "l" konulur
        long cellNumberInHumanBody = 878787878484818181L;
        //Eger long'a atadiginiz deger int'lerin araliginda ise sonuna 'l' koymaya gerek yok
        //long dememize ragmen sonuna L koymazsak eger int araliginda ise java onu int kabul eder
        long weightOfSun = 1354654L;
        //float data type:
        //float data tipi Virgullu sayilar (Ondalikli sayilar ==>Decimal Numbers) icin kullanilabilir
        //float hafizada  4 byte yer kaplar
        //Note: java ondalikli sayilari yani "Decimal Numbers"i otomatik olarak "double" kabul eder
        //eger float data type'i olmasinda israr ederseniz sonuna "F" yada "f" koymalisinz
        // Ornegin fiyatlandirmalar icin tercih edilebilir (12.99)
        //Ornek 8: Gomlek ve ayakkabi fiyatlari icin iki tane variable olusturup toplam fiyati ekrana yazdiriniz
        float shirtPrice = 12.99F;
        float shoesPrice = 15.99F;
        System.out.println(shirtPrice + shoesPrice);
        //System.out.println(); yazdirmanin kisayolu ==> sout yaz ve enter a bas
        int a = 12;
        int b = 13;
        System.out.print(a);
        System.out.println(b);
        //System.out.println(); ekrana yazdirir ve pointer i bir sonraki satira koyar
        //System.out.print(); ekrana yazdirir ve pointer i ayni satirda tutar.
        //double data type:
        //double data tipi Virgullu sayilar (Ondalikli sayilar ==>Decimal Numbers) icin kullanilabilir
        //double memoryde daha fazla(8 byte) yer kaplar, virgulden sonraki rakam daha fazla alir
        //Ornek 9: Hucre agirligi ve Amipin agirligi icin iki tane varibale olusturunuz ve agirliklari farkini console a yazidiriniz
        double weightCell = 0.0000000000000112;
        double weigthAmip = 0.0000000000000023;
        System.out.println(weightCell - weigthAmip);
    }
}
