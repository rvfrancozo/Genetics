package hardConstraints;

import java.util.ArrayList;

import dataLoader.TimetableModel;

public class Terminator implements HardScore {

	@Override
	public int calcula(TimetableModel tt, ArrayList<TimetableModel> timetable) {
		return 0;
	}

	@Override
	public void setNext(HardScore next) {
		
	}


}
