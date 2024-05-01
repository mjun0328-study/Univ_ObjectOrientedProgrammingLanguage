import java.util.Scanner;

public class MyString1 {
    private char[] chars;

    public MyString1(char[] chars) {
        this.chars = new char[chars.length];
        System.arraycopy(chars, 0, this.chars, 0, chars.length);
    }

    public int length() {
        return chars.length;
    }

    public char charAt(int index) {
        return chars[index];
    }

    public MyString1 substring(int begin, int end) {
        return new MyString1(new String(chars).substring(begin, end).toCharArray());
    }

    public MyString1 toLowerCase() {
        return new MyString1(new String(chars).toLowerCase().toCharArray());
    }

    public String toString() {
        return new String(chars);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input String : ");
        MyString1 s = new MyString1(input.nextLine().toCharArray());

        System.out.println(".length() : " + s.length());
        System.out.println(".charAt(1) : " + s.charAt(1));
        System.out.println(".substring(2,4) : " + s.substring(2, 4));
        System.out.println(".toLowerCase() : " + s.toLowerCase());

    }
}