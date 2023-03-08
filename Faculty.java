
public class Faculty {

    public static int getnNumberOfObjects() {
        return nNumberOfObjects;
    }

    public static void setnNumberOfObjects(int anNumberOfObjects) {
        nNumberOfObjects = anNumberOfObjects;
    }
    
    private String sId = "";
    private String sFirstName = "";
    private String sLastName = "";
    private String hireDate = "";
    private String sTitle = "";
    private double dSalary = 0.0;
    private String sStreet = "";
    private String sCity = "";
    private String sState = "";
    private int nZipCode = 0;
    private String sPhone;
    private String sEmail = "";
    private String sDepartmentId = "";
    private static int nNumberOfObjects; 
    
    //default constructor
    public Faculty() {
        nNumberOfObjects++;
    }
    
    //overloaded constructor
    public Faculty (String sId, String sFirstName, String sLastName, String sHireDate, 
            String sTitle, double dSalary, String sStreet, String sCity, 
            String sState, int nZipCode, String sPhone, String sEmail, String nDepartmentId){
        this.sId = sId;
        this.sFirstName = sFirstName;
        this.sLastName = sLastName;
        this.hireDate = sHireDate;
        this.sTitle = sTitle;
        this.dSalary = dSalary;
        this.sStreet = sStreet;
        this.sCity = sCity;
        this.sState = sState;
        this.nZipCode = nZipCode;
        this.sPhone = sPhone;
        this.sEmail = sEmail;
        this.sDepartmentId = nDepartmentId;
        nNumberOfObjects++;
    }
    
    
    public String getId() {
        return sId;
    }

    public void setId(String sId) {
        this.sId = sId;
    }

    public String getFirstName() {
        return sFirstName;
    }

    public void setFirstName(String sFirstName) {
        this.sFirstName = sFirstName;
    }

    public String getLastName() {
        return sLastName;
    }

    public void setLastName(String sLastName) {
        this.sLastName = sLastName;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public String getTitle() {
        return sTitle;
    }

    public void setTitle(String sTitle) {
        this.sTitle = sTitle;
    }

    public double getSalary() {
        return dSalary;
    }

    public void setSalary(double dSalary) {
        this.dSalary = dSalary;
    }

    public String getStreet() {
        return sStreet;
    }

    public void setStreet(String sStreet) {
        this.sStreet = sStreet;
    }

    public String getCity() {
        return sCity;
    }

    public void setCity(String sCity) {
        this.sCity = sCity;
    }

    public String getState() {
        return sState;
    }

    public void setState(String sState) {
        this.sState = sState;
    }

    public int getZipCode() {
        return nZipCode;
    }

    public void setZipCode(int nZipCode) {
        this.nZipCode = nZipCode;
    }

    public String getPhone() {
        return sPhone;
    }

    public void setPhone(String sPhone) {
        this.sPhone = sPhone;
    }

    public String getEmail() {
        return sEmail;
    }

    public void setEmail(String sEmail) {
        this.sEmail = sEmail;
    }

    public String getDepartmentId() {
        return sDepartmentId;
    }

    public void setDepartmentId(String nDepartmentId) {
        this.sDepartmentId = nDepartmentId;
    }
    
    
   
}
