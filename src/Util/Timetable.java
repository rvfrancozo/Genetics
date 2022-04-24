package Util;
import java.util.ArrayList;

import Population.TimetableGenerator;
import dataLoader.ClassroomControl;
import dataLoader.ClassroomModel;
import dataLoader.DataControl;
import dataLoader.DataModel;
import dataLoader.TimeControl;
import dataLoader.TimeModel;
import dataLoader.WeekDayControl;
import dataLoader.WeekDayModel;

public class Timetable {
	
	private ArrayList<DataModel> data = new DataControl().loader("data.csv");
	private ArrayList<TimeModel> times = new TimeControl().Times();
	private ArrayList<WeekDayModel> days = new WeekDayControl().WeekDays();
	private ArrayList<ClassroomModel> classrooms = new ClassroomControl().Classroom();
	
	private int[] timetable = new TimetableGenerator().Generator(data, times, days, classrooms);
	
	public Timetable() {
		
		data = new DataControl().loader("data.csv");
	
		new showTimetable(timetable, data);
	}

}
