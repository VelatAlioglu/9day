package day04;

public class Operators {
    public static void main(String[] args) {
        // Operators
        // Arithmetic Operators
        /*
              Toplama: + --> operand1 ve operand2'nin değerlerini toplar.
              Çıkarma: - --> operand1 ve operand2'nin farkını alır.
              Çarpma: *  --> operand1 ve operand2'nin değerleini çarpar.
              Bölme: /   --> operand1'i operand2'ye böler.
              Mod alma: % --> operand1'in operand2'ye bölümünden kalnı verir.
         */
        int sayi1=20;
        int sayi2=30;

        System.out.println("Toplam = "+(sayi1+sayi2));


        int fark=sayi1-sayi2;

        System.out.println("Fark = "+ fark);

        int result=sayi1*sayi2;

        System.out.println("Result = "+result);


        double sonuc=(double) sayi2/sayi1;

        System.out.println("Sonuç = "+sonuc);

        int kalan=10%2;
        System.out.println("Kalan =  "+kalan);

        int sayi=5;

        System.out.println("Sayı -->"+sayi);
        sayi++;
        System.out.println("Sayı -->"+sayi);
    }
}
