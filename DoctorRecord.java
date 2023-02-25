package requirement;

import java.util.Scanner;

public class DoctorRecord extends HospitalMain
{
    int docid;
    String doctorname;
    int doctorage;
    String phonenumber;
    String speciality;
    int salary;
    
 public insertNewDoctor() 
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
    System.out.println("Enter salary:");
    salary=input.nextInt();
 }
 public void displayDoctor()
 {
  System.out.println("Doctor id:"+docid);
  System.out.println("Doctor name:"+doctorname);
  System.out.println("Doctor age:"+doctorage);
  System.out.println("Doctor phonenumber:"+phonenumber);
  System.out.println("Speciality:"+speciality);
  System.out.println("Salary:"+salary);
 }

 public static void main(String[] args)
{
 System.out.println("Welcome to Doctor Records.");
}
}