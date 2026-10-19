
package repetition.control.statement.pkgfor.loop;

import java.util.Scanner;

public class RepetitionControlStatementForLoop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            System.out.print("Enter number " + (i + 1) + " of 5: ");
            int number = scanner.nextInt();

            switch (number % 2) {
                case 0:
                    System.out.println(number + " is EVEN.");
                    break;

                default:
                    System.out.println(number + " is NOT divisible by 2!");
                    break;
            }
        }

        scanner.close();
    }
}
