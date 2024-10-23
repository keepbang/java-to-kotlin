# 코틀린에서 클래스를 다루는 방법

## 클래스, 프로퍼티, 생성자
- 코틀린에서는 클래스의 멤버변수를 프로퍼티라고 한다.
- 기본 접근제어자는 `public`
- val로 선언할 경우 setter 미제공
- var로 선언할 경우 setter, getter 자동으로 만들어준다.
- 클래스명 옆에 존재하는 주 생성자는 반드시 존재해야 한다. (constructor 키워드 생략 가능)
- 클래스 내에 보조 생성자를 만들 수 있다. (this로 주 생성자를 호출 해야함)
    ```kotlin
    class KotlinPerson(
        val name: String,
        var age: Int = 1
    ) {
  
      // this로 생성해야한다.
      // 아래 부 생성자보다는 default parameter를 권장한다. 필요할 때에는 정적 팩토리 메소드를 사용한다.
      constructor(name: String): this(name, 1) {
          println("부생성자")
      }

    }
    
    val person = KotlinPerson("name", 1)

    ```

## init
- 클래스를 생성한 시점에 한번만 실행됨. PostConstructor와 비슷함
    ```kotlin
  // 클래스 내부에 선언
    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 0보다 커야 합니다.")
        }
        println("초기화 블록")
    }
    ```

## 커스텀 getter, setter, backing field
- get이나 set에 다른 로직이 필요한 경우 커스텀으로 만들 수 있다.
  ```kotlin
  val name: String = name
    get() = field.uppercase()
  
  var age: Int = age
    set(value) {
        field = value + 1
    }
  ```
- `field` : `backing field`로 자기 자신을 기르키는 역할을 함.

## 함수
- 클래스 내부에 함수를 프로퍼티처럼 만들 수 있다.
  ```kotlin
  val isAdult: Boolean
    get() = this.age >= 20
  
  ...
  val person = KotlinPerson("name", 19)
  adult.isAdult => false
  ```