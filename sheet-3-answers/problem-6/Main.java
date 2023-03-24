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
        int[] second_array = new int[array_size];
        System.out.println("Enter the second array");
        int idx = 0;
        boolean equal = true;
        for(int item : second_array)
        {
            item = scan.nextInt();
            if(item != given_array[idx])
                equal = false;
            idx++;
        }
        if(equal)
            System.out.println("are equal");
        else
            System.out.println("not equal");
    }
}