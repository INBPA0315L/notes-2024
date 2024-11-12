import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        while (sc.hasNextLine()) {
            try {
                String line = sc.nextLine();
                String[] tokens = line.split(" ");
                switch (tokens[0]) {
                    case "+":
                        result += Integer.parseInt(tokens[1]);
                        break;
                    case "/":
                        result /= Integer.parseInt(tokens[1]);
                        break;
                }
                System.out.println(result);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Please enter the number as well");
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number");
            } catch (Exception e) {
                System.out.println("Something went wrong");
            }
        }
    }
}
