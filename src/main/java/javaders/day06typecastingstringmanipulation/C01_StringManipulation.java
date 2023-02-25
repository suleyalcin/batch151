package javaders.day05typecastingasciivaluestringmanipulations.day06typecastingstringmanipulation;

public class C01_StringManipulation {

    public static void main(String[] args) {
        String a = "Benim Tek Rakibim Dunku Ben*." ;
        // ************ toUpperCase() ***************\\
        String aUpper = a.toUpperCase();
        System.out.println("aUpper = " + aUpper);
        //aUpper = TEK RAKİBİM DUNKU BEN .
        // ************ toLowerCase() ***************\\
        String aLower = a.toLowerCase();
        System.out.println("aLower = " + aLower);
        //aLower = tek rakibim dunku ben .

        // ************ charAt() ***************\\
        System.out.println("ilk karakter : "+(a.charAt(0)));//T
        System.out.println(a.charAt(10));//m

        // a String'indeki bastan ikinci ve sondan ikinci karakteri aliniz ve yan yana yazdiriniz.
        char firstChar =a.charAt(1);
        char lastSecondChar =a.charAt(21);
        System.out.println( firstChar+" "+lastSecondChar);//e n


        // ************ lenght() ***************\\
        // a String'inde bulunan karakter sayisini bulunuz
        System.out.println(a.length());//23

        // ************ substring() ***************\\
        // a String'indeki ilk 4 karakteri aliniz
        String sub1 = a.substring(0,4);//0 dahil  4 haric  [0,4)==> 0 .index, 1.index,2.index,3.index==> alinir
        // 4.indexden itibaren alinmaz

        System.out.println("sub1 = " + sub1);//Beni

        //a String'indeki 4.index dahil 7.index haric yazdiriniz
        System.out.println(a.substring(4, 7));//m  T


        //"Benim Tek Rakibim Dunku Ben* ."
        // a String'indeki "Rakib" kelimesini aliniz

        System.out.println(a.substring(10, 15));//Rakib

        System.out.println(a.substring(10));//Rakibim Dunku Ben*.
        // ************ contains() ***************\\
        //a String'inde "bim" kelimesinin olup olmadigini kontrol ediniz
        boolean varMi =a.contains("bim");
        System.out.println("varMi = " + varMi);//true

        // ************ startsWith() ***************\\

        // a String'inin "T" harfiyle baslayip baslamadigini kontrol ediniz

        System.out.println(a.startsWith("T"));//false
        System.out.println(a.startsWith("Tek", 6));
        //true  ilk 6 karakateri at; sonrasi "Tek " kelimesiyle basliyor mu ?
        //prefix  baslangic   offset : at gitsin

        // Universite numaralari yil+BolumKodu+GirisSirasi  olarak duzenlenen bir okulda
        //ogrenci Umran'in Hukuk Fakultesinde okuyup okumadini gosteren kodu yaziniz

        /*
        sinif  22   Hukuk  33    bilgisayar  44    Eczacilik  55    Maliye 66
        KimyaMuhendisligi 77  olsun
         */

        String str = "20103301";
        System.out.println(str.startsWith("33", 4));//true


    }//main
}//class
