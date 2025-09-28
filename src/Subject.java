import java.util.Scanner;

public class Subject {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //to store data
        String[] subjectNames = new String[9];
        int[] subjectMarks = new int[9];

        //insert values
        for (int i = 0; i < 9; i++) {
            System.out.print("Enter name for subject " + (i + 1) + " : ");
            subjectNames[i] = scan.next();

            System.out.print("Enter marks for subject " + (i + 1) + " : ");
            subjectMarks[i] = scan.nextInt();
        }

        //find max mark name
        int maxMark = subjectMarks[0];
        int maxMarkIndex = 0;

        for (int i = 0; i < 9; i++) {
            if (subjectMarks[i] > maxMark) {
                maxMark = subjectMarks[i];
                maxMarkIndex = i;
            }
        }

        System.out.println("max marked subject name is : " + subjectNames[maxMarkIndex]);

        //find average

        int total = 0;

        for (int i = 0; i < 9; i++) {
            total += subjectMarks[i];
        }

        System.out.println("The average is : " + (total / 9));


    }
}
