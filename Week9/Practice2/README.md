# 2024_OOP_Week9_2 : MyString1

String 클래스는 자바 라이브러리에서 기본제공 되는 클래스입니다. 해당 클래스의 역할을 모방하기 위해 다음의 메소드를 구현하여 MyString1 클래스를 완성하시오 :

public char charAt(int index);  
public int length();  
public MyString1 substring(int begin, int end);  
public MyString1 toLowerCase();  
public String toString();

- 참고 1 : 내부 변수 char chars[], 그리고 미리 완성된 생성자 메소드를 갖고 있습니다.
- 참고 2 : 다른 문자열을 반환하는 함수의 경우, 기존 객체가 갖는 String 값을 훼손하지 않고 반환만 합니다.
- 참고 3 : 미리 완성된 main 문에서 4째 단어에 접근하므로, 테스트 시 문장은 5~6자 이상으로 입력해주시기 바랍니다.

```
Input String : aBcDeF
.length() : 6
.charAt(1) : B
.substring(2,4) : cD
.toLowerCase() : abcdef
```
