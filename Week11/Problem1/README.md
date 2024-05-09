# oop_2024_week11_problem1

- 각 코드에 주석으로 간단한 설명이 달려있습니다. 참고하셔서 `Problem1.java` 를 수정해주세요.
- sample run을 참조하시면 됩니다.
- 출력문이 sample run와 동일해야 자동채점이 정상 채점 됩니다.

---

## Problem1

1-12월의 "일"을 출력하는 문제입니다. 입력으로 1-12월이 들어오면 해당하는 달의 "일"을 출력. 이외의 값이 들어오면 예외처리 해주시면 됩니다. 자세한 설명은 아래와 같습니다.

Using the two arrays shown below, write a program that prompts the user to enter an integer between 1 and 12 and then displays the months and its number of days corresponding to the integer entered. Your program should display “wrong number” if the user enters a wrong number by catching ArrayIndexOutOfBoundsException.

추가로, 잘못된 값을 넣을 경우 올바른 1~12월이 입력으로 들어올때까지 반복해야 합니다.

### sample run1

```
Enter a number in [1, 12] : 5
There are 31 days in May
```

### sample run2

```
Enter a number in [1, 12] : 13
Error : Wrong number
Enter a number in [1, 12] : 0
Error : Wrong number
Enter a number in [1, 12] : 6
There are 30 days in June
```
