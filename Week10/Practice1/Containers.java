import java.util.*;

public class Containers {
    public static void main(String[] args) {
        final java.util.Scanner input = new java.util.Scanner(System.in);

        // 물체가 몇개인지 입력
        System.out.print("Enter the number of objects: ");
        int[] items = new int[input.nextInt()];

        // 각 물체의 무게를 입력
        System.out.print("Enter the weight of the objects: ");
        for (int i = 0; i < items.length; i++) {
            items[i] = input.nextInt();
        }

        ArrayList<Bin> containers = firstFit(items);

        // 총 컨테이너의 수와 각 컨테이너의 내용을 표시하는 코드
        for (int i = 0; i < containers.size(); i++) {
            System.out.println("Container " + (i + 1)
                    + " contains objects with weight " + containers.get(i));
        }
    }

    public static ArrayList<Bin> firstFit(int[] items) {
        ArrayList<Bin> containers = new ArrayList<Bin>();
        boolean[] isUsed = new boolean[items.length];
        int leftNum = items.length;

        while(leftNum > 0) {
            Bin container = new Bin(10);
            containers.add(container);

            for(int i=0; i<items.length; i++) {
                if(!isUsed[i]) {
                    if(container.addItem(items[i])) {
                        isUsed[i] = true;
                        leftNum--;
                    }
                }
            }
        }

        return containers;
    }

    static class Bin {
        private ArrayList<Integer> objects = new ArrayList<Integer>();
        private int maxWeight = 10;
        private int totalWeight = 0;

        public Bin(int maxWeight) {
            this.maxWeight = maxWeight;
        }

        public boolean addItem(int weight) {
            boolean isAble = this.totalWeight + weight <= this.maxWeight;
            if(isAble) {
                objects.add(weight);
                totalWeight += weight;
            }
            return isAble;
        }

        // main 문에서 출력을 위해 사용한 코드
        @Override
        public String toString() {
            String output = "";
            for (Integer weight: objects)
                output += weight + " ";

            return output;
        }
    }
}