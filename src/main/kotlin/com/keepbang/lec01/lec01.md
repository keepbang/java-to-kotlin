# 코틀린에서 변수를 다루는 방법

## 변수 선언 방법
- 변수 선언은 var, val를 통해 선언 가능
    ``` kotlin
    var number1 = 10L // 가변 변수
    val number2 = 10L // 불변 변수
    var number3: Long = 20L // 타입 지정
    ```
- 타입 추론으로 변수의 타입을 지정하기 때문에 생략 가능하다.

## null 허용하는 변수
- 기본적으로 코틀린의 변수들은 null이 허용되지 않는다.
- `?` 키워드를 사용하여 null을 허용할 수 있다.
    ```kotlin
    var number1: Long? = 10L
    ```

## 객체 생성
- new 키워드를 사용하지 않고 객체를 생성해야함
    ```kotlin
    var person = Person("keepbang")
    ```