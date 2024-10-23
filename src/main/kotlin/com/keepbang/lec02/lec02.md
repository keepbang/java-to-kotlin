# 코틀린에서 null을 다루는 방법

## null 허용 변수 사용
- null이 들어갈수 있는 변수의 함수들을 사용할 때에는 safe call(`?.`)을 사용해야 한다.
- 변수가 null일 경우 null을 반환하여 NPE를 예방한다.
    ```kotlin
    var str: String? = "ABC"
    println(str.length) // str이 null허용이기 때문에 컴파일 에러
    println(str?.length) // safe call 사용
    
    str = null
    println(str?.length) // null print
    ```

## 함수 매개변수 null 사용
- 기본적으로 코틀린 함수의 매개변수와 반환타입은 null이 들어갈 수 없다.``
- null이 들어올 경우 매개변수 타입에 '?'가 붙어야한다.
- `!!` 키워드로 str은 null이 절대 아니라고 알려줄 수 있다.
    ```kotlin
    fun startsWithNotNull(str: String?): Boolean { // null이 들어갈수 없는 반환 타입
        return str!!.startsWith("A")
    }
    ```
- 위 코드는 null이 들어오면 NPE가 발생한다.

## 함수 반환 타입 null 사용
- null이 반환될 수 있다면 반환 타입에도 `?`가 있어야한다.
    ```kotlin
    fun startsWithA2(str: String?): Boolean? {
        return str?.startsWith("A")
    }
    println(startsWithA2(null)) // null
    ```

## elvis operator (엘비스 연산자) `?:`
- Java에서 사용하는 Optional 대신 `?:` 키워드를 사용하여 왼쪽 식이 null이면 오른쪽 값으로 반환한다.
```kotlin
    var str: String? = "ABC"
    println(str?.length ?: 1) // 3 
    var str2: String? = null
    println(str2?.length ?: 1) // 1

    fun startsWithA1(str: String?): Boolean {
        return str?.startsWith("A") ?: throw IllegalArgumentException("null이 들어왔습니다")
    }

    // IllegalArgumentException 발생
    startsWithA1(null)

```

