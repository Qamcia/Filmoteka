import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class PierwszyProgram {

    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    ArrayList<String> lines = new ArrayList<>();

    System.out.println("Name of the file?");
    String fileName = scan.nextLine();

    System.out.println("Choose the number from 1 to 10:");
    int number = Integer.valueOf(scan.nextLine());


// we create a scanner for reading the file
    try (Scanner scanner = new Scanner(Paths.get(fileName))) {

    // we read all the lines of the file
        while (scanner.hasNextLine()) {
        lines.add(scanner.nextLine());
        }

    } catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
    }

// we print the total number of lines
    System.out.println("You schould watch: " + lines.get(number - 1));
    }
}
