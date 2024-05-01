class Binary2Decimal {
  public static void main(String[] args) {
    java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.printf("Enter a binary value (0000 to 1111): ");

    String binary = input.nextLine();

    int decimal = 0;
    for(int i=0; i<binary.length(); i++) {
      if(binary.charAt(binary.length() - i - 1) == '1') {
        decimal += (Math.pow(2, i));
      }
    }

    System.out.println("The decimal value is " + decimal);
  }
}