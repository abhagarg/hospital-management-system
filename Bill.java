package requirement;
final public class Bill extends HospitalMain
{
 int billno;
 int patid;
 String billdate;
 int apptno;
 int amount;

 public void fetchBill()
 {
  System.out.println("Bill number:"+billno);
  System.out.println("Patient id:"+patid);
  System.out.println("Bill date:"+billdate);
  System.out.println("Appointment number:"+apptno);
  System.out.println("Amount:"+amount);
  
 }

 public static void main(String[] args)
{
 System.out.println("Welcome to Doctor Records.");
}
}