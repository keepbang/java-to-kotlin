# 코틀린에서 람다를 다루는 방법

## 자바에서 람다 사용
- 람다 표현식과 스트림 API, Optional 클래스, 함수형 인터페이스 등 다양한 함수형 프로그래밍을 지원하기 위한 기능 도입
- 메소드 자체를 직접 넘겨주는 것처럼 쓸 수 있다.
- 자바에서 함수는 변수에 할당되거나 파라미터로 전달할 수 없다.(2급시민)

## 코틀린에서의 람다
- 코틀린에서의 함수는 그 자체로 값이 될 수 있다. 변수에 할당할수도, 파라미터로 넘길 수도 있다(1급시민)
    ```kotlin
    // 람다를 만드는 방법 두가지
    val isApple = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }
    
    val isApple2 = {
        fruit: Fruit -> fruit.name == "사과"
    }
    
    private fun filterFruits(
        fruits: List<Fruit>, filter: (Fruit) -> Boolean
    ): List<Fruit> {
        val results = mutableListOf<Fruit>()
        for (fruit in fruits) {
            if (filter(fruit)) {
                results.add(fruit)
            }
        }
        return results
    }
    
    // 호출 방법
    isApple(fruits[0])
    isApple.invoke(fruits[0])
    1. filterFruits(fruits, isApple)
    2. filterFruits(fruits, { fruit: Fruit -> fruit.name == "사과" })
    3. filterFruits(fruits) { fruit: Fruit -> fruit.name == "사과" }
    4. filterFruits(fruits) { fruit -> fruit.name == "사과" }
    ```

- 파라미터가 한개일 경우 it을 사용하면 된다.
    ```kotlin
    filterFruits(fruits) { it.name == "사과" }
    ```

## Closure
- 자바에서는 람다를 쓸 때 밖에있는 non-final 변수 사용에는 제약이 있다.
- 코틀린에서는 람다가 시작할때 참조하는 변수를 모두 포획해서 사용한다. -> 이러한 데이터 구조를 `Closure`라고한다.
    ```kotlin
    var targetName = "바나나"
    filterFruits(fruits) { it.name == targetName }
    ```
  
## try with resources
- 아래 처럼 사용할 수 있다.
```kotlin
BufferedReader(FileReader(path)).use(BufferedReader::readLine)

BufferedReader(FileReader(path)).use {
    BufferedReader::readLine
}
```