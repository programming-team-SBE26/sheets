import java.util.*;

class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] Args) {
        System.out.println("Enter positive odd number");
        int N = scan.nextInt();
        while(N < 0 || N % 2 == 0)
        {
            System.out.println("Error! Entered number is not an odd positive number");
            System.out.println("Enter positive odd number");
            N = scan.nextInt();
        }
        int sum = (N+1)*N/2;
        System.out.println("the summation form 1 to N is");
        System.out.println(sum);
    }
}