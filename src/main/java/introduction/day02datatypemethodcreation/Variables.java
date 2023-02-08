package introduction.day02datatypemethodcreation;

public class Variables {

    /*
  javada temelde iki tip data vardir
  1)primitive data type:
      char, boolean, byte, short, int, long, float, double
  2)non-primitive data type:
      String
   */
    /*
    Note 1: primitive data type'lari Java olusturmustur, biz olusturamayiz
    Note 2: primitve data type'larin isimlerinde sadece kucuk harf kullanilir
    Note 3: primitive datalar data type'larina gore memory'de farkli farkli yer kaplarlar
    Note 4: primitive data'lar iclerinde sadece sizin atadiğiniz degeri barindirirlar
     */
    /*
    non-primitive data types:
     1)Ornegin  String non-primitive bir data type ornegidir
     2)Uretilen her bir class ayni zamanda bir "non-primitive data type"dir.
     Bu yüzden "non-primitve data type"lar sinirsiz sayidadir
     3)Non-primitive data type'larin isimleri buyuk harf ile baslar
     4)Non-primitive data type'larin tamami icin Java memory'de ayni miktarda yer ayirir
     */
    public static void main(String[] args) {
        //Ornek 1: Sehir ismi icin bir variable olusturun ve bir deger atayip onu ekrana yazdirin.
        String cityName = "Ankara";
        System.out.println(cityName);
        int a = 13;
/*
        Interview sorusu: "primitive" ve "non-primitive " data type'lar arasindaki fark nedir?
        1)"primitive"ler sadece bizim atadigimiz degeri icerir;
          "non-primitive" ler bizim atadigimiz deger ve methodlar icerir
        2)"primitive"ler kucuk harfle baslar, "non-primitive" ler buyuk harf ile baslar
        3)"primitive"leri java uretmistir 8 tanedir
          "non-primitive"leri  java ve developerlar uretebilir bu yuzden sinirsiz sayidadir
        4)"primitive" ler memory de data type'ina gore yer kaplar
          "non-primitive" ler icin java memory'de hep ayni buyuklukte yer ayirir.
 */
    }
}
