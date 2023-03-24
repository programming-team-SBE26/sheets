import javax.swing.plaf.metal.MetalTheme;
import java.util.*;

class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] Args) {
        System.out.println("Enter the size x*y");
        int sizex = scan.nextInt();
        int sizey = scan.nextInt();
        int [][]first = new int[sizex][sizey];
        System.out.println("Enter the first array");
        for(int i = 0 ;i < sizex ; i++)
        {
            for (int j = 0 ;j < sizey ; j++)
            {
                first[i][j] = scan.nextInt();
            }
        }
        System.out.println("Enter the second array");
        int [][]second = new int[sizex][sizey];
        int [][]result = new int[sizex][sizey];
        for(int i = 0 ;i < sizex ; i++)
        {
            for (int j = 0 ;j < sizey ; j++)
            {
                second[i][j] = scan.nextInt();
                if(second[i][j] > first[i][j])
                    result[i][j] = 2;
                else if(second[i][j] < first[i][j])
                    result[i][j] = 1;
                else result[i][j] = 0;
            }
        }
        System.out.println("result is: ");
        for(int i = 0 ;i < sizex;i++)
        {
            for(int j = 0 ; j < sizey;j++)
            {
                System.out.print(result[i][j]+ " ");
            }
            System.out.println();
        }
    }
}