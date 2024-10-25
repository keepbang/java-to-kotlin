# 코틀린에서 중첩 클래스를 다루는 방법

## 코틀린의 중첩 클래스와 내부 클래스
- 자바에서는 중첩 클래스를 static을 사용하지 않고 사용하면 메모리 누수가 발생할 수 있다.
- 코틀린에서는 권장되는 중첩 클래스를 사용한다.
- 기본적으로 코틀린은 바깥 클래스와 연결이 없는 중첩클래스가 만들어진다.
- (권장하지 않는 방법)바깥 클래스와 연결되는 클래스를 만들려면 `inner` 키워드를 class 앞에 붙여야한다.
- `inner`클래스 내부에서 바깥 클래스를 참조할 때에는 `this@{클래스이름}`을 사용해야한다.
```kotlin
class House(
    private val address: String,
    private val livingRoom: LivingRoom,
    private val people: List<People>
) {
    class LivingRoom(
        private val area: Double
    )

    inner class People(
        private val name: String
    ) {
        val address: String
            get() = this@House.address
    }
}
```