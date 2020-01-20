package java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class IoFilesDemo {
    public static void main(String[] args) throws IOException {

        // new in 11
        Path path = Files.writeString(Files.createTempFile("test", ".txt"), "This is a test");
        System.out.println(path);

        // new in 11
        String s = Files.readString(path);
        System.out.println(s);
    }

}