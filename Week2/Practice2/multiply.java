class multiply {
  public static void main(String[] args) {
    java.util.Scanner input = new java.util.Scanner(System.in);
    // Read a number
    System.out.print("Enter an integer between 0 and 1000: ");
    int number = ______;

    // Find all digits in number
    int lastDigit = ______;
    int remainingNumber = ______;
    int secondLastDigit = ______;
    remainingNumber = ______;
    int thirdLastDigit = ______;

    // Protect from being zero
    if(lastDigit == 0) {
      ______;
    }
    if(secondLastDigit == 0) {
      ______;
        }
    if(thirdLastDigit == 0) {
      ______;
    }

    // Obtain the multiply of all digits
    int multiply = lastDigit * secondLastDigit * thirdLastDigit;

    // Display results
    System.out.println(______);
  }
}