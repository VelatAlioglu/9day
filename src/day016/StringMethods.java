package day016;

public class StringMethods {
    public static void main(String[] args) {

/*            JFrame pencere=new JFrame("Hesap makinesi");
            pencere.setSize(800,600);
            pencere.setVisible(true);*/


        String str1="Bu bir Java uygulamasıdır.";
//        String str2="Mesajımdır.";

        System.out.println(str1);
/*        //String nesneleri immutable, yani değiştirilemezler
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());
        //str1=str1.toUpperCase();
        //System.out.println(str1);
        String str2="Herhangi bir metin.";
        str2=str1;
        System.out.println(str1);
        String str3=new String("Bu bir String nesnesidir.");
        str3=str2;
        System.out.println(str3);*/

//        System.out.println(str1.length());

        for (int i = 0; i < str1.length(); i++) {
            System.out.print(str1.charAt(i));
        }

        System.out.println();
        for (int i = str1.length()-1; i >=0 ; i--) {
            System.out.print(str1.charAt(i));
        }

        System.out.println();

        String str2=reverse(str1);
        System.out.println(str2);

    }
    //Bir metin içeriğini tersten oluşturan metot
    public static String reverse(String content){
        String result="";
        for (int i = content.length()-1; i >=0 ; i--) {
            result+=content.charAt(i);
        }
        return result;
    }
}