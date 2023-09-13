package dambi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class CopyBytesFNFEKontrolatuz {

    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("xanadu.txt");
            out = new FileOutputStream("outagain.txt");
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } catch (FileNotFoundException e) {
            int a = 1;
            while (a == 1) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Sartu duzun fitxategia ez da existitzen. Berridatzi: ");
                String berria = sc.next();

                    if (berria.equals(correctFile)) {
                    in = new FileInputStream(correctFile + txt);
                    out = new FileOutputStream("outagain.txt");
                    int c;
                    sc.close();

                    while ((c = in.read()) != -1) {
                    out.write(c);
                    }
                a = 0;

                } else {
                    a = 1;
                }
            }

            }
        finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }

    }
}