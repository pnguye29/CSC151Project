public class Policy
{
   private int pNum; //Policy Number
   private String providerName; //Provider Name
   private String phFirstName; //Policyholder’s First Name
   private String phLastName; //Policyholder’s Last Name
   private int phAge; //Policyholder’s Age
   private String phSmokingStatus; //Policyholder’s Smoking Status (will be “smoker” or “non-smoker”)
   private double phHeight; //Policyholder’s Height (in inches)
   private double phWeight; //Policyholder’s Weight (in pounds)
  
  //no-args constructor
   public Policy()
   {
      pNum = 0; 
      providerName = " ";
      phFirstName = " "; 
      phLastName = " "; 
      phAge = 0; 
      phSmokingStatus = "non-smoker";   
      phHeight = 0.0;
      phWeight = 0.0;
   }
  // args constructor
   public Policy(int pNum, String providerName, String phFirstName, String phLastName, int phAge, String phSmokingStatus,double phHeight, double phWeight)
   {
      this.pNum = pNum; 
      this.providerName = providerName;
      this.phFirstName = phFirstName; 
      this.phLastName = phLastName; 
      this.phAge = phAge; 
      this.phSmokingStatus = phSmokingStatus;   
      this.phHeight = phHeight;
      this.phWeight = phWeight;
   }
  
  //getter for Policy Number
   public int getPNum()
   {
      return pNum;
   }
  //setter for Policy Number
   public void setPNum(int pNum)
   {
      this.pNum = pNum;
   }
  
  //getter for Provider Name
   public String getProviderName()
   {
      return providerName;
   }
  //setter for Provider Name
   public void setProviderName(String providerName)
   {
      this.providerName = providerName;
   }
  
  //getter for Policyholder’s First Name
   public String getPHFirstName()
   {
      return phFirstName;
   }
  //setter for Policyholder’s First Name
   public void setPHFirstName(String phFirstName)
   {
      this.phFirstName = phFirstName;
   }
   
   //getter for Policyholder’s Last Name
   public String getPHLastName()
   {
      return phLastName;
   }
   
   //setter for Policyholder’s Last Name
   public void setPHLastName(String phLastName)
   {
      this.phLastName = phLastName;
   }
   
   //getter for Policyholder’s Age
   public int getPHAge()
   {
      return phAge;
   }
   
   //setter for Policyholder’s Age
   public void setPHAge(int phAge)
   {
      this.phAge = phAge;
   }
   //getter for Policyholder’s Smoking Status (will be “smoker” or “non-smoker”)
   public String getPHSmokingStatus()
   {
      return phSmokingStatus;
   }
  //setter for Policyholder’s Smoking Status (will be “smoker” or “non-smoker”)
   public void setPHSmokingStatus(String phSmokingStatus)
   {
      this.phSmokingStatus = phSmokingStatus;
   }
  
  //getter for Policyholder’s Height (in inches)
   public double getPHHeight()
   {
      return phHeight;
   }
  //setter for Policyholder’s Height (in inches)
   public void setPHHeight(double phHeight)
   {
      this.phHeight = phHeight;
   }
   
   //getter for Policyholder’s Weight (in pounds)
   public double getPHWeight()
   {
      return phWeight;
   }
  //setter for Policyholder’s Weight (in pounds)
   public void setPHWeight(double phWeight)
   {
      this.phWeight = phWeight;
   }
   
   //getter for returns the BMI of the policyholder)
   public double getBMI()
   {
      return (phWeight * 703 ) / (Math.pow(phHeight, 2));
   }
   
   public double getInsurancePrice()
   {
      double baseFee = 600.00;
      
      if(phAge > 50) 
      {
         baseFee =+ 75;
      }
      
      if(phSmokingStatus.equals("smoker")) 
      {
         baseFee =+ 75;
      }
      
      if(getBMI() > 35) 
      {
         baseFee =+ (getBMI() - 35) * 20;
      }
      
      return baseFee;
   }   
}