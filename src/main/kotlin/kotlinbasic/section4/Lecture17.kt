package kotlinbasic.section4

// 17. 코틀린에서 람다를 다루는 방법
fun main() {
    val fruits = listOf(
        Fruit(1L, "사과", 1_000, 1_000),
        Fruit(1L, "사과", 1_200, 1_200),
        Fruit(1L, "사과", 1_500, 1_500),
        Fruit(1L, "사과", 1_500, 1_500),
        Fruit(1L, "사과", 1_000, 1_000),
        Fruit(1L, "바나나", 3_000, 3_000),
        Fruit(1L, "바나나", 3_200, 3_200),
        Fruit(1L, "바나나", 2_500, 2_500),
        Fruit(1L, "수박", 10_000, 10_000),
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

data class Fruit(val id: Long? = null, val name: String, val factoryPrice: Int, val price: Int) {
    val isSamePrice: Boolean
        get() = factoryPrice == price
}