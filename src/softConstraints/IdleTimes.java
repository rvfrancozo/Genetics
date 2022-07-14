package softConstraints;

import java.util.ArrayList;

import dataLoader.TimetableModel;
import hardConstraints.HardScore;

public class IdleTimes implements SoftScore {

	private HardScore next;

	@Override
	public int calcula(TimetableModel tt, ArrayList<TimetableModel> timetable) {
		int score = 0;
		return score + next.calcula(tt, timetable);
	}

	@Override
	public void setNext(HardScore next) {
		this.next = next;
		
	}

}
