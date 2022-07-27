package day03;

public class DataTypes {
    public static void main(String[] args) {
        //Escape characters
         String mesaj="Kişi, \\Benim adım Ahmet \\dedi.\n";
         System.out.println(mesaj);
         System.out.println("\t Selam!");
         final int pi=3; //constant

         int x,y,z;
         x=y=z=1;



         // satırın başından noktalı virgüle kadar olan kısma: statment
         x=7; System.out.println(x+y+z); //x+y+z: expression

          //Tam sayılar Whole numbers or integer

          byte b=-101;
          short s=0;
          int i=500_000;
          long l=5_000_000_000L;


          //Kesirli sayılar (Floating Point numbers)
          double kilo=72.8;
          float prices=45.5F;

          boolean dogruMu=false;
          boolean doluMu=true;
          boolean yetiskinMi=false;
          boolean isAdult=true;

          char aKarakteri='A';

          //type conversion - Tip dönüşmleri
           byte yas1=28;
           byte yas2=35;

           byte toplamYas=(byte)(yas1+yas2);

           System.out.println("Toplam yaş= "+ toplamYas);




    }
}
