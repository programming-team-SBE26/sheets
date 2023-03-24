import javax.swing.plaf.metal.MetalTheme;
import java.util.*;

class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] Args) {
        System.out.println("Enter number form the user");
        String N = scan.nextLine();
        char[]num =new char[N.length()];
        num[0] = N.charAt(N.length()-1);
        for(int i = 1 ;i < N.length()-1;i++)
            num[i] = N.charAt(i);
        num[N.length()-1] = N.charAt(0);
        System.out.println("new number is :");
        for(char item : num)
        {
            System.out.print(item);
        }

    }
}