import java.util.Scanner;

class Pyramid {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number of lines: ");
    int numberOfLines = input.nextInt();

    if (numberOfLines < 1 || numberOfLines > 9) {
      System.out.println("You must enter a number from 1 to 9");
      System.exit(0);
    }

    // Print lines
    for (int i=numberOfLines; i>0; i--) {
      for(int j=0; j<numberOfLines-i; j++) {
        System.out.print("   ");
      }
      for(int j=i; j>0; j--) {
        System.out.print("  " + j);
      }
      for(int j=2; j<=i; j++) {
        System.out.print("  " + j);
      }
      System.out.print("\r\n");
    }
  }
}