import java.util.Scanner;

public class Project_Peter_Nguyen
{
   public static void main(String[] args)
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
      
      
      //Input
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
      
      Policy one = new Policy (pNum,providerName,phFirstName,phLastName,phAge,phSmokingStatus,phHeight,phWeight);
      
      menu(one);
   }
   
   public static void menu(Policy p)
   {
      System.out.println("Policy Number: " + p.getPNum());
      System.out.println("Provider Name: " + p.getProviderName());
      System.out.println("Policyholder's First Name: " + p.getPHFirstName());
      System.out.println("Policyholder's Last Name: " + p.getPHLastName());
      System.out.println("Policyholder's Age: " + p.getPHAge());
      System.out.println("Policyholder's Smoking Status: " + p.getPHSmokingStatus());
      System.out.println("Policyholder's Height: " + p.getPHHeight());
      System.out.println("Policyholder's Weight: " + p.getPHWeight());
      System.out.println("Policyholder's BMI: " + p.getBMI());
      System.out.println("Policy Price: " + p.getInsurancePrice());
   }
}