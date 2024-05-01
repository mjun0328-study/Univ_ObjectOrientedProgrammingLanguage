# 2024_OOP_Week9_1 : Queue

int 타입 정수를 저장할 수 있는 Queue 클래스를 구현하시오.  
큐는 아이템을 순서대로 보관할 수 있는 객체이되, 후입선출인 스택과 다르게 선입선출의 구조를 띠고 있습니다.  
스켈레톤 코드를 기반으로 큐 클래스를 구현하시오. 완성해야 할 메소드들은 다음과 같습니다 :

public void enqueue(int value);  
public int dequeue();  
public boolean isEmpty();  
public int getSize();

- 참고 1 : 내부 변수 int[] elements, int size와 미리 완성된 생성자 메소드가 있습니다.
- 참고 2 : enqueue() 메소드는 큐 내부만을 변경하고, dequeue() 메소드는 큐 내부 변경과 함께 빠져나온 아이템을 반환합니다.
- 참고 3 : 미리 완성된 main 문에서 3번의 dequeue 연산을 수행하므로, 테스트 시 숫자는 3~4개 이상으로 입력해주시기 바랍니다.

```
Input Numbers : 1 4 2 8 5 7
dequeue 3 elements : 1 4 2
current length : 4
dequeueing the rest of the queue...
8 5 7
```
