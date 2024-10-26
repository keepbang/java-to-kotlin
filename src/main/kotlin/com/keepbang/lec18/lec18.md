# 코틀린에서 컬렉션을 함수형으로 다루는 방법 
- 유용한 기능들

## 필터와 맵, 다양한 컬렉션 처리 기능 
- `filter`와 `map` 을 사용하면 컬렉션들에 대한 조건 처리나 변환처리를 다양하게 할 수 있다.
- `mapNotNull`, `mapIndexed`, `filterNotNull`, `filterIndexed` 등 다양한 함수형 인터페이스를 제공한다.
- `sortedBy`를 사용해서 정렬을 진행할 수 있다. 내림차순으로 정령하고자 하면 `sortedDescending`을 사용한다.

## List를 Map으로
- list를 map으로 변경하기 위해서는 `groupBy`를 사용하면 된다. -> `map<key, list<value>>` 형태
    - `groupBy({ obj -> obj.key}, {obj -> obj.value})`
    ```kotlin
    val map: Map<String, List<Fruit>> = fruits.groupBy { it.name }
    
    for (key in map.keys) {
        val list: List<Fruit>? = map[key]
        val str = list?.joinToString(separator = ",") { it.price.toString() } ?: ""
    
        println("$key -> $str")
    }
    ```
- `associateBy`를 사용하면 중복되지 않는 키를가지고 map을 만들때 사용한다. -> `Map<key, value>` 형태
  - `associateBy({ obj -> obj.id}, {obj -> obj.value})`
- map으로 변경한 후 filter를 사용해서 조건 처리가 가능하다
  - `filter { (key, value) -> key == '값' }`

## 중첩된 컬렉션
- `list`안에 `list`가 들어가있는 컬렉션같은 경우에는 `flatMap`을 사용하면 된다.
- 확장함수로 `List<Any>` 형태의 함수를 구현해서 `flayMap`에 사용할 수 있다.
- 만약 `List<List<Fruit>>` 를 그냥 `List<Fruit>`로 바꿔야 한다면 `flatten`을 사용하면된다