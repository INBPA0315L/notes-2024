# Lab notes 2024

This repository contains notes and exercises for subject *High-level programming languages 2*. Note that the official announcements and other important pieces of information can be found in our Moodle course.

## Agenda

### Topic `A1`

The environment. Language basics. Handling the standard input using a `Scanner` object. Handling the standard output using the `System.out` methods.

#### Notes

1. [`A101` - Environment](A101-environment.md)
1. [`A102` - Language Basics](A102-language-basics.md)

#### Highlights

The next lab will be based on the following expectations. Please ensure that you are aware of all the skills mentioned. Ask your questions using the available Q&A form in Moodle:

1. You must be able to set up the environment at home.
1. You must be able to use the JetBrains license server via your Microsoft account.
1. You must be able to create and build a project using IntelliJ IDEA and CMD as well.
1. You must be able to use a `Scanner` object (without understanding its OO part) to read the standard input.
1. You must be able to use methods `System.out.print()`, `System.out.println()`, and `System.out.printf()` to write the standard output.
1. You must be able to use the control statements.
1. You must be able to solve the basic exercises of HLPL1, handling the three common input formats: https://github.com/INBPA0211L/notes-2024/blob/main/week-03/README.md

---

### Topic `A2`

Defining classes. Defining fields. Overriding methods inherited from the `Object` class. Defining constructors. Visibilities. Reading and writing the `stdin` and the `stdout` in CSV format.

#### Notes

