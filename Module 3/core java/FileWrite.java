import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);
             FileWriter writer = new FileWriter("output.txt")) {
            System.out.print("Enter text: ");
            String text = sc.nextLine();
            writer.write(text);
            System.out.println("Written to output.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
