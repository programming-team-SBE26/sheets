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
        double max = given_array[0];
        double min = given_array[0];
        for(int i = 0 ;i < array_size; i++)
        {
            if(given_array[i] > max)
                max = given_array[i];
            else if(given_array[i] < min)
                min = given_array[i];
        }
        System.out.println("max value is" + (max));
        System.out.println("min value is" + (min));
    }
}