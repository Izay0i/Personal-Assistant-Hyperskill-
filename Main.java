import java.util.Scanner;
import java.util.Calendar;
//import java.util.GregorianCalendar;

/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
*/

public class Main {
    public static void main(String[] args) {
        //Create input stream
        Scanner scanner = new Scanner(System.in);

        //Main main = new Main();
        //System.out.println(new Main().getClass().getName() + '@' + Integer.toHexString(10972890));

        /*
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        */

        //user statistics
        String name;
        String myName;
        int age;

        //get current year
        Calendar cal = Calendar.getInstance();
        int birthYear = cal.get(Calendar.YEAR);

        //get a name for the assistant
        System.out.print("Please give me a name: ");
        name = scanner.nextLine();
        //name = reader.readLine();

        System.out.println("Ah, yes I remember now! My name is " + name + '.');
        System.out.println("I was created in " + birthYear + '.');

        //get your name
        System.out.print("Please tell me your name: ");
        myName = scanner.nextLine();

        System.out.println("What a great name you have, " + myName + '!');
        System.out.println("Let me guess your age.");
        System.out.print("Enter remainders of dividing your age by 3, 5 and 7: ");

        age = ((scanner.nextInt() % 3) * 70 + (scanner.nextInt() % 5) * 21 + (scanner.nextInt() % 7) * 15) % 105;

        System.out.println("Your age is " + age + "; that's a good time to start programming!");
        System.out.println("Now I will prove to you that I can count to any number you want.");

        int limit = scanner.nextInt();
        for (int i = 0; i <= limit; ++i)
            System.out.println(i + "!");

        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.\n" +
                "2. To decompose a program into several small subroutines.\n" +
                "3. To determine the execution time of a program.\n" +
                "4. To interrupt the execution of a program.");

        int choice = -1;
        while (true) {
            choice = scanner.nextInt();

            if (choice != 2)
                System.out.println("Please, try again.");
            else
                break;
        }

        System.out.println("Congratulations, have a nice day!");
        scanner.close();
    }
}
