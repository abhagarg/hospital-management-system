package requirement;

public class Appointment extends HospitalMain
{
    int appointmentno;
    int apptime;
    String appdate;
    int doctorid;
    String doctorname;

    public void bookAppointment()
    {
        System.out.println("Choose your doctor:");
        displayDoctor();
        // .
        // .
        // .
        // .
        // .
        // .
    }
    public void fetchAppointment()
 {
  System.out.println("Appointment number:"+appointmentno);
  System.out.println("Appointment time:"+apptime);
  System.out.println("appointmnet date:"+appdate);
  System.out.println("Doctor id:"+doctorid);
  System.out.println("Doctor name:"+doctorname);

 }
    public static void main(String[] args)
    {

    }
}