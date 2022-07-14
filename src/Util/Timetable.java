package Util;
import java.util.ArrayList;

import Population.TimetableGenerator;
import dataLoader.ClassroomControl;
import dataLoader.ClassroomModel;
import dataLoader.DataControl;
import dataLoader.DataModel;
import dataLoader.TimeControl;
import dataLoader.TimeModel;
import dataLoader.TimetableModel;
import dataLoader.WeekDayControl;
import dataLoader.WeekDayModel;
import hardConstraints.HardCalculator;

public class Timetable {
	
	private ArrayList<DataModel> data = new DataControl().loader("data.csv");
	private ArrayList<TimeModel> times = new TimeControl().Times();
	private ArrayList<WeekDayModel> days = new WeekDayControl().WeekDays();
	private ArrayList<ClassroomModel> classrooms = new ClassroomControl().Classroom();
	private ArrayList<TimetableModel> timetable = new TimetableGenerator().Generator(data, times, days, classrooms);
	
	
	public Timetable() {
	//	long start = System.currentTimeMillis();
		
		
		
		
		
		
		//int score = new HardCalculator().Score(timetable); 
		/*
		do {
			data = new DataControl().loader("data.csv");
			timetable = new TimetableGenerator().Generator(data, times, days, classrooms);
			if(score > new HardCalculator().Score(timetable)) {
				score = new HardCalculator().Score(timetable);
				//System.out.println("Score: " + score); //descomente essa para testar
			}
				
		} while(score > 0);
		data = new DataControl().loader("data.csv");
		new showTimetable(timetable, data); //comente essa para testar
		*/
//		do {
//			data = new DataControl().loader("data.csv");
//			timetable = new TimetableGenerator().Generator(data, times, days, classrooms);
//			if(score > new HardCalculator().Score(timetable)) {
//				score = new HardCalculator().Score(timetable);
//				long elapsed = System.currentTimeMillis();
//				
//				System.out.println("Score: " + score + " in " + (elapsed - start)/1000 + " seconds"); //descomente essa para testar
//				
//			}
//			//System.out.println("Score: " + new HardCalculator().Score(timetable));
//		} while(score > 0);
//		new showTimetable(timetable, data); //comente essa para testar
		
	}
}
