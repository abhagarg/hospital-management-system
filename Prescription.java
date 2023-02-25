package requirement;
final public class Prescription extends HospitalMain
{
    int prescriptno;
    int patid;
    int docid;
    String med_name;
    int doses;
    int quantity;
    

 public void fetchPrescription()
 {
  System.out.println("Prescription number:"+prescriptno);
  System.out.println("Patient id:"+patid);
  System.out.println("Doctor id:"+docid);
  System.out.println("Medicine name:"+med_name);
  System.out.println("Dosage:"+doses);
  System.out.println("Quantity:"+quantity);
 }

 public static void main(String[] args)
{
 System.out.println("Welcome to Doctor Records.");
}
}