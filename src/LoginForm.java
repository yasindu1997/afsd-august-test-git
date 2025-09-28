import java.util.Scanner;

public class LoginForm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /// /////////////////////

        //array
        //type safe ----> same data type
        //fixed length

        int age = 5; //single
        System.out.println(age);

        int[] ages = new int[10];
        String[] names = new String[10];

        ages[3] = 54;

        System.out.println(ages[0]);

        /// //////////////////////////

        ages[0] = 90;
        ages[1] = 45;
        ages[2] = 89;

        /// ////////

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter value for variable " + i);
            ages[i] = scan.nextInt();
        }

        /// //////////

        for (int i=0; i<10; i++){
            System.out.println(ages[i]);
        }

        //student has 9 subjects for his OL exam
        //get subject names and last term test marks as user inputs
        //and store them in proper way

        //find the max marked subject name

        //find the average mark of the student


    }
}
