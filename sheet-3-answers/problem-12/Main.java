import java.util.*;

class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] Args) {
        System.out.println("Enter the number of students");
        int size = scan.nextInt();
        int []students = new int[size];
        char []validity = new char[size];
        System.out.println("Enter the grades");
        int highest_grade = 0,H_idx = 0;
        int lowest_grade = 150,L_idx = 0;
        double sum = 0 ;
        int cnt_greater80= 0;
        int valid_size = size;
        for(int i = 0 ; i< size ;i++)
        {
            students[i] = scan.nextInt();

            if(students[i] >= 0 && students[i] <= 150)
                validity[i] = 'V';
            else
            {
                validity[i] = 'I';
                valid_size--;
                continue;
            }
            sum+= students[i];
            if(students[i] > highest_grade)
            {
                highest_grade = students[i];
                H_idx = i;
            }
            else if(students[i] < lowest_grade)
            {
                lowest_grade = students[i];
                L_idx = i;
            }
            if(students[i] > 0.8 * 150.0)
                cnt_greater80++;
        }
        System.out.println("valid grades");
        for(char v : validity)
            System.out.print(v + " ");
        System.out.println(); // end line
        System.out.println("highest grade is " + highest_grade + " at index " + H_idx);
        System.out.println("lowest grade is " + lowest_grade + " at index " + L_idx);
        System.out.println("number of students with grades greater than 80% is " + cnt_greater80);
        double average = sum / valid_size;
        int cnt_greater50 = 0;
        System.out.println("students with grades greater than the average is:");
        for(int i = 0 ;i < size; i++)
        {
            if(students[i] > average)
            {
                System.out.println("student with grade "+ students[i] + " at index " + i);
                cnt_greater50++;
            }

        }
        System.out.println("their count is " + cnt_greater50);
    }
}