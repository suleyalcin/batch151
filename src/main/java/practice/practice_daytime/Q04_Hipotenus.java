package practice.practice_daytime;

public class Q04_Hipotenus {

    //Hipotenüs hesaplayan bir kod yazınız
    public static void main(String[] args) {


        System.out.println(hipotenusHesapla(3, 4));

    }

    public static double hipotenusHesapla(double dikKenar1, double dikKenar2) {

        double hipotenus = Math.sqrt(dikKenar1 * dikKenar1 + dikKenar2 * dikKenar2);

        return hipotenus;
    }
}
