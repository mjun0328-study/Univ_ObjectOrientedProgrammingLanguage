import java.util.*;

public class OneArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Number> list = new ArrayList<Number>();
        System.out.print("Enter five integers and five doubles: ");

        for (int i = 0; i < 5; i++) {
            int num = input.nextInt();
            list.add(num);
        }

        for (int i = 0; i < 5; i++) {
            double num = input.nextDouble();
            list.add(num);
        }

        sort(list);

        for (Number num : list) {
            System.out.print(num + " ");
        }
    }

    public static void sort(ArrayList<? extends Number> list) {
        Collections.sort(list, new Comparator<Number>() {
            @Override
            public int compare(Number num1, Number num2) {
                return Double.compare(num1.doubleValue(), num2.doubleValue());
            }
        });
    }
}