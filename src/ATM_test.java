import java.sql.SQLOutput;
import java.util.Scanner;

public class ATM_test {
    public static void main(String[] args) {

        String userName = "Dimitar Kanev";
        String password = "12345";
        String bankName = "Mitko Bank";
        double userBalance = 5000;

        Scanner bankScanner = new Scanner(System.in);
        System.out.println("Welcome to " + bankName);
        System.out.println("Please Enter Your PIN Number");
        String enteredPassword = bankScanner.nextLine();

        if (enteredPassword.equalsIgnoreCase(password)) {
            System.out.println("Account Name Holder: " + userName);
            System.out.println("Please choose the following options ");
            System.out.println("1 - Show Balance , 2 - Deposit , 3 - Withdraw");

            int userChoice = bankScanner.nextInt();

            if (userChoice == 1) {
                System.out.println("Your Current Balance is " + userBalance);
            } else if (userChoice == 2) {
                System.out.println("Please Enter The Amount To Deposit ");
                double depositAmount = bankScanner.nextDouble();

                userBalance += depositAmount;

                System.out.println("You Have Successfully Deposited " + depositAmount + "\nNow Your Balance is " + userBalance);
            } else if (userChoice == 3) {
                System.out.println("Please Enter The Amount To Withdraw");
                double withDrawAmount = bankScanner.nextDouble();

                if (withDrawAmount > userBalance) {
                    System.out.println("Insufficient Balance. Please Try Again");
                } else {
                    userBalance -= withDrawAmount;
                    System.out.println("You Have Successfully Withdraw " + withDrawAmount + "\nNow Your Balance Is " + userBalance);
                }
            }
        }

    }
}
