package day016;

public class StringsClass {
    public static void main(String[] args) {
        //String: Temelde bir karakterler dizisidir. String isminde bir class ile temsil edilir.
        //String,StringBuffer,StringBuilder--> java.lang kütüphanesinde bulunur
        String str1="Merhaba";
        String str2=new String("Merhaba");
        String str3="Merhaba";
        String str4=new String("Merhaba");
        System.out.println(str1);
        System.out.println(str2);
        if(str1==str2) System.out.println("İki metin aynıdır.");
        else System.out.println("Farklıdır.");
        System.out.println(str1==str3);
        System.out.println(str2==str4);
        if(str2.equals(str4)){
            System.out.println("Aynıdır.");
        }else {
            System.out.println("Farklıdır.");
        }

        String str5="merHaBa";
        String str6="merhaBa";
        System.out.println(str1==str5);
        System.out.println(str1.equals(str5));
        System.out.println(str1.equalsIgnoreCase(str5));

        String str7=new String("Merhaba").intern();

        System.out.println(str1==str7);


        System.out.println(StringMethods.reverse("Bu bir denemedir."));
        System.out.println(StringMethods.reverse("Bu nedir?"));
        System.out.println(StringMethods.reverse("Bu da ne?"));
    }
}