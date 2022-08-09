package day017;

public class StringConcat {
    public static void main(String[] args) {
        String fName="Hakan";
        String lName="Şükür";

        String name=fName.concat(" ");
        name=name.concat(lName);
        name=name.toUpperCase();

        System.out.println(fName.concat(" ").concat(lName).toUpperCase());
        System.out.println(fName);

    }
}
