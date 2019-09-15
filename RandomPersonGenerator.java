import java.util.Random;
import java.util.ArrayList;
import java.io.*;
import java.text.DecimalFormat;

public class RandomPersonGenerator {
  
 
  public static void main (String args[]) throws FileNotFoundException,IOException {
    
    Random rand = new Random();
    InputStream is;
    BufferedReader reader;
    String line;
    
    // >>
    int size = 40; // the number of entries you want printed 
    // <<
    
    ArrayList<String> fNameList = new ArrayList<>();
    ArrayList<String> sNameList = new ArrayList<>();
    
    
    // FIRST NAME
    is = new FileInputStream("fname.txt");
    reader = new BufferedReader(new InputStreamReader(is));
    while ((line = reader.readLine()) != null) {
      fNameList.add(line);
    }
    reader.close();
    
    // LAST NAMES
    is = new FileInputStream("sname.txt");
    reader = new BufferedReader(new InputStreamReader(is));
    while ((line = reader.readLine()) != null) {
      sNameList.add(line);
    }
    reader.close();

    // DOB - customize year range for your personal use
    String[] dob = new String[size];
    for(int i = 0; i < dob.length; i++) {
      int y = rand.nextInt(70)+1940;
      int m = rand.nextInt(12)+1;
      int d = rand.nextInt(28)+1;
      dob[i] = Integer.toString(y) + "-" + Integer.toString(m) + "-" + Integer.toString(d);
    }
    
    // GENDER
    String[] gender = new String[size];
    int genderBit;
    for(int i = 0; i < gender.length; i++) {
      genderBit = rand.nextInt(2)+1;
      if(genderBit==1) { gender[i] = "M"; }
      else {gender[i] = "F"; }
    }

    
    // Set threshold for random index selection, based on smallest array list size
    int threshold = fNameList.size(); int secondSize = sNameList.size();
    if (secondSize < threshold) { threshold = secondSize; }
    System.out.println(sNameList.size());
    
    
    // GENERATE FIRST NAME, LAST NAME AND D.O.B STRINGS
    // set random index range between 1 and arraylist size(s)
    int randomIndex;
    for(int i = 0; i < size; i++) {
      randomIndex = rand.nextInt(threshold);
      System.out.println("('"+fNameList.get(randomIndex)+"',"
                           +"'"+sNameList.get(randomIndex)+"',"
                           +"'"+dob[i]+"',"
                           +"'"+gender[i]+"'),");
    }
  }
}