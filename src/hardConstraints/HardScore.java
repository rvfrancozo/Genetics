package hardConstraints;

import java.util.ArrayList;

import dataLoader.TimetableModel;

public interface HardScore {
	
	int calcula(TimetableModel tt, ArrayList<TimetableModel> timetable);
	void setNext(HardScore next);

}
