package day010;

public class MainApp {
    public static void main(String[] args) {
/*        Scanner input=new Scanner(System.in);
        System.out.print("Not : ");
        int not=input.nextInt();
        if (not<0){
            System.err.println("Ders notu negatif olamaz.");
            System.exit(-1);
        }
        System.out.println("Hesaplandı.");
        */

        int deger=1;
        for (int i = 1; i <=10 ; i++) {
            for (int j = 1; j <=10 ; j++) {
                System.out.print(j+"x"+i+"="+(j*i)+"\t");
            }
            System.out.println();


        }



    }
}