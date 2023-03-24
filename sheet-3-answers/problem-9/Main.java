import java.util.*;

class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] Args) {
        System.out.println("Enter the size.");
        int array_size = scan.nextInt();
        int []given_array = new int[array_size];
        System.out.println("Enter the array");
        for(int i = 0 ;i < array_size; i++) // taking the input
        {
            given_array[i] = scan.nextInt();
        }
        int sum_of_positive = 0 ;
        int sum_of_negative = 0 ;

        for(int item : given_array)
        {
            if(item > 0)
                sum_of_positive+= item;
            else
                sum_of_negative+= item;
        }
        System.out.println("the sum of the positive is " + sum_of_positive);
        System.out.println("the sum of the negative is " + sum_of_negative);
    }
}