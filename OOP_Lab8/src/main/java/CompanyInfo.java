
public class CompanyInfo {
    private static CompanyInfo instance;
    
    private String companyName;
    private String address;
    private String phoneNumber;
    private String email;
    private String owner;
    
    //private consturctor to prevent instantiation from outside
    private CompanyInfo(){
        //Initialize company infomation
        this.companyName ="Mycompany";
        this.address = "123 Main street, City, Country";
        this.phoneNumber = "123-456-7890";
        this.email = "info@eiu.edu.com";
        this.owner = "";
    }
    
    //Public static method to get the single instance of the class
    public static synchronized CompanyInfo getInstance(){
        if(instance == null){
           instance = new CompanyInfo();
        }
        return instance;
    }
    // Getters and setters for company information
    public String getcompanyName(){
        return companyName; 
    }
    
    public void setCompanyName(String companyName){
        this.companyName = companyName;
    } 
    
    public void  setAddress(String address){
        this.address = address;
    }
    
    public String getPhoneNumber(){
        return phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public void setOwner(String owner){
        this.owner = owner;
    }
    
    //method to display company information
    public void displayInfo(){
        System.out.println("Company Name: " + companyName);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email: " + email);
        System.out.println("Owner: " + owner);
    }
}
