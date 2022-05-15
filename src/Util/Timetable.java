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
import hardConstraints.HardCalculator;

public class Timetable {
	
	private ArrayList<DataModel> data = new DataControl().loader("data.csv");
	private ArrayList<TimeModel> times = new TimeControl().Times();
	private ArrayList<WeekDayModel> days = new WeekDayControl().WeekDays();
	private ArrayList<ClassroomModel> classrooms = new ClassroomControl().Classroom();
	private int[] timetable = new TimetableGenerator().Generator(data, times, days, classrooms);
	
	public Timetable() {
		
		int score = new HardCalculator().Score(timetable); 
		
		do {
			data = new DataControl().loader("data.csv");
			timetable = new TimetableGenerator().Generator(data, times, days, classrooms);
			if(score > new HardCalculator().Score(timetable)) 
				score = new HardCalculator().Score(timetable);
		} while(score > 0);
		data = new DataControl().loader("data.csv");
		new showTimetable(timetable, data);
		
//		do {
//			data = new DataControl().loader("data.csv");
//			timetable = new TimetableGenerator().Generator(data, times, days, classrooms);
//			System.out.println("Score: " + new HardCalculator().Score(timetable));
//		} while(true);
		
		
	}
}
