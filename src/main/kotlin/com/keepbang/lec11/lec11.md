# 코틀린에서 접근 제어를 다루는 방법

## 자바와 코틀린의 가시성 제어

Java의 가시성 제어
- public, protected, default(기본), private

Kotlin의 가시성 제어
- public(기본) : 자바와 동일함
- protected : **선언된 클래스** 또는 하위 클래스에서만 사용 가능
- internal(New) : 같은 모듈에서만 접근 가능하다. (모듈 단위로 프로그래밍 할 때 유용할듯)
- private : 자바와 동일함

## 코틀린 파일 접근 제어
- `.kt` 파일 내부에 함수, 변수, 클래스를 여러개 만들 수 있다.
- public : 어디서든 접근 가능하다.
- protected : 클래스에서만 사용 할 수 있다.(파일 최상단에 선언 불가)
- 같은 모듈에서만 접근 가능
- private : 같은 파일 내에서만 접근 가능

## 생성자에 접근 지시어
- 생성자에 접근 지시어를 붙일려면 constructor를 사용해야 한다.
```kotlin
class Cat private constructor() {
    
}
```
## 유틸성 코드를 만들 경우
```java
public final class StringUtils {
  private StringUtils() {
  }
  
  public static boolean isDirectoryPath(String path) {
    return path.endsWith("/");
  }
}
```
- 코틀린에서는 파일 최상단에 바로 유틸 함수를 작성하면 된다.
```kotlin
fun isDirectPath(path: String) = path.endsWith("/")
```

## 프로퍼티의 접근 지시어
- 프로퍼티에 적용할 때에는 getter와 setter 둘다 적용 할 수 있고 따로 적용 할 수도 있다.
```kotlin
class Car(
    internal val name: String,
    private var owner: String,
    _price: Int
) {
    // 하나에만 선언
    var price = _price
        private set
}
```

## 자바와 코틀린을 함께 사용할 때 주의할 점
- internal은 바이트 코드 상 public이 된다. 자바에서 코틀린 모듈의 internal 코드를 가져올 수 있다.
- 코틀린의 protected와 자바의 protected는 다르다. 코틀린은 같은 패키지내에 접근 불가
