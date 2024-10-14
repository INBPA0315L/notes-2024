[↑ Back](./README.md)

# `B102` - Implementing the `Comparator` interface

## Highlights

1. Implementing `Comparator` interface

   1. the interface's documentation
   1. the syntax for implementing the interface
   1. the return value of the method

      1. `0` in the case of equality
      1. `<0` if the left parameter goes first
      1. `>0` if the right parameter goes first

1. Using the `Objects.compare()` method

   1. the `Comparator.naturalOrder()` method for ascending order
   1. the `Comparator.reverseOrder()` method for descending order

1. Defining multiple top-level classes

   1. the `public` class's name should meet the source file's name
   1. other classes cannot be `public`

1. Defining nested classes

   1. you need to invoke the constructor via a reference
   1. the nesting instance's members can be accessed from the nested class
   1. useful in rare cases

1. Defining static nested classes

   1. you need to invoke the constructor in a static way
   1. the nesting instance's members can be accessed from the nested class
   1. useful in many cases (when a reusable class has a strong connection with another)

1. Defining anonymous classes

   1. you can give a disposible definition for the abstract methods
   1. useful in many cases (when you need a single instance)

## Exercises

1. [`P20411` - Airports](./exercises/P204/P20411.md)
1. [`P20412` - Roller Coasters](./exercises/P204/P20412.md)

## References

The list is not complete, more references will be added:

1. TODO

