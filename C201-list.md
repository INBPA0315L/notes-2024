[↑ Back](./README.md)

# `C201` - `List` interface and its implementation

## Sample code

```java
import java.util.ArrayList;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        System.out.println(list);
        list.add(4);
        list.add(4);
        list.add(5);
        System.out.println(list);
        System.out.println(list.contains(4));
        System.out.println(list.indexOf(4));
        System.out.println(list.lastIndexOf(4));
        System.out.println(list.size());
        System.out.println(list.get(2));
        // System.out.println(list.get(4));
        list.set(2, 7);
        System.out.println(list);

        for(int i=0; i<list.size(); i++){
            System.out.println(i);
        }

        for(int number: list){
            System.out.println(number);
        }
    }
}
```

## Highlights

Check the documentation's *Method Summary* section for the highlights.

## References

1. [Interface `Collection<E>`](https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html)
1. [Interface `List<E>`](https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/List.html)
1. [Class `ArrayList<E>`](https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/ArrayList.html)
1. [Class `Collectons`](https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collections.html)

## Tutorials

1. [Baeldung | Java Collections Series](https://www.baeldung.com/java-collections)