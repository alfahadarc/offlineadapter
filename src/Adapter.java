import java.io.*;
import java.util.Scanner;

public class Adapter {
    OldClass oldClass = new OldClass();

    void calculateSumAdapater(String f){
        try
        {
            String fileName = "converted.txt";
            File myObj = new File(f);
            BufferedReader reader = new BufferedReader(new FileReader(myObj));

            FileWriter myWriter = new FileWriter(fileName);


            String oldContent = "";
            String line = reader.readLine(); //read the file line by line

            while (line != null)
            {
                oldContent = oldContent + line + System.lineSeparator();
                line = reader.readLine();
            }
            String newContent = oldContent.replaceAll("~", " ");
            myWriter.write(newContent);
            reader.close();
            myWriter.close();
            oldClass.calculateSum(fileName);

            File deletedFile = new File(fileName);
            if (deletedFile.delete()) {
                System.out.println("Deleted the file: " + deletedFile.getName());
            }


        }catch (FileNotFoundException e) {
            System.out.println("no file found");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("writing failed");
            e.printStackTrace();
        }
    }
}
