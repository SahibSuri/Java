package bank.util;

import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

    public static void save(String data) {

        try {

            FileWriter writer = new FileWriter("accounts.txt", true);

            writer.write(data + "\n");

            writer.close();

        } catch(IOException e) {

            System.out.println("File error occurred");
        }
    }
}