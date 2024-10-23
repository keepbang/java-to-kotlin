# 코틀린에서 반복문을 다루는 방법

## for 문
- 코틀린에서는 for 문을 사용하여 컬렉션이나 범위를 순회할 수 있다.
- 자바의 향상된 for문과 비슷하게 in 키워드를 사용하여 순회한다.
    ```kotlin
    fun loop1() {
        val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        for (number in numbers) {
            println(number)
        }
    }

## 전통적인 for 문과 범위 연산자
- `1..5`와 같은 구문은 `IntRange`를 생성하여 등차수열을 만들어준다.
- 코틀린에서는 `downTo`, `step`과 같은 중위 호출 함수를 사용할 수 있다.
    ```kotlin
    for (i in 1..5) {
        print(i) // 12345
    }

    // 5부터 1까지 감소
    for (i in 5 downTo 1) {
        print(i) // 54321
    }

    // 1부터 5까지 2씩 증가
    for (i in 1..5 step 2) {
        print(i) // 135
    }

    // 1부터 4까지 출력 (5는 포함하지 않음)
    for (i in 1 until 5) {
        print(i) // 1234
    }
    ```
  
## while 문
- `while` 문은 자바와 동일하게 사용되며, 조건이 참인 동안 계속해서 반복 실행한다.

## Progression과 Range
- 코틀린에서는 범위(range)와 수열(progressions)을 통해 숫자 범위를 지정하고 반복문에서 사용한다.
- `step` 함수로 증가 값을 지정하거나, `downTo`로 감소할 수 있다.
- `step`은 양수만 가능하다.