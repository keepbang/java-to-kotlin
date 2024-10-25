# 코틀린에서 배열과 컬렉션을 다루는 방법

## 배열
- 코틀린에서 배열은 잘 사용하지 않는다.
- 이펙티브자바에서도 배열보다는 리스트를 사용하라고 한다.
    ```kotlin
    fun main() {
        val array = arrayOf(100, 200) // 100, 200이 들어가있는 배열
    }
    ```
- 여러가지 방법으로 배열의 값들을 가져올 수 있다.
    ```kotlin
    for (value in array) // 배열의 값만 가져옴
    for (index in array.indices) // 배열의 index만 가져옴
    for ((index, value) in array.withIndex()) // 배열의 index와 값을 가져옴
    ```
- `plus`로 값을 추가할 수는 있지만 새로운 객체로 copy해서 내보낸다.

## 코틀린에서의 Collection - List, Set, Map
- 컬렉션을 만들때는 불변인지 가변인지를 설정해야 한다.
  - 불변 : List, Map, Set
  - 컬렉션에 element를 추가, 삭제할 수 없다.
  - 가변 : MutableList, MutableSet, MutableMap
  - 컬렉션에 element를 추가, 삭제할 수 있다.
- 컬렉션을 만들때 `Collections.unmodifiableList`, `Collections.unmodifiableMap` 등을 사용해서 불변 컬렉션을 만들수 있다.
- 컬렉션을 만들때 타입추론으로 타입을 명시하지 않아도 되지만 비어있는 컬렉션은 타입을 넣어야 한다.
- `mutable`이 붙지않은 함수는 불변 객체를 생성한다.
- `map`
  - `to` 키를 사용해서 값을 추가할 수 있다. `mapOf(1 to 'mon', 2 to 'tue')`
  - for문을 사용할 때 `entries`를 사용하여 key와 value를 같이 가져올 수 있다.

## 컬렉션의 null 가능성, Java와 함께 사용하기
- `?`위치에 따라 다르다.
- `List<Int?>`
  - 리스트에는 null이 들어갈 수 있지만 리스트는 절대 null이 아님
- `List<Int>?`
  - 리스트에는 null이 들어갈 수 없지만, 리스트는 null일 수 있음
- `List<Int?>?`
  - 리스트에 null이 들어갈 수도 있고, 리스트가 null일 수도 있음
- 코틀린쪽 컬렉션이 자바에서 호출되면 컬렉션 내용이 변할 수 있다.
- `unmodifiableMap`를 사용하면 변경 자체를 막을 수 있다.
- 코틀린에서 자바 컬렉션을 사용할 경우 플랫폼 타입을 신경써야한다.(null 처리)
- 