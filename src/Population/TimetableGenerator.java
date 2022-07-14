package Population;

import java.util.ArrayList;
import java.util.Random;

import Util.DurationGenerator;
import dataLoader.ClassroomModel;
import dataLoader.DataModel;
import dataLoader.TimeModel;
import dataLoader.TimetableModel;
import dataLoader.WeekDayModel;
import hardConstraints.HardCalculator;

public class TimetableGenerator {

	public ArrayList<TimetableModel> Generator(
			ArrayList<DataModel> data, 
			ArrayList<TimeModel> times, 
			ArrayList<WeekDayModel> days,
			ArrayList<ClassroomModel> classrooms) {
		ArrayList<TimetableModel> timetable = new ArrayList<TimetableModel>();
		TimetableModel tt = new TimetableModel();

		while (data.size() > 0) {

			TimetableModel temp;
			int r;
			do {
				r = new Random().nextInt(data.size());				
				
				//Classroom Gene
				int classroom = 0;
				if(data.get(r).getClassRoomType() == 2) 
					classroom = new Random().nextInt(17-9)+9;
				else 
					classroom = new Random().nextInt(17);
				
				
				//Duration Gene
				int duration = new DurationGenerator().getDuration(
						data.get(r).getSemanalLessons(),
						data.get(r).getMinDailylLessons(),
						data.get(r).getMaxDailylLessons());
				
				//Start Time
				int start;
				if(data.get(r).getShift() != 3)
					start = 1 + new Random().nextInt(8 - duration) + 7 * (data.get(r).getShift() - 1);
				else
					start = 1 + new Random().nextInt(6 - duration);			
				
				
				//End Time
				int end = start + duration - 1;
				
				
				//Add Timetable
				temp = new TimetableModel(
						data.get(r).getIndex(), 
						data.get(r).getCourse(), 
						data.get(r).getClasses(), 
						data.get(r).getArea(), 
						data.get(r).getSubject(), 
						data.get(r).getTeacher(),
						days.get(new Random().nextInt(days.size())).getIndex(), 
						data.get(r).getShift(), 
						start, 
						end, 
						duration, 
						classroom //classrooms.get(new Random().nextInt(classrooms.size())).getIndex()
						);
				
				//Deduct assigned duration
				if(new HardCalculator().Score(temp, timetable) == 0)
					data.get(r).setSemanalLessons( data.get(r).getSemanalLessons() - duration );
				
				
			} while(new HardCalculator().Score(temp, timetable) > 0);
			
			timetable.add(temp);
			
			//Remove lesson
			if(data.get(r).getSemanalLessons() <= 0)
				data.remove(r);

		}
		
		for(TimetableModel t : timetable) {
			System.out.println("Professor: " + t.getTeacher());
			System.out.println("Disciplina: " + t.getSubject());
			System.out.println("Curso / Turma: " + t.getCourse() + " / " + t.getClasses());
			System.out.println("Carga Horária: " + t.getDuration() + " h/a");
			System.out.println("Sala: " + t.getClassRoom() + " - " +classrooms.get(t.getClassRoom()-1).getName()  );
			System.out.println("Horário: " +  days.get(t.getDay()-1).getDayNamePt() + " das " +
			times.get(t.getStart()-1).getDescr().substring(0, 5) + " às " + times.get(t.getEnd()).getDescr().substring(0, 5) );
			System.out.println();
		}

		return timetable;
	}

}
