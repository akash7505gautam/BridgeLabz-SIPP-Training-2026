import java.io.*;
public class ReadingAndWritingFile{
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: data.txt");
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}