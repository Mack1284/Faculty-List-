


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class FacultyList {

    
    public static void main(String[] args) throws FileNotFoundException {//begin main class
       
        ArrayList<Faculty> FacList = new ArrayList<Faculty>();  //array list that holds the elements in faculty 
        
        System.out.println("FACULTY REPORT");
        System.out.println("");
        generateFacultyList(FacList); //calls the generateFacultylist method 
        getnNumberofObjects(FacList);  //calles the number of objects method 
        
        for(int nIndex = 0; nIndex < FacList.size (); nIndex++){//loop to print the faculty information 
        
            printFacultyList(FacList.get(nIndex));//calls method to print the faculty information 
        
        }//end for loop 
       
    }//end main method 
     
    
    public static void generateFacultyList(ArrayList<Faculty> list) throws FileNotFoundException{//start of method generateFacultyList 
        
   
    String sFileName = "Faculty.txt";//name of the file 
    String sInputLine="";//holds information from the file 
    File fileToOpen = new File(sFileName); //opens the file 
    
    Scanner inputFile = new Scanner(fileToOpen);  //scanner that reads the file 
    String[] saTokens = null; //array that holds the information 
    
    ArrayList<Faculty> FacList = new ArrayList<Faculty>(); //specific array thats filled from the saTokens array 
    
    while (inputFile.hasNext()) {//begining of while loop 
        
      sInputLine = inputFile.nextLine();    //
      saTokens = sInputLine.split(":");//removes ":" from text 
    
    
      Faculty Fac = new Faculty(); //calls class Faculty 
      
      Fac.setId(saTokens[0]);//sets Id
      Fac.setFirstName(saTokens[1]);//sets First Name
      Fac.setLastName(saTokens[2]);//sets Last Name
      Fac.setHireDate(saTokens[3]);//Sets Hire Date 
      Fac.setTitle(saTokens[4]);//sets Title
      Fac.setDepartmentId(saTokens[5]);//sets Department Id 
      Fac.setStreet(saTokens[6]);//sets street
      Fac.setCity(saTokens[7]);//sets city
      Fac.setState(saTokens[8]);//sets State
      Fac.setZipCode(Integer.parseInt(saTokens[9]));//turns zip code into a string and sets it 
      Fac.setPhone(saTokens[10]);//sets the phone number 
      Fac.setEmail(saTokens[11]);//sets the email adress
      Fac.setDepartmentId(saTokens[12]);//sets the department Id 
      list.add(Fac); //adds all the information to the list Fac 
      
    }
    
   
    inputFile.close();//closes the file 
       
    
    }//end method 
    
    
    public static void printFacultyList(Faculty Facu){//begining of printFacultu list method 
        
       
       
        
        
        
        System.out.println("Faculty ID: " + Facu.getId());//Prints Faculty id 
        System.out.println("Name: "+Facu.getFirstName().toUpperCase()+" "+Facu.getLastName().toUpperCase());//prints and capitalizes first and last name 
        System.out.println("Hire Date: "+ Facu.getHireDate());//prints the hire date 
        System.out.println("Phone: " +"("+Facu.getPhone().substring(0, 3)+")"+Facu.getPhone().substring(3, 6)+"-"+Facu.getPhone().substring(6, 10));//separates the phone number into substrings and prints it out 
        System.out.println("Email: "+Facu.getEmail());//prints the email adress
        System.out.println("Adress: "+Facu.getStreet()+", " +Facu.getCity()+", "+Facu.getState().trim()+", "+Facu.getZipCode());
        System.out.println("Department name: "+Facu.getDepartmentId().replace("2000", "Music").replace("2006", "Counselor Education").replace("2011", "Teaching and Learning").replace("2012", "Accounting").replace("2014","Finance").replace("2016", "Information Technology and Operation Management").replace("2019","Architecture").replace("2020", "Crimonology & Criminal Justice").replace("2024", "Civil, Environmental & Geomatic Engineering").replace("2025", "Computer & Electrical Engeneering and Computer Science").replace("2028", "Medicine").replace("2030", "Chemistry & Biochemistry"));//replaces the department numbers with the departments name 
        System.out.println("");
    
    
    
    
    
    
    }//end of printFacultyList method 
    public static void getnNumberofObjects(ArrayList<Faculty> list){//begining of getnNumberofObjects method 
    
         System.out.println("Number of Instructors: "+Faculty.getnNumberOfObjects());//counts the number of objects in the file 
         System.out.println("");
}//end of getNumberofObjcts method 
   
    
    
    
}//end main class
