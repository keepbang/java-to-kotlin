# 코틀린에서 제어문을 다루는 방법

## if 문
- 기본적으로 java와 동일하지만 코틀린에서는 표현식(Expression)으로 사용 가능하다.
    ```kotlin
    fun getPassOrFail(score: Int): String {
        return if (score >= 50) {// 바로 return 가능함
            "P"
        } else {
            "F"
        }
    }

    fun getPassOrFail(score: Int): String =  if (score >= 50) "P" else "F"
    
    ```
- 방법에 따라 함수를 간단하게 표현 할 수 있다.
- between처럼 `in`을 사용하여 범위에 대한 조건을 처리 할 수 있다.
    ```kotlin
    // score가 0부터 100 사이의 값인 경우
    if (score in 0..100) {
        print("${score} 가 0부터 100 사이의 값입니다.")
    }
    
    // score가 0부터 100 범위 안에 있지 않을 경우
    if (score !in 0..100) {
        throw IllegalArgumentException("${score} 는 0보다 작을 수 없습니다.")
    }
    
    ```
- .. 대신 `until`을 사용하면 이전값까지 비교한다.

## switch대신 when 사용
- 코틀린에서는 자바에서 사용하던 switch대신 `when`을 사용한다.
- `when`도 마찬가지로 표현식으로 사용 할 수 있다.
    ```kotlin
    when (값) {
        조건부 -> 어떠한 구문
        조건부 -> 어떠한 구문
        else -> 어떠한 구문
    }
    ```
- 조건부에는 is를 사요할 수 있다. (전략 패턴 사용가능)
    ```kotlin
    fun startsWithA(obj: Any): Boolean {
        return when (obj) {
            is String -> obj.startsWith("A")
            is KotlinMoney -> obj.amount > 1000
            else -> false
        }
    }
    ```
- 여러 조건을 추가할 수 있음
    ```kotlin
    fun judgeNumber(number: Int) {
        when (number) {
            1, 0, -1 -> println("1,0,-1 중 하나입니다.")
            else -> println("1,0,-1 이 아닙니다.")
        }
    }
    ```
- when에 값이 안들어가도 된다.
    ```kotlin
    fun judgeNumber2(number: Int) {
        when {
            number == 0 -> println("주어진 숫자는 0입니다.")
            number % 2 == 0 -> println("짝수")
            else -> println("홀수")
        }
    }
    ```