import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("==== Income Calculator ==== \n");

        System.out.print("Enter your salary : ");
        double salary = scan.nextDouble();

        System.out.print("Enter your land income : ");
        double land = scan.nextDouble();

        System.out.print("Enter your kudu income : ");
        double kudu = scan.nextDouble();

        if (salary >= 115000) {
            salary = salary - (salary / 100 * 14);
        }

        if (kudu > 0) {
            kudu = kudu / 2;
        }

        System.out.println("Hiiii....");

        System.out.println("Total income is : " + (salary + kudu + land));
    }
}
