# int 상수 대신 열거 타입을 사용하라


## enum 개념잡고 가기
- Java의 enum은 사실 클래스이며, 상수 하나당 자신의 인스턴스를 하나씩 만들어 public static final 필드로 공개한다.
- enum은 밖에서 접근할 수 있는 생성자를 제공하지 않으므로  사실상 final이다.(인스턴스 생성 및 수정이 불가능하다.)
```java
public enum APPLE { FUJI , PIPPIN }
public enum ORANGE { NAVEL, TEMPLE }
```

위 enum은 아래와 같이 내부적으로 정의된다.
```java
class APPLE{
    public static final APPLE FUJI = new APPLE();
    public static final APPLE PIPPIN = new APPLE();
}
class APPLE{
    public static final ORANGE NAVEL = new ORANGE();
    public static final ORANGE TEMPLE = new ORANGE();
}
```
아래의 코드를 실행해보자.
```java
public class chapter1.chapter2.item1.Main {
    public static void main(String[] args) {
        System.out.println(APPLE.FUJI);
        System.out.println(APPLE.PIPPIN);
    }
}
enum APPLE{
    FUJI,PIPPIN
}
/* console 출력
FUJI
PIPPIN
*/
```
아래의 코드를 실행해보자
```java
public class chapter1.chapter2.item1.Main {
    public static void main(String[] args) {
        System.out.println(APPLE.FUJI);
        System.out.println(APPLE.PIPPIN);
    }
}

class APPLE{
    public static final APPLE FUJI = new APPLE();
    public static final APPLE PIPPIN = new APPLE();
}
/* console 출력
APPLE@1b6d3586
APPLE@4554617c
*/
```

## 정수 열거 패턴(int enum pattern)의 단점
- 아래와 같은 `정수 열거 패턴(int enum pattern)`은 사용을 지양하자.
- 오렌지를 건네야할 메소드에 사과를 보내고 동등 연산자(==)로 비교하더라도 컴파일러는 알지 못한다. 컴파일러 입장에서는 단순 상수로 인식하기 때문에 오렌지인지 사과인지 비교할 방법이 없다!
```java
public static final int APPL_FUJI = 0;
public static final int APPL_PIPPIN = 1;

public static final int ORANGE_NAVEL = 0;
public static final int ORANGE_TEMPLE = 1;
```


