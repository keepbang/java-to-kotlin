# 코틀린에서 연산자를 다루는 방법

## 단항 연산자 / 산술 연산자

- 자바와 동일하다.

## 비교 연산자와 동등성, 동일성

- 코틀린에서는 비교 연산자를 사용하면 자동으로 compareTo메소드를 실행한다.


- 코틀린에서는 동일성에 `===`을 사용하고 동등성에 `==`을 사용한다.
- `==`을 사용하면 간접적으로 `equals` 함수를 호출한다.
- 동일성 : 같은 객체인가? 주소가 같은가?
- 동등성 : 두객체의 값이 같은가
    ```kotlin
    val m1 = JavaMoney(1_000L)
    val m2 = m1
    val m3 = JavaMoney(1_000L)

    // 동일성 비교 (주소가 같아야 true)
    println(m1 === m2) // 주소가 같음 true 
    println(m1 === m3) // 주소가 다름 false
    // 동등성 비교
    println(m1 == m3) // 주소는 달라도 값이 같음 true 
    ```

## 논리연산자

- 자바와 동일하다.

## 코틀린에만 존재하는 특이한 연산자

### in / !in

- 컬렉션이나 범위에 포함되어 있다. 포함되어 있지 않다

### a..b

- a부터 b 까지의 범위 객체를 생성한다

### [] 사용

- `[]`를 사용하여 배열이나 리스트의 값을 가져오거나 추가할 수 있다.
- `a[i], a[i] = b`

## 산술 연산자 오버로딩

- 객체마다 산술 연산자를 직접 구현할 수 있다.

```kotlin
    operator fun plus(other: KotlinMoney): KotlinMoney {
    return KotlinMoney(this.amount + other.amount)
}
```

- 이런 함수가 선언되있는 경우
    ```kotlin
    val m1 = JavaMoney(1_000L)
    val m2 = JavaMoney(1_000L)
    println(m1 + m2) // 해당 메소드로 이동됨
    ```
- 위와 같이 사용하면 해당 함수가 호출된다.

| 식     | 함수 이름 |
|-------|-------|
| a * b | times |
| a / b | div   |
| a % b | mod   |
| a + b | plus  |
| a - b | minus |

- 복합 대입 연산자(plusAssign, minusAssign) 및 단항 연산자도 오버로딩 가능하다.
- 단항 연산자 함수 이름

| 식        | 함수 이름      |
|----------|------------|
| +a       | unaryPlus  |
| -a       | unaryMinus |
| !a       | not        |
| ++a, a++ | inc        |
| --a, a-- | dec        |
