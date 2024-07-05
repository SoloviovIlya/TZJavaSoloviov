import java.util.Scanner;

public class sJava2 {
    private static Scanner sc;
    public static void main(String[] args){
        String a,b;
        sc = new Scanner(System.in);
        System.out.println("Введите строку a: ");
        a = sc.nextLine();
        System.out.println("Введите сторку b: ");
        b = sc.nextLine();
        if (a.equals(b)) {System.out.println("Строки a и b идентичны.");} 
        else {System.out.println("Строки a и b не идентичны.");}
    }
}