package hardConstraints;

import java.util.ArrayList;

import dataLoader.TimetableModel;

public class AvoidTeacherClashes implements HardScore {

	private HardScore next;

	@Override
	public int calcula(TimetableModel tt, ArrayList<TimetableModel> timetable) {
		int score = 0;
		for(TimetableModel t : timetable) {
			if(t.getTeacher().equals(tt.getTeacher()) && t.getDay() == tt.getDay()) { //verifica se o professor é usada no mesmo dia da semana
				if (!( t.getStart()+t.getDuration()-1 < tt.getStart() || t.getStart() > tt.getStart()+tt.getDuration()-1)) 
					score++;
			}
		}
		return score + next.calcula(tt, timetable);
	}

	@Override
	public void setNext(HardScore next) {
		this.next = next;
		
	}

}
