import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ReadData {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public String s() throws Exception {
        return reader.readLine();
    }
}

class Envelope {
    ReadData readData = new ReadData();
    double a, b;
    {
        try {
            System.out.println("Enter the sides of the envelope");
            this.a = Double.parseDouble(readData.s());
            this.b = Double.parseDouble(readData.s());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Agreement {
    ReadData readData = new ReadData();
    String s;

    {
        try {
            s = readData.s();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


public class Task2{
    public static void main(String[] args) {
        do {
            Envelope envelope1 = new Envelope();
            double a = envelope1.a;
            double b = envelope1.b;
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            Envelope envelope2 = new Envelope();
            double c = envelope2.a;
            double d = envelope2.b;
            System.out.println("c = " + c);
            System.out.println("d = " + d);
            if (a < 0 || b < 0 || c < 0 || d < 0){
                System.out.println("Numbers must be positive");
            } else if (((a > c && a > d) && (b > c && b > d)) || (((a < c && a < d) && (b < c && b < d)))) {
                System.out.println("Success");
            } else {
                System.out.println("Impossible");
            }
            System.out.println("Would you like to continue?");
            Agreement agreement = new Agreement();
            String s = agreement.s;
            if (!(s.equalsIgnoreCase("yes") || s.equalsIgnoreCase("y"))) break;
        } while (true);
    }

//        Scanner scanner = new Scanner(System.in);
//        do {
//            System.out.println("Enter variables:");
//            double a = scanner.nextDouble();
//            double b = scanner.nextDouble();
//            double c = scanner.nextDouble();
//            double d = scanner.nextDouble();
//            System.out.println("a = " + a);
//            System.out.println("b = " + b);
//            System.out.println("c = " + c);
//            System.out.println("d = " + d);
//            if (a < 0 || b < 0 || c < 0 || d < 0){
//                System.out.println("Numbers must be positive");
//            } else if (((a > c && b > d) || (a > d && b > c)) || (((a < c && b < d) || (a < d && b < c)))) {
//                System.out.println("Success");
//            } else {
//                System.out.println("Impossible");
//            }
//            System.out.println("Would you like to continue?");
//            String text = scanner.next();
//            if (!(text.equalsIgnoreCase("yes") || text.equalsIgnoreCase("y"))) break;
//        } while (true);
    }

