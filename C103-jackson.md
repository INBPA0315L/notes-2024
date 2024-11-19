[↑ Back](./README.md)

# `C103` - Jackson

## Highlights

### Adding the dependency

Add the following element to `pom.xml`:

```xml
<!-- https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind -->
<dependency>
    <groupId>com.fasterxml.jackson.core</groupId>
    <artifactId>jackson-databind</artifactId>
    <version>2.18.1</version>
</dependency>
```

### The `ObjectMapper` class

1. Instantiation

    ```java
    ObjectMapper mapper = new ObjectMapper();
    ```

1. Reading a document from a file

    ```java
    mapper.readValue(File, Class);
    ```

1. Writing a document to a file

    ```java
    mapper.readValue(File, value);
    ```

### Requirements

1. Serialization: getter methods
1. Deserialization: no-args constructor + setter methods


### Additional

1. Property `@JsonProperty`

   1. to specify the property's name
   1. to specify the enum constant's representation

1. Enabling the indentation

    ```java
    mapper.enable(SerializationFeature.INDENT_OUTPUT);
    ```

### References

1. [Baeldung | Jackson JSON Series](https://www.baeldung.com/jackson)
1. [Baeldung | Intro to the Jackson ObjectMapper](https://www.baeldung.com/jackson-object-mapper-tutorial)