class CountNumbers {
  public static void main (String[] args) {
    java.util.Scanner input = new java.util.Scanner(System.in);
    int[] counts = new int[51];

    System.out.print("Enter the integers : ");

    while(true) {
      int number = input.nextInt();
      if(number == 0) break;
      counts[number]++;
    }

    for(int i=1; i<51; i++) {
      int count = counts[i];
      if(count > 0) {
        System.out.print(i + " occurs " + count + " time");
        if(count > 1) System.out.print("s");
        System.out.print("\r\n");
      }
    }
  }
}