import java.util.Scanner;

public class Project_Peter_Nguyen
{
   public static void main(String[] args)
   {
      Policy currentPolicy = newPolicy();
      
      menu(currentPolicy);
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
   
}