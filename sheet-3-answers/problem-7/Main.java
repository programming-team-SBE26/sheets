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
        int count_even = 0;
        for(int item : given_array)
            if(item % 2 == 0)
                count_even++;
        System.out.println("number of even numbers is " + count_even);
        System.out.println("number of odd numbers is " + (array_size-count_even));

    }
}