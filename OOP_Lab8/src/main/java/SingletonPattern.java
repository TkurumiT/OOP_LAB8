
public class SingletonPattern {
    public static void main(String[]args){
        //get the instance of CompanyInfo
        CompanyInfo companyInfo = CompanyInfo.getInstance();
        
        //Display the company infomation
        companyInfo.displayInfo();
        
        //Update company infomation
        companyInfo.setCompanyName("EIU-Đại học Quốc tế Miền Đông");
        companyInfo.setAddress("3M38 + 6F3, Nam Kỳ Khởi Nghĩa, Định Hòa, Thủ Dầu Một, Bình Dương ");
        companyInfo.setPhoneNumber("(+84) 0274 222 0327");
        
        //Display the update company infomation
        companyInfo.displayInfo();
    }
}
