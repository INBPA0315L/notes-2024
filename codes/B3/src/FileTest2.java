import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileTest2 {
    public static void main(String[] args)
            throws FileNotFoundException {

        try (Scanner sc = new Scanner(new File("input.txt"))) {
            System.out.println(sc.nextLine());
        }
    }
}
