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
        int []second_array =new int[array_size];
        int []common =new int[array_size];
        int common_size = 0;
        System.out.println("Enter the second array");
       for(int i = 0 ;i < array_size; i++)
       {
           second_array[i] = scan.nextInt();
           if(found(given_array,second_array[i])) // if exist insert in common
           {
               common[common_size] = second_array[i];
               common_size++;
           }
       }
        System.out.println("common elements is");
       for(int i = 0 ; i < common_size ;i++)
           System.out.print(common[i]+ " ");
    }
    static boolean found(int a[] , int value) {
        for (int i = 0; i < a.length; i++)
            if (a[i] == value)
                return true;
        return false;
    }
}