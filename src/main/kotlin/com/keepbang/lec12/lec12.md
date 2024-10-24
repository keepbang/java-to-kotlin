# 코틀린에서 object 키워드를 다루는 방법

## static 함수와 변수
- 코틀린에서는 `static`이라는 키워드는 없다.
- `static` 대신 `companion object`를 선언해서 구현할 수 있다.
- `class명.Companion`에 선언한 변수나 함수들이 들어있다. `Companion`을 생략할 수 있다.
- 하나의 객체로 만들어지기 때문에 이름을 줄수도 있고 인터페이스 구현이나 추상 클래스 상속도 가능하다.
    ```kotlin
    class Person private constructor(
        var name: String,
        var age: Int
    ) {
        companion object {
            const val MIN_AGE = 1
            fun newBaby(name: String): Person {
                return Person(name, MIN_AGE)
            }
        }
    }
    ```
### `companion object`
- 클래스와 동행하는 유일한 오브젝트
- `companion object`를 사용해서 유틸성 함수를 만들어도 되지만 최상단 파일을 활용하는것을 추천함.
- java에서 해당 `companion object`를 `static`처럼 사용하려면 코틀린 코트에 `@JvmStatic`을 붙여야한다.

### `const`
- `const`키워드를 사용해서 변수를 선언하면 컴파일 시에 변수가 할당된다.
- 진짜 상수를 의미하며 기본타입과 `String` 변수만 붙일 수 있다.

## 싱글톤
- 하나의 인스턴스만 갖는 클래스
- 앞에 `object` 키워드를 붙이면된다.
- 사용할 때에는 객체 생성 없이 바로 사용할 수 있다.
```kotlin
object SingletonComponent {
    var a:Int = 0
}

fun main() {
  println(SingletonComponent.a)
  println(SingletonComponent.a + 10)
}
```

## 익명 클래스
- 자바에서는 일회성으로 인터페이스를 구현하고 싶을때 생성자 형식으로 만들고 중괄호로 내부 함수를 구현하는 식으로 만들었다.
- 코틀린에서는 `object`를 사용해서 구현한다.
```kotlin
fun moveSomething(movable: Movable) {
  movable.move()
  movable.fly()
}

fun main() {
  moveSomething(object: Movable {
    override fun move() {
      TODO("Not yet implemented")
    }

    override fun fly() {
      TODO("Not yet implemented")
    }

  })
}

```