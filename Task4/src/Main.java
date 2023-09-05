import java.io.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {

        File file = new File("poem.txt");
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String paragraph = bufferedReader.readLine();
            int countline = 0;
            while (paragraph != null) {
                if (paragraph.equals("")) {
                    while (paragraph.equals("")) {
                        paragraph = bufferedReader.readLine();
                    }
                    countline++;
                } else {
                    File newFile = new File("poem" + (countline + 1) + ".txt");
                    newFile.createNewFile();
                    PrintWriter printWriter = new PrintWriter(newFile);
                    while (paragraph != null && !paragraph.equals("")) {
                        printWriter.println(paragraph);
                        paragraph = bufferedReader.readLine();
                    }
                    printWriter.close();
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}