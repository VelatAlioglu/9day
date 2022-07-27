package day05;

public class IfStatement {
    public static void main(String[] args) {
        int yas=28;


        //Yetiskin olup olmama
        if  (yas>=18){
            System.out.println("Kisi yetiskindir.");
        }else {
            System.out.println("yetiskin değildir");
        }

        //Yası 70'den büyük 18'den kücük olma durumu
        if (yas<18|yas>=70){
        System.out.println("sosyal yardım alabilir.");
        }else {
            System.out.println("Sosyal yardım alamaz");
        }

        //time-memory complexity


        int x=65; //decimal
        int y=0b01000001;    //01000001
        int z=0x41;


        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
