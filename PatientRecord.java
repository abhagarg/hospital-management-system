package requirement;
public class PatientRecord 
{
  int patientid;
  String patientname;
  int patientage;
  String phonenumber;
  String gender;
  String address;
  String ailment;
  
 public void addPatient()
 {
 }
 
 public void removePatient()
 {
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