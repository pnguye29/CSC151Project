import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class Project_Peter_Nguyen
{
   public static void main(String[] args) throws IOException
   {
      menu();
   }
   
   public static void menu(Policy p)
   {
      System.out.println("Policy Number: " + p.getPNum());
      System.out.println("Provider Name: " + p.getProviderName());
      System.out.println("Policyholder's First Name: " + p.getPHFirstName());
      System.out.println("Policyholder's Last Name: " + p.getPHLastName());
      System.out.println("Policyholder's Age: " + p.getPHAge());
      System.out.println("Policyholder's Smoking Status: " + p.getPHSmokingStatus());
      System.out.printf("Policyholder's Height: %.1f inches\n", p.getPHHeight());
      System.out.printf("Policyholder's Weight: %.1f pounds\n", p.getPHWeight());
      System.out.printf("Policyholder's BMI: %.2f\n", p.getBMI());
      System.out.printf("Policy Price: $%.2f", p.getInsurancePrice());
      System.out.print(p);
   }
   
   public static void menu() throws IOException 
   {
      
      File inputFile = new File("PolicyInformation.txt");   
      Scanner scanFile = new Scanner(inputFile);
      ArrayList<Policy> policyList = new ArrayList<Policy>();
      
      while (scanFile.hasNext())
      {
         int pNum = scanFile.nextInt();
         scanFile.nextLine();
         String providerName = scanFile.nextLine();
         String phFirstName = scanFile.nextLine(); 
         String phLastName = scanFile.nextLine(); 
         int phAge = scanFile.nextInt();
         scanFile.nextLine(); 
         String phSmokingStatus = scanFile.nextLine();   
         double phHeight = scanFile.nextDouble();
         double phWeight = scanFile.nextDouble();
         
         
         policyList.add(new Policy(pNum, providerName, phFirstName, phLastName, phAge, phSmokingStatus, phHeight, phWeight));
      }
      
      for(Policy policy : policyList)
      { 
         //display information about the Policy
         System.out.println("Policy Number: " + policy.getPNum());
         System.out.println("Provider Name: " + policy.getProviderName());
         System.out.println("Policyholder's First Name: " + policy.getPHFirstName());
         System.out.println("Policyholder's Last Name: " + policy.getPHLastName());
         System.out.println("Policyholder's Age: " + policy.getPHAge());
         System.out.println("Policyholder's Smoking Status: " + policy.getPHSmokingStatus());
         System.out.println("Policyholder's Height: " + policy.getPHHeight() + " inches");
         System.out.println("Policyholder's Weight: " + policy.getPHWeight() + " pounds");
         System.out.printf("Policyholder's BMI: %.2f\n", policy.getBMI());
         System.out.printf("Policy Price: $%.2f\n", policy.getInsurancePrice());
         System.out.println();
      }
      //Display the smoker, non-smoker and the total Policy
      System.out.println(policyList.get(1));
      
      scanFile.close();
   }
   
   public static Policy newPolicy()
   {
      Scanner key = new Scanner (System.in);
      
      int pNum = 0; 
      String providerName = " ";
      String phFirstName = " "; 
      String phLastName = " "; 
      int phAge = 0; 
      String phSmokingStatus = " ";   
      double phHeight = 0.0;
      double phWeight = 0.0;
      
      
      System.out.print("Please enter the Policy Number: ");
      pNum = key.nextInt();
      System.out.print("Please enter the Provider Name: "); 
      key.nextLine();
      providerName = key.nextLine();   
      System.out.print("Please enter the Policyholder's First Name: "); 
      phFirstName = key.nextLine();      
      System.out.print("Please enter the Policyholder's Last Name: ");
      phLastName = key.nextLine();   
      System.out.print("Please enter the Policyholder's Age: ");
      phAge = key.nextInt();
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      key.nextLine();
      phSmokingStatus = key.nextLine();  
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      phHeight = key.nextDouble();
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      phWeight= key.nextDouble();
      
      Policy newP = new Policy (pNum,providerName,phFirstName,phLastName,phAge,phSmokingStatus,phHeight,phWeight);
      
      return newP;
   }

   public static void newPolicyAddToFile(Policy currentP) throws IOException
   {
   
      FileWriter fwriter = new FileWriter("PolicyData.txt", true);
      PrintWriter inputFile = new PrintWriter(fwriter);
      
      inputFile.println(currentP.getPNum());
      inputFile.println(currentP.getProviderName());   
      inputFile.println(currentP.getPHFirstName());      
      inputFile.println(currentP.getPHLastName());   
      inputFile.println(currentP.getPHAge());
      inputFile.println(currentP.getPHSmokingStatus());  
      inputFile.println(currentP.getPHHeight());
      inputFile.println(currentP.getPHWeight());
      inputFile.println(currentP.getBMI());
      inputFile.println(currentP.getInsurancePrice());
      
      inputFile.close();
   }
   
}