import javax.swing.plaf.metal.MetalTheme;
import java.util.*;

class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] Args) {
        System.out.println("Enter number form the user");
        String N = scan.nextLine();
        for(int i = N.length()-1 ;i >= 0;i--)
            System.out.print(N.charAt(i));
    }
}