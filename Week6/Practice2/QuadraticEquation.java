class QuadraticEquation {
  public static void main(String[] args) {
    java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.print("Enter a, b, c : ");
    double a = input.nextDouble();
    double b = input.nextDouble();
    double c = input.nextDouble();

    QESolver solver = new QESolver(a, b, c);
    double discriminant = solver.getDiscriminant();

    if(discriminant == 0) {
      System.out.printf("The root is %.1f", solver.getRoot1());
    }
    else {
      System.out.printf("The roots are %.1f and %.1f", solver.getRoot1(), solver.getRoot2());
    }
    System.out.printf("\r\n");
  }

  static class QESolver {
    private double a;
    private double b;
    private double c;

    public QESolver(double a_, double b_, double c_) {
      a = a_;
      b = b_;
      c = c_;
    }

    double getDiscriminant() {
      return b * b - 4 * a * c;
    }

    double getRoot1() {
      return (-1 * b + Math.sqrt(this.getDiscriminant())) / (2 * a);
    }

    double getRoot2() {
      return (-1 * b - Math.sqrt(this.getDiscriminant())) / (2 * a);
    }
  }
}