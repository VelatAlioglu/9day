package day017;

public class StringFormat {
    public static void main(String[] args) {
        String isim="Ahmet";

        //%s ve %n kullanımı:
        //%s-->placeholder for string value
        //%n-->placeholder for new line (carriage return)
        System.out.printf("Merhaba %s!%n",isim);
        System.out.println("Merhaba "+isim+"!");

        //%f-->floating point numbers
        double price=2005.43;
        String message=String.format("Price =%8.2f",price);
        System.out.printf("Price = %8.2f%n",25.3);
        System.out.printf("Price = %8.2e%n",25.3);
        System.out.println(message);


        //%b-->null ve false durumunda false, diğer bütün değerler için true gösterir.
        System.out.printf("Result : %b%n",null);

        System.out.printf("Result : %x%n",65);
        System.out.printf("Result : %c%n",65);
        System.out.printf("Result : %d%n",65);
        System.out.printf("Result : %o%n",65);

    }
}