import java.util.Random;
import java.io.*;
import java.text.DecimalFormat;

public class RandomSQLDataGenerator {
  
 
  public static void main (String args[]) throws FileNotFoundException,IOException {
    
    Random rand = new Random();
    int baseNo;
    InputStream is;
    BufferedReader buf;
    String line;
    int size = 750;
    
    
    // MEMBER N
    int[] memberNos = new int[size];
    baseNo = 2017000000;
    for(int i = 0; i < memberNos.length; i ++) {
      memberNos[i] = rand.nextInt(500)+2017000001;
    }
    
    // NATIONAL NO
    int[] nationalID = new int[size];
    baseNo = 800000500;
    for(int i = 0; i < nationalID.length; i ++) {
      nationalID[i] = rand.nextInt(500)+800000001;
    }
    
    
    // FNAME
//    is = new FileInputStream("fname.txt");
//    buf = new BufferedReader(new InputStreamReader(is));
//    String[] fName = new String[size];
//    line = buf.readLine();
//    for(int i = 0; i < fName.length; i++) {
//      fName[i] = line;
//      line = buf.readLine();
//    }
//    
//    //LNAME
//    is = new FileInputStream("sname.txt");
//    buf = new BufferedReader(new InputStreamReader(is));
//    String[] sName = new String[size];
//    line = buf.readLine();
//    for(int i = 0; i < sName.length; i++) {
//      sName[i] = line;
//      line = buf.readLine();
//    }
    
    //TITLE
//    String[] titles = new String[size];
//    int flag;
//    for(int i = 0; i < titles.length; i++) {
//      flag = rand.nextInt(2)+1;
//      if(flag == 1 ) { titles[i] = "Mr."; }
//      else { titles[i] = "Mrs.";}
//    }
    
    //GENDER
//    int[] gender = new int[size];
//    for(int i = 0; i < gender.length; i++) {
//      gender[i] = rand.nextInt(2)+1;
//    }
    
    
    // OCCUPATION
//    String occupation = "Employed";
//    String[] occupation = new String[size];
//    int flag;
//    for(int i = 0; i < occupation.length; i++) {
//      flag = rand.nextInt(2)+1;
//      if(flag == 1 ) { occupation[i] = "Employed"; }
//      else { occupation[i] = "Student";}
//    }
    
    
    // DOB
    String[] dob = new String[size];
    for(int i = 0; i < dob.length; i++) {
      int y = rand.nextInt(1)+2016;
      int m = rand.nextInt(12)+1;
      int d = rand.nextInt(28)+1;
      dob[i] = Integer.toString(y) + "-" + Integer.toString(m) + "-" + Integer.toString(d);
    }
    
    //MOBILE
//    String[] mobile = new String[size];
//    long mBaseNo = 26771000500L;
//    for(int i = 0; i < mobile.length; i++) {
//      mBaseNo+=1;
//      mobile[i] = "+" + Long.toString(mBaseNo);
//    }
    
    //TELEPHONE
//    String[] telephone = new String[size];
//    long tBaseNo = 2673100500L;
//    for(int i = 0; i < telephone.length; i++) {
//      tBaseNo+=1;
//      telephone[i] = "+" + Long.toString(tBaseNo);
//    }
    
    
    // POSTAL
//    String[] postal = new String[size];
//    baseNo = 500;
//    for (int i = 0; i < postal.length; i++) {
//      baseNo+=1;
//      postal[i] = "P O Box " + Integer.toString(baseNo) + ", Gaborone";
//    }
    
    
    // PHYSICAL
//    String[] physical = new String[size];
//    baseNo = 500;
//    for (int i = 0; i < physical.length; i++) {
//      baseNo+=1;
//      physical[i] = "Plot " + Integer.toString(baseNo) + ", Gaborone";
//    }
    
    
    //FAX
//    String[] fax = new String[size];
//    long fBaseNo = 2673200500L;
//    for(int i = 0; i < fax.length; i++) {
//      fBaseNo+=1;
//      fax[i] = "+" + Long.toString(fBaseNo);
//    }
    
    
    //EMAIL
//    String[] mail = new String[size];
//    for(int i = 0; i < mail.length; i++) {
//      mail[i] = fName[i] + "." + sName[i] + "@gmail.com";
//    }
    
    
    //NEXT OF KIN
//    is = new FileInputStream("noknames.txt");
//    buf = new BufferedReader(new InputStreamReader(is));
//    String[] nok = new String[size];
//    line = buf.readLine();
//    for(int i = 0; i < nok.length; i++) {
//      nok[i] = line;
//      line = buf.readLine();
//    }
    
    
    //NOK - MOBILE
//    String[] nokMobile = new String[size];
//    long nokMBaseNo = 26772000500L;
//    for(int i = 0; i < nokMobile.length; i++) {
//      nokMBaseNo+=1;
//      nokMobile[i] = "+" + Long.toString(nokMBaseNo);
//    }
    
    
    //EMPLOYER
//    int[] employer = new int[size];
//    for(int i = 0; i < employer.length; i++) {
//      employer[i] = rand.nextInt(10)+10001;
//    }
    
    
//    //PAYROL NO
//    String[] payrol = new String[size];
//    baseNo = 500;
//    for(int i = 0; i < payrol.length; i++) {
//      baseNo+=1;
//      payrol[i] = "XX-" + Integer.toString(baseNo);
//    }
    
    
    //PLAN
//    int[] plan = new int[size];
//    for(int i = 0; i < plan.length; i++) {
//      plan[i] = rand.nextInt(5)+1;
//    }
    
    
    // RELATIONSHIPS
//    int[] relationship = new int[size];
//    for(int i = 0; i < relationship.length; i++) {
//      relationship[i] = rand.nextInt(2)+1;
//    }
    
    
    
//    // MEDICATION NO
//    int[] medNo = new int[size];
//    baseNo = 0;
//    for(int i = 0; i < medNo.length; i ++) {
//      medNo[i] = rand.nextInt(312)+1;
//    }
//    
//    // MEDICATION NAME
//    is = new FileInputStream("medication.txt");
//    buf = new BufferedReader(new InputStreamReader(is));
//    String[] medication = new String[size];
//    line = buf.readLine();
//    for(int i = 0; i < medication.length; i++) {
//      medication[i] = line;
//      line = buf.readLine();
//    }
    
    
//    // PRESCRIPTIONS
//    int[] prescriptionID = new int[size];
//    baseNo = 760;
//    for(int i = 0; i < prescriptionID.length; i++) {
//      baseNo+=1;
//      prescriptionID[i] = baseNo;
//    }
//    
//    String description = "Some random description here. Must be descriptive I guess.";
//    
//    
//    // ILLNESS ID
//    int[] illnessID = new int[size];
//    for(int i = 0; i < illnessID.length; i++) {
//      illnessID[i] = rand.nextInt(31)+1;
//    }
//    
//    // QUANTITY
//    String[] quantity = new String[size];
//    for(int i = 0; i < quantity.length; i++) {
//      quantity[i] = Integer.toString(rand.nextInt(10)+1) + " pills daily";
//    }
    
    
    // VISIT ID
//    int[] visitID = new int[size];
//    baseNo = 0;
//    for(int i = 0; i < visitID.length; i ++) {
//      baseNo+=1;
//      visitID[i] = baseNo;
//    }
//    
//    
//    // TYPE OF VISIT
//    int[] tovID = new int[size];
//    for(int i = 0; i < tovID.length; i++) {
//      tovID[i] = rand.nextInt(7)+1;
//    }
//    
//    
//    // PROVIDER
//    int[] providerID = new int[size];
//    for(int i = 0; i < providerID.length; i++) {
//      providerID[i] = rand.nextInt(15)+10001;
//    }
    
    
    
    // ACCOUNT NUMBER
//    int[] accNo = new int[size];
//    baseNo = 100010000;
//    for(int i = 0; i < accNo.length; i ++) {
//      baseNo+=1;
//      accNo[i] = baseNo;
//    }
//    
//    // BANK ID
//    int[] bankID = new int[size];
//    for(int i = 0; i < bankID.length; i++) {
//      bankID[i] = rand.nextInt(35)+10001;
//    }
//    
//    String accountType = "Debit";
    
    
    // VITAL ID
//    int[] vitalID = new int[size];
//    baseNo = 0;
//    for(int i = 0; i < vitalID.length; i ++) {
//      baseNo+=1;
//      vitalID[i] = baseNo;
//    }
//    // STIScreening
//    String ss = "Syphillis - Negative, Gonohorrea - Negative, Hepatitis C - Negative, Herpes - Negative";
//    // AIDS Status
//    String as = "Negative";
    
    
    
    
    //
    
    
    
    // GENERATE PRINCIPAL MEMBERS
//    for(int i = 0; i < size; i++) {
//      System.out.println("('"+memberNos[i]+"',"
//                           +"'"+nationalID[i]+"',"
//                           +"'"+fName[i]+"',"
//                           +"'"+sName[i]+"',"
//                           +"'"+titles[i]+"',"
//                           +"'"+dob[i]+"',"
//                           +"'"+gender[i]+"',"
//                           +"'"+occupation+"',"
//                           +"'"+mobile[i]+"',"
//                           +"'"+telephone[i]+"',"
//                           +"'"+postal[i]+"',"
//                           +"'"+physical[i]+"',"
//                           +"'"+fax[i]+"',"
//                           +"'"+mail[i]+"',"
//                           +"'"+nok[i]+"',"
//                           +"'"+nokMobile[i]+"',"
//                           +"'"+employer[i]+"',"
//                           +"'"+payrol[i]+"',"
//                           +"'"+plan[i]+"'),");
//    }
    
    // GENERATE DEPENDANTS
//    for(int i = 0; i < size; i++) {
//      System.out.println("('"+nationalID[i]+"',"
//                           +"'"+memberNos[i]+"',"
//                           +"'"+relationship[i]+"',"
//                           +"'"+fName[i]+"',"
//                           +"'"+sName[i]+"',"
//                           +"'"+gender[i]+"',"
//                           +"'"+dob[i]+"',"
//                           +"'"+occupation[i]+"',"
//                           +"'"+mobile[i]+"',"
//                           +"'"+telephone[i]+"',"
//                           +"'"+postal[i]+"',"
//                           +"'"+physical[i]+"',"
//                           +"'"+mail[i]+"'),");
//    }
    
    
    // GENERATE MEDICATIONS
//        for(int i = 0; i < size; i++) {
//      System.out.println("('"+medNo[i]+"',"
//                           +"'"+medication[i]+"'),");
//    }
    
    
    // GENERATE PRESCRIPTIONS
//      for(int i = 0; i < size; i++) {
//      System.out.println("('"+prescriptionID[i]+"',"
//                           +"'"+memberNos[i]+"',"
//                           +"'"+nationalID[i]+"',"
//                           +"'"+fName[i]+"',"
//                           +"'"+sName[i]+"',"
//                           +"'"+description+"',"
//                           +"'"+illnessID[i]+"',"
//                           +"'"+medNo[i]+"',"
//                           +"'"+quantity[i]+"'),");
//    }
    
    
    
    // GENERATE VISITS
//    for(int i = 0; i < size; i++) {
//      System.out.println("('"+visitID[i]+"',"
//                           +"'"+nationalID[i]+"',"
//                           +"'"+providerID[i]+"',"
//                           +"'"+dob[i]+"',"
//                           +"'"+tovID[i]+"'),");
//    }
    
    
    // GENERATE ACCOUNTS
//        for(int i = 0; i < size; i++) {
//      System.out.println("('"+accNo[i]+"',"
//                           +"'"+memberNos[i]+"',"
//                           +"'"+bankID[i]+"',"
//                           +"'Debit Account'),");
//    }
    
//    for(int i = 0; i < size; i++) {
//      System.out.println("\n"+
//                         "UPDATE [dbo].[pula_med_principal_member]"+
//                         "\nSET"+ 
//                         "\n\t[AccountNumber] = " + accNo[i] +
//                         "\nWHERE\n\t[MemberNo] = " + memberNos[i] + ";");
//    }
    
    
    
    // GENERATE VITALS
//    for(int i = 0; i < size; i++) {
//      DecimalFormat decimalFormat = new DecimalFormat("#.##");
//      // BLOOD PRESSURE
//      float bp = Float.valueOf(decimalFormat.format(rand.nextFloat() * (120)));
//      // BLOOD SUGAR
//      float bs = Float.valueOf(decimalFormat.format(rand.nextFloat() * (120)));
//      // HEART RATE
//      float hr = Float.valueOf(decimalFormat.format(rand.nextFloat() * (170)));
//      // RESPIRATORY RATE
//      float rr = Float.valueOf(decimalFormat.format(rand.nextFloat() * (99)));
//      // BODY WEIGHT
//      float bw = Float.valueOf(decimalFormat.format(rand.nextFloat() * (350)));
//      
//      System.out.println("('"+vitalID[i]+"',"
//                           +"'"+memberNos[i]+"',"
//                           +"'"+nationalID[i]+"',"
//                           +"'"+bp+"',"
//                           +"'"+bs+"',"
//                           +"'"+hr+"',"
//                           +"'"+rr+"',"
//                           +"'"+bw+"',"
//                           +"'"+ss+"',"
//                           +"'"+as+"'),");
//    }
    
  }
  
  
}