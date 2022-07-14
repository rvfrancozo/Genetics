package hardConstraints;

import java.util.ArrayList;

import dataLoader.TimetableModel;

public class WorkDayBreak implements HardScore {

	private HardScore next;

	@Override
	public int calcula(TimetableModel tt, ArrayList<TimetableModel> timetable) {
		int score = 0;
		for(TimetableModel t : timetable) {
			if(t.getEnd() > 15 && t.getDay() == tt.getDay()-1 && t.getEnd()-tt.getStart() >= 15)
				score++;
		}
		
		return score + next.calcula(tt, timetable);
	}

	@Override
	public void setNext(HardScore next) {
		this.next = next;		
	}

}
