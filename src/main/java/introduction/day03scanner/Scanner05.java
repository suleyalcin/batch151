package introduction.day03scanner;

import java.util.Scanner;

public class Scanner05 {

    public static void main(String[] args) {
        //Kullanicidan bir dikdörtgenin iki kenar uzunlugunu aliniz
        //i) Alanini hesaplayiniz ==> Kisa kenar * Uzun Kenar
        //ii) Cevresini hesaplayiniz ==> 2 * Kisa kenar + 2 * Uzun kenar
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Dikdortgenin kisa kenar uzunlugunu giriniz..");
        double shortSide = input.nextDouble();
        System.out.println("Lutfen Dikdortgenin uzun kenar uzunlugunu giriniz..");
        double longSide = input.nextDouble();
        double alan = shortSide*longSide;
        System.out.println("Alan = "+alan);//tavsiye edilen
        System.out.println("Cevre = "+(2*shortSide+2*longSide));
    }
}
