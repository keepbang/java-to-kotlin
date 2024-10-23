# 코틀린에서 예외를 다루는 방법

## try catch finally 구문
- 기본적인 사용 방법은 같으나 `catch`에서는 코틀린식으로 변수를 작성해야한다.
- try catch도 Expression이기 때문에 바로 Return 가능하다.
    ```kotlin
    fun parseIntOrThrow(str: String): Int? {
        return try {
            str.toInt()
        } catch (e: NumberFormatException) {
            null
        } finally {
            println("종료")
        }
    }
    ```

## Checked, Unchecked Exception
- 코틀린에서는 Checked, Unchecked 구분하지 않는다.
- `throws`를 사용하지 않는다.
- 예외를 발생시킬 때에는 `new` 키워드를 사용하지 않는다
    `throw IllegalArgumentException("message")`

## try with resources
- 자바에서는 try에 객체를 생성해서 try구문이 끝나면 자동으로 close를 호출하는 기능이 있다.
- 코틀린에서는 해당 기능은 없고 비슷하게 사용하기 위해서 `use`라는 Inline 함수를 사용해야한다.
```kotlin
fun readFile(path: String): String {
    return BufferedReader(FileReader(path))
        .use(BufferedReader::readLine)
}
```
- `use`함수를 들어가 보면 내부적으로 `close` 함수를 실행함