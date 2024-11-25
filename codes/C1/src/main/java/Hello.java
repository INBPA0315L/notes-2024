import com.github.javafaker.Faker;

public class Hello {
    public static void main(String[] args) {
        Faker faker = new Faker();
        System.out.println("Hello " + faker.name().name());
    }
}
