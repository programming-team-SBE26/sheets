import java.util.*;

class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] Args) {
        System.out.println("Enter the size.");
        int array_size = scan.nextInt();
        double []given_array = new double[array_size];
        int sum = 0; // summation of all elements of the array
        System.out.println("Enter the array");
        for(int i = 0 ;i < array_size; i++)
        {
            given_array[i] = scan.nextDouble();
            sum += given_array[i]; // adding the element to "sum"
        }
        System.out.println("the average = "+ (sum/array_size));
    }
}