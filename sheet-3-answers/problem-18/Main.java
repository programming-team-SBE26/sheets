import javax.swing.plaf.metal.MetalTheme;
import java.util.*;

class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] Args) {
        System.out.println("Enter number form the user");
        String N = scan.nextLine();
        int res =1 ;
        for(int i = 0 ; i< N.length();i++)
            res*= N.charAt(i) - '0';
        System.out.println("result equal " + res);
    }
}