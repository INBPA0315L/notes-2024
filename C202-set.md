[↑ Back](./README.md)

# `C202` - `Set` interface and its implementation

## Sample code

### Using the class `HashSet`

```java
import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(5);
        System.out.println(numbers.add(3));
        System.out.println(numbers.add(5));
        System.out.println(numbers);

        System.out.println(numbers.size());
        System.out.println(numbers.contains(1));
        for(int number: numbers){
            System.out.println(number);
        }
    }
}
```

### Using the class `TreeSet`

```java
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        Set<String> fruits = new TreeSet<>();
        // var fruits = new TreeSet<String>();
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("lemon");
        System.out.println(fruits);

        for(String fruit: fruits){
            System.out.println(fruit);
        }
    }
}
```

## Highlights

Check the documentation's *Method Summary* section for the highlights.

## References

1. [Interface `Collection<E>`](https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html)
1. [Interface `Set<E>`](https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Set.html)
1. [Class `HashSet<E>`](https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/HashSet.html)
1. [Class `TreeSet<E>`](https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/TreeSet.html)

## Tutorials

1. [Baeldung | Java Collections Series](https://www.baeldung.com/java-collections)