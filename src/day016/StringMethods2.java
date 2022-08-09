package day016;

public class StringMethods2 {

    public static void main(String[] args) {
/*        String str1=new String("Bu bir deneme mesajıdır.");
        str1=str1.replace("deneme","test");
        str1=str1.replace('ı','i');
        str1=str1.replace((char) 66,(char) 65);
        System.out.println(str1);*/


        System.out.println(" ".isEmpty());
        System.out.println(" ".isBlank());
        String str1="     Bu     bir    deneme     mesajıdır.     ";
        String str2="Bu bir deneme mesajıdır.";

        System.out.println(str1);
        System.out.println(str2);
        System.out.println("str1 : "+str1.length());
        System.out.println("str2 : "+str2.length());

        String str3=str1.trim();
        System.out.println(str3);
        System.out.println(str3.length());
        System.out.println(str1);

        System.out.println(str1.replace(" ",""));
        String str="Deneme";
        str+=" mesajıdır.";
        System.out.println(str);


    }
}