import java.util.Scanner;

public class Task2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter variables:");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();
            double d = scanner.nextDouble();
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("c = " + c);
            System.out.println("d = " + d);
            if (a < 0 || b < 0 || c < 0 || d < 0){
                System.out.println("Numbers must be positive");
            } else if (((a > c && b > d) || (a > d && b > c)) || (((a < c && b < d) || (a < d && b < c)))) {
                System.out.println("Success");
            } else {
                System.out.println("Impossible");
            }
            System.out.println("Would you like to continue?");
            String text = scanner.next();
            if (!(text.equalsIgnoreCase("yes") || text.equalsIgnoreCase("y"))) break;
        } while (true);
    }
}
