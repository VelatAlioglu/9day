package day017;

public class StringsMethods {
    public static void main(String[] args) {
        String str1="Deneme mesajıdır.";
/*        int aranan=str1.indexOf(".");
        System.out.println(str1.length());
        System.out.println("Bulunan "+aranan);*/

//        System.out.println(str1.substring(7,12));

/*        System.out.println(findInitialLetters("Ahmet Dursun"));
        System.out.println(findInitialLetters("Seba Gitsin"));*/


        hideSomeCharsOfName("Ahmet Dursun");

    }

    /*
        Verilen ad ve soyadı içeren metinden sadece baş harflerini döndüren bir metot yazınız.
        Name: A h m e t   D u r s  u n
              0 1 2 3 4 5 6 7 8 9 10 11
     */
    public static String findInitialLetters(String name){
        char firstChar=name.charAt(0);
        int spaceIndex=name.indexOf(" ");
        char secondChar=name.charAt(spaceIndex+1);
        return firstChar+""+secondChar;
    }

    /*
        İsmi ve soyadı gizleyen bir metot yazınız. Sadece baş harfleri gözükecektir.
     */
    public static void hideSomeCharsOfName(String name){
        char firstLetter=name.charAt(0);
        int spaceIndex=name.indexOf(" ");
        char secondLetter=name.charAt(spaceIndex+1);
        String hidden="";
        for (int i = 0; i < name.length(); i++) {
            hidden+=i==0?firstLetter:i==spaceIndex+1?secondLetter:"*";
        }
        System.out.println(hidden);
    }

}