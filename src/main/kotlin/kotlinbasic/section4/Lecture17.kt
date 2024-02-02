package kotlinbasic.section4

// 17. 코틀린에서 람다를 다루는 방법
fun main() {
    val fruits = listOf(
        Fruit("사과", 1_000),
        Fruit("사과", 1_200),
        Fruit("사과", 1_500),
        Fruit("사과", 1_500),
        Fruit("사과", 1_000),
        Fruit("바나나", 3_000),
        Fruit("바나나", 3_200),
        Fruit("바나나", 2_500),
        Fruit("수박", 10_000),
    )

    val isApple = { fruit: Fruit -> fruit.name == "사과" }

    println(filterFruits(fruits, isApple))
}

private fun filterFruits(
    fruits: List<Fruit>,
    filter: (Fruit) -> Boolean
): List<Fruit> {
    return fruits.filter(filter)
    /*
    val results = mutableListOf<Fruit>()
    for (fruit in fruits) {
        if (filter(fruit)) {
            results.add(fruit)
        }
    }
    return results
    */
}

data class Fruit(val name: String, val price: Int)