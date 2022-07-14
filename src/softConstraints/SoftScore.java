package softConstraints;

import java.util.ArrayList;

import dataLoader.TimetableModel;
import hardConstraints.HardScore;

public interface SoftScore {
	
	int calcula(TimetableModel tt, ArrayList<TimetableModel> timetable);
	void setNext(SoftScore next);

}
