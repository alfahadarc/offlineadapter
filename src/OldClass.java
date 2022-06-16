import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OldClass {
    public void calculateSum(String f){
        try
        {
            int sum = 0;
            File myObj = new File(f);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNext()) {
                sum = sum + myReader.nextInt();
            }
            System.out.println("Total sum is: "+sum);
            myReader.close();
        }catch (FileNotFoundException e) {
            System.out.println("no file found");
            e.printStackTrace();
        }
    }
}
