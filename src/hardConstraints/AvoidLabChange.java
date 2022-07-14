package hardConstraints;

import java.util.ArrayList;

import dataLoader.TimetableModel;

public class AvoidLabChange implements HardScore {

	private HardScore next;

	@Override
	public int calcula(TimetableModel tt, ArrayList<TimetableModel> timetable) {
		int score = 0;
		for(TimetableModel t : timetable) {
			if(t.getTeacher().equals(tt.getTeacher())
					&& t.getSubject().equals(tt.getSubject())
					&& t.getCourse().equals(tt.getCourse())
					&& t.getClasses().equals(tt.getClasses())
					&& t.getClassRoom() >= 9
					&& t.getClassRoom() != tt.getClassRoom()
					) {
				score++;
			}
		}
		//score--;
		return score + next.calcula(tt, timetable);
	}

	@Override
	public void setNext(HardScore next) {
		this.next = next;		
	}

}
