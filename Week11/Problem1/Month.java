import java.util.Scanner;

public class Month {

    public static void main(String[] args) {

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner input = new Scanner(System.in);

        while(true) {
          try {
            System.out.print("Enter a number in [1, 12] : ");
            int month = input.nextInt();
            System.out.println("There are " + dom[month - 1] + " days in " + months[month - 1]);
            break;
          }catch(ArrayIndexOutOfBoundsException e) {
            System.out.print("Error : Wrong number\n");
          }
        }

        /*
          1. 원하는 month를 입력 받음
          2.1 month의 값이 1~12이면 출력
          2.2 month의 값이 1~12 이외의 경우 예외처리
        */
    }
}