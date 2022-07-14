package softConstraints;

import java.util.ArrayList;

import dataLoader.TimetableModel;
import hardConstraints.HardScore;

public class Terminator implements SoftScore {

	@Override
	public int calcula(TimetableModel tt, ArrayList<TimetableModel> timetable) {
		return 0;
	}

	@Override
	public void setNext(HardScore next) {
		
	}

}
