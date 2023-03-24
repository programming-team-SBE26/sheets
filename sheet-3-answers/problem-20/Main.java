import javax.swing.plaf.metal.MetalTheme;
import java.util.*;

class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] Args) {
        System.out.println("Enter number of rows");
        int count = scan.nextInt();
        for(int i = 0 ;i < count;i++)
        {
            for(int u = 0 ;u < i ;u++)
                System.out.print(" ");
            for(int j = 0 ; j < count-i ;j++)
            {
                System.out.print("* ");
            }
            if(i+1<count)
                 System.out.println();
        }
        for(int i = count ;i >= 0;i--)
        {
            for(int u = 0 ;u < i ;u++)
                System.out.print(" ");
            for(int j = 0 ; j < count-i ;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}