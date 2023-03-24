import javax.swing.plaf.metal.MetalTheme;
import java.util.*;

class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] Args) {
        System.out.println("Enter the number of devices:");
        int number_of_devices = scan.nextInt();
        System.out.println("Please enter the maximum price limit to buy a device:");
        int max_price = scan.nextInt();
        System.out.println("Enter the price for each device:");
        int []devices = new int[number_of_devices];
        int total_payment = 0;
        int counter = 0 ;
        for(int i = 0 ; i< number_of_devices;i++)
        {
             devices[i] = scan.nextInt();
             if(devices[i] <= max_price)
             {
                 total_payment+= devices[i];
                 counter++;
             }
        }
        System.out.println("The number of devices the company should buy is "+ counter);
        System.out.println("the total payment "+ total_payment);
    }
}