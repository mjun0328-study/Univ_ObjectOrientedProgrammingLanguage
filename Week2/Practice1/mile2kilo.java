class mile2kilo {
  public static void main(String[] args) {
    java.util.Scanner input = new java.util.Scanner(System.in);
  
    System.out.print("Enter a miles: ");
    double miles = input.nextDouble();
    double kilometers = Math.round(miles * 16) / 10.0;
    System.out.println(miles + " miles is " + kilometers + " kilometers");
  }
}