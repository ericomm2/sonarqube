import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.net.Socket;

public class Vulnerabilities {

    public int publicAttribute = 255;

    public static void useCreateFileToCreateFolder(){
        try {
            File tempDir;
            tempDir = File.createTempFile("", ".");
            tempDir.delete();
            tempDir.mkdir();  // Noncompliant
        }catch (IOException e){
            JOptionPane.showMessageDialog(null,"Cannot create folder");
        }
    }

    public void hardcodedIP(){
        try {
            String ip = "127.0.0.1";
            Socket socket = new Socket(ip, 6667);
        }catch (IOException e){
            JOptionPane.showMessageDialog(null,"Cannot create Socket");
        }
    }

}
