# 코틀린에서 함수를 다루는 방법

## 함수 선언 문법
- 코틀린에서 함수는 `fun`키워드를 사용하여 선언할 수 있다.
- 기본적으로 public으로 만들어진다.
- 간단하게 중괄호를 없애고 만들수도 있다.
    ```kotlin
    fun max(a: Int, b: Int) = if (a > b) a else b
    fun max(a: Int, b: Int): Int {
        return if (a > b) a else b
    }
    ```

## default parameter
- 함수 매개변수에 기본값을 넣어줄 수 있다.
```kotlin
fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

repeat("HELLO WORLD", 3, true)
repeat("HELLO WORLD") // 위와 동일하게 구동됨
```
- 기본값이 존재 할 경우 해당 파라미터를 생략 할 수 있다. 대신 순서에 맞게 입력해야한다.

## named argument (parameter)
- 파라미터 명을 입력해서 값을 직접 지정할 수 있다.
```kotlin
repeat("HELLO WORLD", useNewLine = false) // 이름있는 파라미터(named argument) builder와 비슷함
```
- 파라미터 명을 입력하면 순서 상관없이 입력 가능하다.


## 같은 타입의 여러 파라미터 받기(가변인자)
- 자바에서는 ...을 사용하여 가변인자를 받았다
- 코틀린에서는 vararg를 사용하여 가변인자를 받을 수 있다.
```kotlin
fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}

val arr = arrayOf("D", "E", "F")
printAll(*arr)
```
- 가변인자에 값을 넣을때 배열로도 넣을 수 있다. 대신 스프레드 연산자 `*`를 사용해야 한다.
