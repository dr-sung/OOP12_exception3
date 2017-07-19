
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        String s = "";
        for (;;) { // infinite loop
            System.out.print("Enter an integer: ");
            try {
                s = input.next();
                n = Integer.parseInt(s);
                break;
            } catch (NumberFormatException e) {
                System.out.println(s + " is an invalid input");
            }
        }
        
        System.out.println("You entered: " + n);
    }

}
