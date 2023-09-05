import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        File file = new File("poem.txt");
        BufferedReader bufferedReader = null;
        Queue<String> queue = new LinkedList<>();

        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String line =  " ";
            while(line != null){
                line = bufferedReader.readLine();
                queue.add(line);
            }
            SleepOut(queue);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void SleepOut(Queue<String> queue){
        while(queue.peek() != null){
            int rand_num = (int)(Math.random() * 2000) + 1000;
            try {
                Thread.sleep(rand_num);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(queue.poll());
        }
    }
}