import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadFile {
    public static void main(String[] args) throws IOException{
        var p = Path.of("README.md");
        String s = Files.readString(p);
        System.out.println(s);

    }
}
