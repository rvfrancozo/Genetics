package hardConstraints;

import java.util.ArrayList;

import dataLoader.TimetableModel;

public class HardCalculator {
	
	public int Score(TimetableModel tt, ArrayList<TimetableModel> timetable) {
		
		HardScore p1 = new AvoidRoomClashes();
		HardScore p2 = new AvoidLabChange();
		HardScore p3 = new AvoidTeacherClashes();
		HardScore p4 = new WorkDayBreak();
		HardScore terminator = new Terminator();
		
		p1.setNext(p2);
		p2.setNext(p3);
		p3.setNext(p4);
		p4.setNext(terminator);
		
		return p1.calcula(tt, timetable);
	}

}
