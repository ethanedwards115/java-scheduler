import java.util.ArrayList;

public class Diary 
{
    private ArrayList<Appointment> appointments;
    
    public ArrayList<Appointment> getAppointments() 
    {
        return appointments;
    }
  
    public void setAppointments(ArrayList<appointment> appointments) 
    {
        this.appointments = appointments;
    }

    public void  display(ArrayList<HealthProfessional> hp, String startDate, String endDate ) 
    {
       for (Appointment appointment : appointments) {
            
        }
    }
    
    public ArrayList<Appointment> search() 
    {
        return null;
        
    }
    public Diary clone() {

        Diary diaryClone = new Diary();
	    ArrayList<Appointment> listCopy = new ArrayList<appointments>();

            for (Appointment app : appointments) {
			Appointment appCopy;
                        appCopy = app.clone();
			listCopy.add(appCopy);
                        
    }
    
        diaryClone.setAppointments(listCopy);
	return diaryClone;
		

}
}
