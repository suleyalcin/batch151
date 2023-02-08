package practice.practice_daytime;

public class Q02_KullaniciBilgileri {

    /*
 firstname, lastname, age, height ve weight değişkenlerini konsola aşağıdaki gibi yazdıran bir kod yazınız:
         First Name: ...
         Last Name: ...
         Age: ...
         Height: ...
         Weight: ...
 Not: Sadece bir adet "System.out.println(); kullanınız.
 */
    public static void main(String[] args) {

        String firstName = "Ali";
        String lastName = "Can";
        byte age = 15;
        double height = 1.4;
        double weight = 45.6;

        System.out.println("First Name: " + firstName + "\nLast Name: " + lastName + "\nAge: " + age + "\nHeight: " + height + "\nWeight: " + weight);

    }
}
