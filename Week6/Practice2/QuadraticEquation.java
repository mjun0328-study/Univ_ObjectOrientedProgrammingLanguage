class QuadraticEquation {
  public static void main(String[] args) {
    java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.print("Enter a, b, c : ");
    double a = input.nextDouble();
    double b = input.nextDouble();
    double c = input.nextDouble();

    QESolver solver = new QESolver(______);
    double discriminant = solver.getDiscriminant();

    if(discriminant == 0) {
      System.out.printf("The root is %.1f", solver.getRoot1());
    }
    else {
      System.out.printf("The roots are %.1f and %.1f", solver.getRoot1(), solver.getRoot2());
    }
  }

  static class QESolver {
    private double a;
    private double b;
    private double c;

    public QESolver() {
      // Constructor
    }

    double getDiscriminant() {
      // get discriminant number
    }

    double getRoot1() {
      // get r1
    }

    double getRoot2() {
      // get r2
    }
  }
}