package dambi;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharactersOrdezkatuz {
    public static void main(String[] args) throws IOException {

        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader("xanadu.txt");
            outputStream = new FileWriter("characteroutput.txt");

            int c;
            

            while ((c = inputStream.read()) != -1) {
                char ch = (char) c;
                if (ch == 97) {
                    ch = 111 ;
                } else if (ch == 65) {
                    ch = 79;
                }
                
                outputStream.write(ch);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}






