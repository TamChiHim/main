import java.util.Scanner;
public class Hello {
    public static void main(String [] args) {
        new Hello().runApp();
    }
    void runApp() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.print("Enter your age: ");
        int age = in.nextInt();
        String dummy = in.nextLine();
        System.out.print("Enter your name1: ");
        String name1 = in.nextLine();
        System.out.println();
        System.out.println("Hello " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("Hello " + name1 + "!");
        in.close();
    }
}





