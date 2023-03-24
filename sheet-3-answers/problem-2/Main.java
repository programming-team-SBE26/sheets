import java.util.*;

class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] Args) {
        System.out.println("Enter the size.");
        int array_size = scan.nextInt();
        double []given_array = new double[array_size];
        System.out.println("Enter the array");
        for(int i = 0 ;i < array_size; i++) // taking the input
        {
            given_array[i] = scan.nextDouble();
        }
        System.out.println("Enter the value to be searched");
        double key = scan.nextInt();
        for(int i = 0 ;i < array_size;i++) // linear search
        {
            if(given_array[i] == key)
            {
                System.out.println("the value is found");
                break;
            }
            else if(i == array_size-1)
                System.out.println("the value does not exist");
        }
    }
}