# 2024_OOP_Week5_2

샘플 실행에 제시된 대로 무작위 단어를 생성하고, 사용자에게 한 번에 하나의 알파벳을 예측하도록 요청하는 행맨 게임에 대한 코드를 작성하세요. 단어의 각 문자는 별도로 terminal에 출력됩니다. 사용자가 정확하게 알파벳을 예측하면 실제 문자가 표시됩니다. 사용자가 단어 예측을 맞추면, 다른단어로 계속 게임을 진행할지 묻습니다.

만약 예측한 알파벳이 없는 알파벳이라면, p is not in the word와 같이 출력하고, 이미 선택한 알파벳이라면, p is already in the word와 같이 출력해주세요.

이번 실습에서도 마찬가지로, System.out.println();대신에 `System.out.println("\r\n");`을 사용해 줄바꿈 해주세요. `줄바꿈은 r is not in the word처럼 알파벳이 없다는 것을 나타내는 출력과 p is already in the word처럼 알파벳이 존재한다는 출력과 The word is positive. You missed 2 times처럼 모든 알파벳을 맞추고 몇번틀렸는지를 나타내는 것을 출력할때만 줄바꿈을 사용해 주세요.` `또한, 이미 있는 알파벳을 입력으로 넣었을때는 틀린 것이 아니여서 이것을 제외하고 출력해주세요.` `추가적으로,  알파벳이 없다는 출력과 알파벳이 존재한다는 출력 앞에는 공백이 3칸 있습니다.`

```
Enter the word : receive
(Guess) Enter a letter in word ******* > p
   p is not in the word
(Guess) Enter a letter in word ******* > r
(Guess) Enter a letter in word r****** > e
(Guess) Enter a letter in word re*e**e > c
(Guess) Enter a letter in word rece**e > i
(Guess) Enter a letter in word recei*e > z
   z is not in the word
(Guess) Enter a letter in word recei*e > v
The word is receive. You missed 2 times
Do you want to guess for another word? Enter y or n > n
```

```
Enter the word : positive
(Guess) Enter a letter in word ******** > r
   r is not in the word
(Guess) Enter a letter in word ******** > p
(Guess) Enter a letter in word p******* > g
   g is not in the word
(Guess) Enter a letter in word p******* > o
(Guess) Enter a letter in word po****** > s
(Guess) Enter a letter in word pos***** > i
(Guess) Enter a letter in word posi*i** > p
   p is already in the word
(Guess) Enter a letter in word posi*i** > t
(Guess) Enter a letter in word positi** > v
(Guess) Enter a letter in word positiv* > e
The word is positive. You missed 2 times
Do you want to guess for another word? Enter y or n > n
```
