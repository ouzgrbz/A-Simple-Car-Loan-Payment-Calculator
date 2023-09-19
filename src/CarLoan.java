public class CarLoan {

    public static void main(String[] args) {
        // Define the initial variables for the car loan
        int carLoan = 10000;         // Total car loan amount
        int loanLength = 3;          // Length of the loan in years
        int interestRate = 5;        // Annual interest rate in percentage
        int downPayment = 2000;      // Down payment made

        // Check if loanLength or interestRate is invalid
        if (loanLength <= 0 || interestRate <= 0) {
            System.out.println("Error! You must take out a valid car loan.");
        }
        // Check if the down payment covers the full car cost
        else if (downPayment >= carLoan) {
            System.out.println("The car can be paid in full.");
        }
        // Calculate the monthly car loan payment
        else {
            int remainingBalance = carLoan - downPayment;  // Remaining loan balance after down payment
            int monthlyBalance = remainingBalance / (loanLength * 12);  // Monthly principal payment
            int interest = (monthlyBalance * interestRate) / 100;  // Monthly interest payment
            int monthlyPayment = monthlyBalance + interest;  // Total monthly payment

            // Display the calculated monthly car loan payment
            System.out.println("Your monthly car loan payment is: $" + monthlyPayment);
        }
    }
}
