package day07;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz: ");
        int sayı1=input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        int sayı2=input.nextInt();

        if (sayı1>sayı2){
            System.out.println("Birinci sayı büyüktür.");
        }else if (sayı1>sayı2){
            System.out.println("İkinci sayı büyüktür.");
        }else {
            System.out.println("İki sayı esittir.");
        }
    }
}
