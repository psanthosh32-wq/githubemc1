import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 10000.0; // Initial balance
        int choice;
        double amount;

        do {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Current Balance: ₹" + balance);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ₹");
                    amount = sc.nextDouble();

                    if (amount > 0) {
                        balance += amount;
                        System.out.println("Deposit Successful!");
                        System.out.println("Updated Balance: ₹" + balance);
                    } else {
                        System.out.println("Invalid amount.");
                    }
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ₹");
                    amount = sc.nextDouble();

                    if (amount <= balance && amount > 0) {
                        balance -= amount;
                        System.out.println("Withdrawal Successful!");
                        System.out.println("Remaining Balance: ₹" + balance);
                    } else if (amount > balance) {
                        System.out.println("Insufficient Balance.");
                    } else {
                        System.out.println("Invalid amount.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM!");
                    break;

                default:
                    System.out.println("Invalid Choice. Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}