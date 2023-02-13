package introduction.day02datatypemethodcreation;

public class MethodCreation01 {

    /*
   java'da method nasil olusturulur?
   1)main method'un disinda classin icinde olusturulur
   2)Access Modifier + Return Type + Method ismi + () + {}
   Olusturulan methodlar nasil kullanilir?
   1)main method'un icinden kullanilir
   2)method'un ismi + () yazin
   3)Islem yapacağınız parametreleri parantez icine koyun
    */
    public static void main(String[] args) {
        int sonuc = toplamaYap(3, 5);
        System.out.println(sonuc);
        long carpmaSonuc = multiply(3, 6);
        System.out.println(carpmaSonuc);
        int ucluSonuc = firstTwoMultiplyThirdAdd(2, 3, 4);
        System.out.println(ucluSonuc);
        System.out.println(getCube(5));
        print("Hello world");
        print("hamit");
    }
    //Ornek1: toplama islemi yapan bir method olusturunuz
    //main method static oldugu icin main method icerisinde kullanacğınız hersey static olmalidir
    public static int toplamaYap(int a, int b) {
        return a + b;
    }
    //Ornek 2: 2 sayiyi carpma islemi yapan bir method olusuturunuz
    protected static long multiply(int a, int b) {
        return a * b;
    }
    //Ornek 3: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile taplayan methodu olusturunuz
    private static int firstTwoMultiplyThirdAdd(int a, int b, int c) {
        return a * b + c;
    }
    //Ornek 4: Verilen bir ondalik sayinin kupunu hesaplayan methodu olusturup kullaniniz
    //NOTE: ACCESS MODIFIER'I default YAPMAK icin access modifier YAZMAYİNİZ
    static double getCube(double a){
        return a*a*a;
    }
    //Ornek 5: Girilen bir kelimeyi ekrana yazdiran bir method olusturup kullaniniz
    public static void print (String str) {
        System.out.println(str);
    }
    //methodun return type'i void ise method body icinde return keyword yazilmaz.
    //eger bir method yeni bir data üretmiyor ise return type'i void olur
}
