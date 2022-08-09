package day017;

public class StringsMethodsSplit {
    public static void main(String[] args) {
        String name="Ömer Faruk Durmuş Boyabatlı";
        String[] names=name.split(" ");
        System.out.println(names.length);
        String initialLetters="";
        for (String s:names){
            initialLetters+=s.charAt(0);
        }
        System.out.println(initialLetters);

        String str="Elimizde uzunca bir cümle olduğunu varsayalım. Bu cümle kaç kelimeden oluşmaktadır?";
        System.out.println(countWords(str));
    }


    public static int countWords(String content){

        return content.split(" ").length;
    }
}