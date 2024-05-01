# 2024_OOP_Week6_2 : Quadratic Equation

이차방정식 ax^2 + bx + c = 0 의 해를 구하기 위한 클래스 "QESolver" 을 작성하시오.
세부사항은 다음과 같습니다.

- 각 3가지 계수를 뜻하는 private 멤버 변수 a, b, c
- 인자를 이용한 a, b, c의 생성자
- private 멤버 변수인 a, b, c로부터 값을 읽어오기 위한 getter 메소드
- 이차방정식의 판별식 b^2 - 4ac 값을 반환하는 getDiscriminant() 메소드
- 이차식의 두 해를 반환하는 getRoot1(), getRoot2() 메소드

(단, 허근을 갖게 되는 계수는 test case의 값으로 주어지지 않으므로, getRoot1(), getRoot2()는 부동소수점 값만을 반환하고, 중근의 경우에는 제공한 skeleton code에 따라 근 하나를 출력하도록 하면 됩니다.)
(또한, 최종 출력 시에는 포맷 출력을 이용하여 소수점 둘째 자리에서 반올림합니다.)

```
Enter a, b, c : 1 -5 6
The roots are 3.0 and 2.0
```

```
Enter a, b, c : 2 4 2
The roots are -1.0
```
