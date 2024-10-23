# 코틀린에서 상속을 다루는 방법

## 추상 클래스
- 추상 클래스와 추상 함수는 `abstract` 키워드를 사용해서 선언
  ```kotlin
  abstract class Animal(
      protected val species: String,
      protected open val legCount: Int
  ) {
      abstract fun move()
      abstract fun sound()
  }
  ```
- 추상 클래스는 프로퍼티, 함수, 추상함수를 포함할 수 있다
- 외부에서 프로퍼티를 오버로딩 할려면 `open`키워드를 사용해서 열어줘야한다.
  ```kotlin
  class Penguin(
      species: String,
      wingCount: Int
  ): Animal(species, 2), Swimable, Flyable {
  
      private val wingCount: Int = 2
  
      // 프로퍼티에 오버라이드를 할때에는 open키워드를 붙여야 오버라이드 할 수 있다.
      override val legCount: Int
          get() = super.legCount + this.wingCount
  
      override fun move() {
          println("move")
      }
  
      override fun sound() {
          println("sound")
      }
  
      override fun act() {
          super<Swimable>.act()
          super<Flyable>.act()
      }
  
  }
  ```
- `abstract` 클래스가 아닌 경우 `open` 키워드를 클래스에 붙여야 상속 가능하다. 
- `:` 으로 상속 가능하다. 상속할때에는 프로퍼티를 부모 클래스의 생성자 값으로 추가해줘야 한다. 

## 인터페이스
- 추상 클래스와 마찬가지로 `:` 으로 상속 가능하다.

## 클래스를 상속할 때 주의해야할 사항
- 상위 클래스의 생성자가 먼저 실행 되기 때문에 하위 클래스에 오버라이드 하고 있는 프로퍼티를 사용하면 안된다.
- 상위 클래스 생성자 또는 초기화 블록에서 open 프로퍼티를 사용하면 얘기치 못한 버그가 생길 수 있다.
