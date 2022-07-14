package softConstraints;

import java.util.ArrayList;
import dataLoader.TimetableModel;

public class SoftCalculator {
	
	public int Score(TimetableModel tt, ArrayList<TimetableModel> timetable) {
		
		SoftScore s1 = new IdleTimes();
		SoftScore terminator = new Terminator();
		
		s1.setNext(terminator);
		
		return s1.calcula(tt, timetable);
	}

}
