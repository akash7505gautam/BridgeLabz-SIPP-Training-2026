import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
public class SchoolResultPortal {    
    public static void main(String[] args) {
        try{
            BufferedReader br=new BufferedReader(new FileReader("students.txt"));
            BufferedWriter bw=new BufferedWriter(new FileWriter("report.txt",true));
            String line;
            int totalMarks=0;
            int count=0;
            bw.write("\n----- Report Card -----\n");
              while ((line = br.readLine()) != null) {
                String[] data = line.split(" ");
                String name = data[0];
                int marks = Integer.parseInt(data[1]);
                totalMarks += marks;
                count++;
                bw.write("Name: " + name + "  Marks: " + marks);
                bw.newLine();
            }
            double average = (count > 0) ? (double) totalMarks / count : 0;
            bw.write("Average Marks: " + average);
            bw.newLine();
            bw.write("-----------------------");
            bw.newLine();
            br.close();
            bw.close();
            System.out.println("Report generated successfully.");
        }
        catch(FileNotFoundException e){
            System.out.println("Students.txt not found");
        }
        catch(IOException e){
            System.out.println("File Handling error"+e.getMessage());
        }
    }
}

