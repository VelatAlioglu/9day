package day017;

public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Mesaj: ");
        sb.append("Bu bir uyarı mesajıdır.");



        int x=5;
        sb.append(x);
        sb.append(" gündür buradayım.");


        sb.delete(0,7);
        sb.append(" Sen neredesin?");
        sb.insert(3,"önemli ");
        sb.reverse();
        sb.reverse();
        System.out.println(sb.toString());
    }
}