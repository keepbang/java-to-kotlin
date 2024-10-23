# 코틀린에서 Type을 다루는 방법

## 코틀린에서 사용하는 data type
- Byte
- Short
- Int
- Long : 숫자 뒤에 `L` 사용
- Flot : 숫자 뒤에 `f` 사용
- Double
- String
- Boolean
- Any
  - java의 Object 역할
  - primitive type의 최상의 타입도 Any다.
  - Any 자체로는 null을 포함할 수 없어 Any?로 표현
  - Any에 equals, hashCode, toString 존재
- Unit
  - java의 void와 동일
  - void와 다르게 Unit은 그 자체로 타입 인자로 사용 가능하다.
  - 함수형 프로그래밍에서 Unit은 단 하나의 인스턴스만 갖는 타입을 의미.
  - 코틀린의 Unit은 실제 존재하는 타입이라는 것을 표현
- Nothing
  - Nothing은 함수가 정상적으로 끝나지 않았다는 사실을 표현하는 역할
  - 무조건 예외를 반환하는 함수 / 무한 루프 함수 등

## 형변환
- 코틀린에서 타입 변환은 명시적 형변환으로 해야한다.
- to변환타입() 함수를 사용해서 수행한다.
- 범위를 넘어가는 값을 타입변환하면 -1을 반환한다.
```kotlin
val number1 = Int.MAX_VALUE // int
val number2 = Long.MAX_VALUE // long
val number3 = 6.0f // float
val number4 = 3.5 // double
println(number2.toInt()) // -1 출력
```

## String interpolation / String indexing
- `${}` 를 사용하여 문자를 제어 만들 수 있다.(javascript와 비슷함)
- 여러줄에 걸친 문자열을 사용할 경우 큰따옴표 3개를 사용하여 만들 수 있다.
- trimIndent()
  - 모든 입력 라인의 공통 최소 들여쓰기를 감지하고 모든 라인에서 그만큼 제거한다.
  - 비어있는 첫번째와 마지막 라인 제거
```kotlin
val subStr = "QWER"

val str = """
        ABC
      BCD
    $subStr
""".trimIndent()

println(str)
println(subStr[0]) // 바로 배열로 사용 가능
println(subStr[2])
// 출력
    ABC
  BCD
QWER
Q
E
```

## java에서 사용하던 instanceOf 대신 is 사용
- `instanceof`대신 `is`를 사용해서 타입 판별을 할 수 있다
- 조건문에서 `is`를 사용하면 해당 타입으로 자동으로 변환된다.
```kotlin
fun printAgeIfPerson(obj: Any?) {
    // `!` 키워드로 아닐경우를 판단 할 수 있다.
    if (obj !is Person) {
        throw IllegalArgumentException("Not Person")
    }
    if (obj is Person) {
        // if에서 타입체크를 하면 해당 타입으로 간주됨
//        val person = obj as Person // as {Class} Any를 변환가능(생략가능)
        println(obj.age)
    }
}
```