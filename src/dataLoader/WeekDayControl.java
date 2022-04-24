package dataLoader;

import java.util.ArrayList;

public class WeekDayControl {
	
	public ArrayList<WeekDayModel> WeekDays() {
		
		ArrayList<WeekDayModel> weekday = new ArrayList<WeekDayModel>();
		
		weekday.add(new WeekDayModel(1,"Segunda","Monday","Lunes"));
		weekday.add(new WeekDayModel(2,"Terça","Tuesday","Martes"));
		weekday.add(new WeekDayModel(3,"Quarta","Wednesday","Miercoles"));
		weekday.add(new WeekDayModel(4,"Quinta","Thursday","Jueves"));
		weekday.add(new WeekDayModel(5,"Sexta","Friday","Viernes"));
		
		return weekday;
		
	}

}
