import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReading {
    public static void main(String[] args) {

        String separator = File.separator;
        String path = separator + "C:" + separator + "Users" + separator + "bareisha.darya" + separator + "Desktop" + separator + "АББРЕВИАТУРЫ.txt";
        File file = new File(path);
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            e.printStackTrace(); 
        }
    }
}

