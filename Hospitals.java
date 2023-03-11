package requirement;

import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class Hospitals 
{
    String name;
    String address;
    String city;
    float pincode;
    String state;

    ArrayList<DoctorRecord> docArr=new ArrayList<DoctorRecord>();
    ArrayList<PatientRecord> patArr=new ArrayList<PatientRecord>();

     public Hospitals()
    {
        Scanner sc=new Scanner(System.in);
  
        System.out.println("Enter name of the hospital: ");
        name=sc.nextLine();
        System.out.println("Enter address of the hospital: ");
        address=sc.nextLine(); 
        System.out.println("Enter city of the hospital: ");
        city=sc.nextLine(); 
        System.out.println("Enter pincode of the hospital: ");
        pincode=sc.nextFloat(); 
        System.out.println("Enter state of the hospital: ");
        state=sc.nextLine(); 
  
    }

    
    public void displayHospital()
    {
        System.out.println("Hospital name:"+name);
        System.out.println("Address:"+address);
        System.out.println("city:"+city);
        System.out.println("state:"+state);
        System.out.println("pincode"+pincode);
 
    }
    public void displayDoctor(boolean isPatient)
    {
        if(isPatient) 
             displayDoctorPatient();
        else
            displayDoctorAdmin();
    }


    public void getPatientRecord(){

    }
    public void bookAppointment(int patientid)
    {
        int choice;
        displayDoctorPatient();

        System.out.println(".....................");
        System.out.println("Enter choice: ");
        choice=sc.nextInt();

        int idDoc=docArr.get(choice).docid;
        String nameDoc=docArr.get(choice).doctorname;
        int apptfee=docArr.get(choice).fee;

        System.out.println("\n...................");
        System.out.println("\n ***Appointment Booked Successfully!***");
        System.out.println("\nAmount to be paid: "+apptfee);


    }
}