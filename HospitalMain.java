import java.util.*;
import requirement.Appointment;
import requirement.Bill;
import requirement.Prescription;
import requirement.DoctorRecord;
import requirement.HospitalRecord;
import requirement.PatientRecord;

abstract class Hospitals
{
    abstract makeAppointment();
    abstract chargeBill();
    public void getHealthRecord()
    {
        
    }

}
class HospitalMain
{
    public static void main(String args[])
    {
        int usertype,selecthosp,patientchoice,adminchoice,adminchoice2;
        System.out.println("-----------------------------------------");
        System.out.println("******WELCOME TO PRAGATI HOSPITALS*******");
        System.out.println("-----------------------------------------");
        
        do{
        System.out.println("\n\n ................");
        System.out.println(" Are you a ");
        System.out.println("1.Patient ");
        System.out.println("2.Admin ");
        System.out.println("3.Exit ");
        System.out.println(".....................");
        System.out.println("Enter choice: ");
        
        Scanner sc=new Scanner(System.in);
        usertype=sc.nextInt();
        switch(usertype)
        {
            case 1: 
            System.out.println("\n\n ................");
            System.out.println(" Choose your hospital"); //change to for loop and show h.name from objects of hospital class
            System.out.println("1.Hospital A ");
            System.out.println("2.Hospital B ");
            System.out.println("3.Hospital C ");
            System.out.println("4.Hospital D ");
            System.out.println(".....................");
            System.out.println("Enter choice: ");

            
            selecthosp=sc.nextInt();

                System.out.println("\n\n ................");
                System.out.println("How can we help you today?"); //change to for loop and show h.name from objects of hospital class
                System.out.println("1.Find a doctor");
                System.out.println("2.Specialities");
                System.out.println("3.Book an appointment");
                System.out.println("4.Patient Record");
                System.out.println("5.Exit");
                System.out.println(".....................");
                System.out.println("Enter choice: ");

                patientchoice=sc.nextInt();

                do{
                    if(patientchoice==1)
                    {
                        displayDoctor();
                    }
                    else if(patientchoice==2)
                    {
                        //display specialities
                    }
                    else if(patientchoice==3)
                    {
                        bookAppointment();
                    }
                    else if(patientchoice==4)
                    {
                        getPatientRecord();
                    }
                }while(patientchoice!=5);
                
            case 2:
            do{
                System.out.println("\n\n ................");
                //change to for loop and show h.name from objects of hospital class
                System.out.println("1.List of hospitals");
                System.out.println("2.Add hospital ");
                System.out.println("3.Delete hospital ");
                System.out.println("4.Exit");
                System.out.println(".....................");
                System.out.println("Enter choice: ");

                adminchoice=sc.nextInt();
                switch(adminchoice)
                {
                    case 1: 
                    displayHospital();//display list of hospitals and store the selection and display records accordingly
                    System.out.println("\n\n ................");
                    System.out.println("1.Show Patient Records");
                    System.out.println("2.Show doctor records "); //including salary
                    System.out.println("3.Add doctor ");//similar to employee according to speciality
                    System.out.println("4.Remove doctor ");
                    System.out.println("5.Exit");
                    System.out.println(".....................");
                    System.out.println("Enter choice: ");

                    adminchoice2=sc.nextInt();

                    do{
                        switch(adminchoice2)
                        {
                            case 1: getPatientRecord(); break;
                            case 2: displayDoctor(); break;
                            case 3: insertNewDoctor(); break;
                            case 4: removeDoctor(); break;

                        }
                    }while(adminchoice2!=5);

                }
            }while(adminchoice!=4);
           
            
        }
        }while(usertype!=3);
        
    }
}