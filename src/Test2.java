import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        //arithmetic ops : +, -, * /, %

        //relational operators : >, >=, <=, <, ==, !=

        //logical operators : AND, OR, &&, &, ||, |

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number 1 : ");
        int val1 = scan.nextInt(); //13

        System.out.println("Enter number 2 : ");
        int val2 = scan.nextInt(); //7

        System.out.println("Enter number 3 : ");
        int val3 = scan.nextInt(); //12

        boolean isMarried = true;

        if(val1>val2 && isMarried){
            System.out.println("Hello....");
        }else{
            System.out.println("Hiiii.....");
        }


    }
}