1. [`A201` - OO Basics #1](A201-oo-basics-1.md)

#### Highlights

The next lab will be based on the following expectations. Please ensure that you are aware of all the skills mentioned. Ask your questions using the available Q&A form in Moodle:

1. You must be able to define a top-level class.
1. You must be able to define instance-level fields.
1. You must be understand the visibility levels.
1. You must be able to define constructors.
1. You must be able to override the `toString()` method.
1. You must be able to override the `equals()` and the `hashCode()` methods.
1. You must be able to compare two objects using the `equals()` or `Objects.equal()` methods.
1. You must be able to generate `getter` and `setter` methods.
1. You must be able to read CSV documents from the standard input.
1. You must be able to look for a method's behavior in the JavaDoc using Google.
1. You must be able to convert between types `String`, `int`, and `double`.

---

### Topic `A3`

Implementing the `Comparable` interface. Creating, populating, and sorting 1D arrays. Using the `final` keyword on fields and variables. Primitive vs. reference arrays. Using command-line arguments. Reading, sorting, and writing the `stdin` and the `stdout` in CSV format.

#### Notes

1. [`A301` - OO Basics #2](A301-oo-basics-2.md)

#### Highlights

The next lab will be based on the following expectations. Please ensure that you are aware of all the skills mentioned. Ask your questions using the available Q&A form in Moodle:

1. You must be able to provide, access and process the command-line arguments.
1. You must be able to instantiate, populate, and process 1D arrays.
1. You must be able to compare two primitives using the static comparison methods.
1. You must be able to compare two comparable objects using their `compareTo()` methods.
1. You must be able to make your type comparable by defining its natural order using the `Comparable` interface.
1. You must be able to sort array using the `Arrays.sort()` method.

---

### Topic `B1`

Inheritance. Using the `final` keyword on methods and classes. Implementing the `Comparator` interface. Defining more top-level classes in the same source code.

#### Notes

1. [`B101` - Inheritance](B101-inheritance.md)
1. [`B102` - Implementing the `Comparator` interface #1](B102-comparator-1.md)

#### Highlights

The next lab will be based on the following expectations. Please ensure that you are aware of all the skills mentioned. Ask your questions using the available Q&A form in Moodle:

1. You must be able to derive a class.
1. You must be able to use the `final` keyword on methods and classes.
1. You must be able to implement the `Comparator` interface.
1. You must be able to define multiple top-level classes.

---

### Topic `B2`

Defining nested, static nested, and anonymous classes. Enum classes.

#### Notes

1. [`B201` - Implementing the `Comparator` interface #2](B201-comparator-2.md)
1. [`B202` - Enums](B202-enums.md)

#### Exercises

1. [`P20511` - Airports (`B2`, version #1)](./exercises/P205/P20511.md)
1. [`P20512` - Airports (`B2`, version #2)](./exercises/P205/P20512.md)
1. [`P20513` - Airports (`B2`, version #3)](./exercises/P205/P20513.md)
1. [`P20521` - Roller Coasters (`B2`, version #1)](./exercises/P205/P20521.md)
1. [`P20522` - Roller Coasters (`B2`, version #2)](./exercises/P205/P20522.md)
1. [`P20523` - Roller Coasters (`B2`, version #3)](./exercises/P205/P20523.md)

#### Highlights

The next lab will be based on the following expectations. Please ensure that you are aware of all the skills mentioned. Ask your questions using the available Q&A form in Moodle:

1. You must be able to define and instantiate nested classes.
1. You must be able to define and instantiate static nested classes.
1. You must be able to define and instantiate anonymous classes.
1. You must be able to define and use enum classes.

#### Codes

1. [Project `B2`](./codes/B2)

    Contains solutions for exercises `P20511`, `P20512`, and `P20513`.

---

### Topic `B3`

Static methods, static fields, named constants. File handling. Exception handling.

#### Notes

1. [`B301` - Exceptions and files](B301-exceptions-and-files.md)

#### Exercises

1. [`P2B3E01` - Airports (`B3`)](./exercises/P2B3/P2B3E01.md)
1. [`P2B3E02` - Roller Coasters (`B3`)](./exercises/P2B3/P2B3E02.md)
1. [`P2B3E03` - LEGO Sets (`B3`)](./exercises/P2B3/P2B3E03.md)

#### Highlights

The next lab will be based on the following expectations. Please ensure that you are aware of all the skills mentioned. Ask your questions using the available Q&A form in Moodle:

1. You must understand the hierarchy of exceptions.
1. You must be able to use the blocks `try`, `catch`, and `finally` to handle the required types of exceptions.
1. You must be able to use the `throws` and `throw` keywords.
1. You must be able to define a custom exception type.
1. You must be able to read and write textfiles.
1. You must be able to use the *try with resources* construct.

#### Codes

1. [Project `B3`](./codes/B3)

    Contains solutions for exercise `P20613` and demo codes for exception handling.

---

### Topic `C1`

Maven basics. Generating methods using Lombok annotations. Reading and writing JSON using Jackson. 

#### Notes

1. [`C101` - Maven Basics](C101-maven.md)
1. [`C102` - Project Lombok](C102-lombok.md)
1. [`C103` - Jackson](C103-jackson.md)

#### Exercises

1. [`P2C1E01` - LEGO Sets (`C1`)](./exercises/P2C1/P2C1E01.md)

#### Highlights

The next lab will be based on the following expectations. Please ensure that you are aware of all the skills mentioned. Ask your questions using the available Q&A form in Moodle:

1. You must be able to create a Maven project.
1. You must be able to add a dependency to a `pom.xml`.
1. You must be able to build a Maven project.
1. You must be able to use *Project Lombok*'s selected annotations according to the document [`C102` - Project Lombok](C102-lombok.md).
1. You must be able to read and write JSON documents containing arrays using *Jackson* and *Project Lombok*.
1. You must be able to implement queries using basic algorithms (based on your knowledge gained in other subjects).

#### Codes

1. [Project `C1`](./codes/C1)

    Contains a partial solution for exercise `P2C1E01` and a demo code for using the *JavaFaker* library.

---

### Topic `C2`

The `List` interface and its implementations, the `Set` interface and its implementations. Implementing queries using `List` and `Set` objects.

---

### Topic `C3`

The `Map` interface and its implementations. Implementing queries using `Map` objects.
