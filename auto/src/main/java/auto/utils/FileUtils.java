package auto.utils;

import java.io.*;

public class FileUtils {
    public static String FILENAME = "E:\\data.txt";

    public static void writeToFile(String fileName,String data){

        try {
            File file = new File(fileName);
            FileWriter fr = new FileWriter(file, true);
            BufferedWriter br = new BufferedWriter(fr);
            PrintWriter pr = new PrintWriter(br);
            pr.println(data);
            pr.close();
            br.close();
            fr.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static String readFromFile(String fileName,String key) throws IOException {
        File file = new File(fileName);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            if (line.contains(key)) {
                return line;

            }
        }
        return null;
    }
    }

