package requirement;

import java.util.Scanner;

public class DoctorRecord {
    int docid;
    String doctorname;
    int doctorage;
    String phonenumber;
    String speciality;
    int salary;
    int fee;
    
 public DoctorRecord() 
 {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter id:");
    docid=input.nextInt();
    System.out.println("Enter name:");
    doctorname=input.nextLine();
    System.out.println("Enter age:");
    doctorage=input.nextInt();
    System.out.println("Enter phone number:");
    phonenumber=input.nextLine();
    System.out.println("Enter speciality:");
    speciality=input.nextLine();
    System.out.println("Enter fee:");
    fee=input.nextInt();
    System.out.println("Enter salary:");
    salary=input.nextInt();
 }
 public void displayDoctorAdmin()
 {
  System.out.println("Doctor id:"+docid);
  System.out.println("Doctor name:"+doctorname);
  System.out.println("Doctor age:"+doctorage);
  System.out.println("Doctor phonenumber:"+phonenumber);
  System.out.println("Speciality:"+speciality);
  System.out.println("Fee:"+fee);
  System.out.println("Salary:"+salary);
 }
 public void displayDoctorPatient()
 {
  System.out.println("Doctor id:"+docid);
  System.out.println("Doctor name:"+doctorname);
  System.out.println("Speciality:"+speciality);
  System.out.println("Fee:"+fee);
 }

 public static void main(String[] args)
{
 System.out.println("Welcome to Doctor Records.");
}
}