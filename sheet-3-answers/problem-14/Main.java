import javax.swing.plaf.metal.MetalTheme;
import java.util.*;

class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] Args) {
        System.out.println("Enter number form the user");
        String num = scan.nextLine();
        System.out.println("the first digit is " + num.charAt(0));
        System.out.println("the last digit is " + num.charAt(num.length()-1));
    }
}