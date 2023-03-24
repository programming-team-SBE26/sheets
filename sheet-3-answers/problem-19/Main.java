import javax.swing.plaf.metal.MetalTheme;
import java.util.*;

class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] Args) {
        System.out.println("Enter number of rows");
        int count = scan.nextInt();
        for(int i = 0 ;i < count;i++)
        {
            for(int j = 0 ; j <= i ;j++)
            {
                System.out.print(fact(i)/(fact(j)*fact(i-j))+ " ");
            }
            System.out.println();
        }
    }
    public static int fact(int n) { // factorial
        if (n == 0 || n == 1)
            return 1;
        else
            return n * fact(n-1);
    }
}