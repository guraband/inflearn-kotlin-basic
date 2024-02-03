package kotlinbasic.section4

// 18강. 코틀린에서 컬렉션을 함수형으로 다루는 방법
fun main() {
    val samePriceFruits = fruitsInList.flatMap { list ->
        list.filter { fruit -> fruit.price == fruit.factoryPrice }
    }
    println(samePriceFruits)

    val samePriceFruits2 = fruitsInList.flatMap { list -> list.samePriceFilter }
    println(samePriceFruits2)

    println(fruitsInList.flatten())
}

val List<Fruit>.samePriceFilter: List<Fruit>
    get() = this.filter { it.isSamePrice }

val fruitsInList: List<List<Fruit>> = listOf(
    listOf(
        Fruit(1L, "사과", 1_000, 1_500),
        Fruit(2L, "사과", 1_200, 1_500),
        Fruit(3L, "사과", 1_200, 1_500),
        Fruit(4L, "사과", 1_500, 1_500),
    ),
    listOf(
        Fruit(5L, "바나나", 3_000, 3_200),
        Fruit(6L, "바나나", 3_200, 3_200),
        Fruit(7L, "바나나", 2_500, 3_200),
    ),
    listOf(
        Fruit(8L, "수박", 10_000, 10_000),
    ),
)