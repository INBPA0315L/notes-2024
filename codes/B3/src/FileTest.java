import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileTest {
    public static void main(String[] args)
            throws FileNotFoundException {

        Scanner sc = new Scanner(new File("input.txt"));
        System.out.println(sc.nextLine());
        sc.close();
    }
}
