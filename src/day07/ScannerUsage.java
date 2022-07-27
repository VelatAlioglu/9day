package day07;

import java.util.Scanner;

public class ScannerUsage {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String isim=input.nextLine();
        System.out.println("Merhaba"+isim);

    }
}
