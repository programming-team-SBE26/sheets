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
        int []reversed = new int[array_size];
        int right_to_lift = array_size-1;
        for(int i = 0 ;i< array_size;i++)
        {
            reversed[i] = given_array[right_to_lift];
            right_to_lift--;
        }
        System.out.println("after reversing");
        for(int item : reversed)
            System.out.print(item+ " ");
    }
}