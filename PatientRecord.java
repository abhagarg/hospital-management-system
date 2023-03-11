package requirement;

import java.util.*;
public class PatientRecord 
{
  int patientid;
  String patientname;
  int patientage;
  String phonenumber;
  String gender;
  String address;
  String ailment;
  
  public PatientRecord() 
  {
     Scanner input=new Scanner(System.in);
     System.out.println("Enter id:");
     patientid=input.nextInt();
     System.out.println("Enter name:");
     patientname=input.nextLine();
     System.out.println("Enter age:");
     patientage=input.nextInt();
     System.out.println("Enter phone number:");
     phonenumber=input.nextLine();
     System.out.println("Enter gender:");
     gender=input.nextLine();
     System.out.println("Enter address:");
     address=input.nextLine();
  }
 
 public void getPatientRecord()
 {
  System.out.println("Patient id:"+patientid);
  System.out.println("Patient name:"+patientname);
  System.out.println("Patient age:"+patientage);
  System.out.println("Patient phonenumber:"+phonenumber);
  System.out.println("Patient gender:"+gender);
  System.out.println("Patient address:"+address);
 }

 public static void main(String[] args)
{
 System.out.println("Welcome to Patient Records.");
}
}