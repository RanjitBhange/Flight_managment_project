package projects;

import java.io.*;
import java.util.jar.Attributes;

public class StoreData extends generater {
   void WriteData(){
       try {
           FileWriter fw = new FileWriter("C:\\Users\\LENOVO\\OneDrive\\Desktop\\FlightData.txt",true);
            fw.write("\n");
            fw.write("======= User Data =======");
            fw.write("\n Name : "+Name);
           fw.write("\n  City : "+city);
           fw.write("\n Flightno : "+flightNumber());
           fw.write("\n Seatno   : "+seatnumber ());
           fw.flush();

       } catch (IOException e) {
           throw new RuntimeException(e);
       }
   }
   void ReadData(){
       try {
           BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\LENOVO\\OneDrive\\Desktop\\FlightData.txt"));
           String line;
           while ((line = br.readLine()) != null) {
               System.out.println(line);
           }
       } catch (FileNotFoundException e) {
           throw new RuntimeException(e);
       }
       catch (IOException e) {
           throw new RuntimeException(e);
       }
   }

}
