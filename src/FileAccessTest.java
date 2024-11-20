import java.io.File;

public class FileAccessTest {
    public static void main(String[] args) {
        File file = new File("src/test.txt");

        System.out.println("Absolute Path: " + file.getAbsolutePath());
        System.out.println("File exists: " + file.exists());
        System.out.println("File can read: " + file.canRead());

        if (!file.exists()) {
            System.err.println("The file does not exist.");
        } else if (!file.canRead()) {
            System.err.println("The file is not readable.");
        } else {
            System.out.println("The file is readable and can be accessed by the program.");
        }
    }
}
