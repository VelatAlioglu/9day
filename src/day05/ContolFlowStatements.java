package day05;

public class ContolFlowStatements {
    public static void main(String[] args) {
        //Mantıksal Operatçrler
        //&,|,!
        // &&,|| ----> short cut and, short cut or

        
        boolean b1=false&false;  //False
        boolean b2=false&true;
        boolean b3=true&false;   //İkiside true olmadığı sürece sonuc false olur.
        boolean b4=true&true;    //True

        boolean b5=false|false;  //ikiside false olmadıgı sürece sonuç true olur.
        boolean b6=false|true;
        boolean b7=true|false;
        boolean b8=true|false;

        boolean b9=!(true&false);
        boolean b10=!(true|false);



        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        System.out.println();

        System.out.println(b5);
        System.out.println(b6);
        System.out.println(b7);
        System.out.println(b8);

        System.out.println();

        System.out.println(b9);
        System.out.println(b10);

    }
}
