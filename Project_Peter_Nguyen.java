import java.util.Scanner;
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
   }
   
   public static void menu() throws IOException 
   {
      int smoker = 0;
      int nonSmoker = 0;
      
      File inputFile = new File("PolicyInformation.txt");   
      Scanner scanFile = new Scanner(inputFile);
      
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
         double BMI = scanFile.nextDouble();
         double insurancePrice = scanFile.nextDouble();
         
         System.out.println("Policy Number: " + pNum);
         System.out.println("Provider Name: " + providerName);
         System.out.println("Policyholder's First Name: " + phFirstName);
         System.out.println("Policyholder's Last Name: " + phLastName);
         System.out.println("Policyholder's Age: " + phAge);
         System.out.println("Policyholder's Smoking Status: " + phSmokingStatus);
         System.out.printf("Policyholder's Height: %.1f inches\n", phHeight);
         System.out.printf("Policyholder's Weight: %.1f pounds\n", phWeight);
         System.out.printf("Policyholder's BMI: %.2f\n", BMI);
         System.out.printf("Policy Price: $%.2f\n\n", insurancePrice);
         
         if(phSmokingStatus.equals("smoker")) 
         {
            smoker += 1;
         }
         else
         {
            nonSmoker+= 1;
         }
         
      }
      
      System.out.println("The number of policies with a smoker is: " + smoker);
      System.out.println("The number of policies with a non-smoker is: " + nonSmoker);
      
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