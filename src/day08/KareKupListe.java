package day08;

public class KareKupListe {
    public static void main(String[] args) {
        System.out.println("Sayı\tKaresi\tKüpü");
        for (int i = 1; i <=10; i++) {
            if (i%2==0) continue;
            System.out.print(i);
            System.out.print("\t");
            System.out.print(i*i);
            System.out.print("\t");
            System.out.print(i*i*i);
            System.out.print("\n");


        }
    }
}
