import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, what is your name?");
        String name = scanner.nextLine();
        System.out.println(name.length());
        System.out.println(name.substring(0,3));
        System.out.println(name.equals("Java"));
        System.out.println(name.compareTo("Java"));

    }
}