[↑ Back](./README.md)

# `B301` - Exception and File Handling

## Highlights

1. Exception hierarchy

   1. `Throwable` (checked)
   1. `Error` (unchecked)
   1. `Exception` (checked)
   1. `RuntimeException` (unchecked)

1. Dealing with exceptions

   1. the `try` block
   1. the `catch` block
   1. the `finally` block
   1. using multiple `catch` blocks
   1. the `throws` keyword in method signatures
   1. throw an exception using the keyword `throw`
   1. create a custom exception
   1. the Pokémon Exception Handling

1. Reading a file using `Scanner`

   1. implements the `Closeable` interface
   1. pass the `File` object to the constructor (instatiating a `FileWriter`)

1. Writing a file using `PrintWriter`

   1. implements the `Closeable` interface
   1. pass the `PrintWriter` object to the constructor (instatiating a `FileWriter`)

1. Try with resources

   1. interface `Closeable` and `AutoCloseable`
   1. instantiating one resource
   1. instantiating more resources

1. Using buffered I/O operations

   1. `BufferedWriter` for writing
   1. `BufferedReader` for reading

## References

The list is not complete; more references will be added:

1. [Baeldung | Exception Handling in Java](https://www.baeldung.com/java-exceptions)
1. [Baeldung | Create a Custom Exception in Java](https://www.baeldung.com/java-new-custom-exception)
1. [Baeldung | Java - Try with Resources](https://www.baeldung.com/java-try-with-resources)
1. [Baeldung | Guide to BufferedReader](https://www.baeldung.com/java-buffered-reader)
1. [Baeldung | Guide to FileWriter vs. BufferedWriter](https://www.baeldung.com/java-filewriter-vs-bufferedwriter)
1. [Baeldung | Difference Between FileReader and BufferedReader in Java](https://www.baeldung.com/java-filereader-vs-bufferedreader)
1. [Pokemon Exception Handling](https://wiki.c2.com/?PokemonExceptionHandling)