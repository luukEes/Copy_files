import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
public class Main {
    private static void copyFile(String directory, String secondDirectory, String fileName, String secondFileName) throws FileNotFoundException{
        String finalNameFirst = fileName;
        String finalNameSecond = secondFileName;
        File src = new File(directory);
        File dest = new File(secondDirectory);
        boolean exists = src.exists();
        try {
            if (exists == true) {
                Files.copy(src.toPath(), dest.toPath());
                System.out.println("Files copied");
            }
            else {
                System.out.println("smth wrong");
            }
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
    public static void main (String[]args) throws FileNotFoundException {
        copyFile("C:\\Users\\sowul\\Copy_files\\kunolis.txt","C:\\Users\\sowul\\Copy_files\\kunolisKopia.txt","kunolis.txt","kunlisKopia");
    }
}
