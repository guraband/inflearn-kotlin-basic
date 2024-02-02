package kotlinbasic.section4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class JavaLecture17 {
    public static void main(String[] args) {
        var fruits = List.of(
                new Fruit("사과", 1_000),
                new Fruit("사과", 1_200),
                new Fruit("사과", 1_500),
                new Fruit("사과", 1_500),
                new Fruit("사과", 1_000),
                new Fruit("바나나", 3_000),
                new Fruit("바나나", 3_200),
                new Fruit("바나나", 2_500),
                new Fruit("수박", 10_000)
        );

        Predicate<Fruit> isApple = fruit -> "사과".equals(fruit.getName());

        System.out.println(new JavaLecture17().filterFruits(fruits, isApple));
    }

    private List<Fruit> filterFruits(List<Fruit> fruits, Predicate<Fruit> filter) {
        return fruits.stream()
                .filter(filter)
                .collect(Collectors.toList());
    }
}
