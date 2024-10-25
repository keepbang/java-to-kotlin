# 코틀린에서 다양한 함수를 다루는 방법

## 확장함수
- 기존 자바 코드위에 자연스럽게 코틀린 코드를 추가하기 위해 나옴
- 자바로 만들어진 라이브러리를 유지보수, 확장할 때 코틀린코드를 사용하여 개발할 수 있다.
- 어떤 클래스안에 있는 메소드처럼 호출 할 수 있지만 함수는 밖에 만들수 있게하는 기능
- 해당 클래스에 함수나 프로퍼티를 추가한다는 개념!
    ```kotlin
    fun main() {
        val str = "ABC"
        println(str.lastChar())
    }
    
    fun String.lastChar(): Char {
        return this[this.length - 1]
    }
    ```
- 아래 생성한 lastChar 함수를 호출한다.
- 확장함수는 원본 클래스의 private, protected 멤버 접근이 안된다.
    ```private
    class Test(
        private val name: String
    ) {
        fun toUpper(): String {
            return name.uppercase()
        }
    }
    
    fun Test.toUpper(): String {
        return this.name // 접근 안됨(컴퍼일 에러)
    }
    ```
- 멤버함수와 시그니처가 동일하면 멤버함수가 우선적으로 호출된다.

## infix 함수 (중위 함수)
- 함수를 호출하는 새로운 방법 (downTo, step, to, in...)
- 변수.함수이름(argument) => 변수 함수이름 argument 로 변경 가능
```kotlin
infix fun Int.add(other: Int): Int = this + other

val num = 1
println(num add 2) // return 3
```

## inline 함수
- 함수가 호출되는 대신, 함수를 호출한 지점에 함수 본문을 그대로 복붙하고 싶은 경우 사용
- 바이트 코드를 만들때 함수 대신 함수 본문 그대로 들어간다.
- 함수를 파라미터로 전달할 때 오버헤드를 줄일 수 있다.
- 성능측정과 함께 신중하게 사용되어야 한다.

## 지역함수
- 함수안에 함수를 만들수 있다.
- 함수로 추출하면 좋을 것 같은데 지금 함수 안에서면 써야한다면 사용할 수 있다.
- 하지만 코드가 깔끔하지 않을 수 있다.