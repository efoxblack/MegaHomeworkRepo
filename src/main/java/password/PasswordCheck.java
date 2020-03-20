package password;

import java.util.Scanner;

public class PasswordCheck {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        boolean runAgain = false;
        boolean exitLoop = false;
        int counter = 0;

        do {

            System.out.println("Enter the correct Password.");
            String password = userInput.nextLine();

            if (password.equals("JustABunchOfCharacters1963")) {
                System.out.println("You are logged in!");
                exitLoop = true;
            } else {
                counter++;
                System.out.println("Wrong password, try again." + "\n" +
                        "This is your #" + counter + " try, any more than 3 and your account will be locked!");
                runAgain = true;
                if (counter > 3) {
                    System.out.println("Your account has been locked out!");
                    break;
                }
            }

            if (exitLoop) {
                break;
            }

        } while (runAgain);
    }
}
