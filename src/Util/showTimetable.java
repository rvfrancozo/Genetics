package Util;
//teste
import java.util.ArrayList;

import dataLoader.ClassroomControl;
import dataLoader.ClassroomModel;
import dataLoader.DataModel;
import dataLoader.TimeControl;
import dataLoader.TimeModel;
import dataLoader.WeekDayControl;
import dataLoader.WeekDayModel;
import hardConstraints.HardCalculator;

public class showTimetable {

	private ArrayList<TimeModel> times = new TimeControl().Times();
	private ArrayList<WeekDayModel> days = new WeekDayControl().WeekDays();
	private ArrayList<ClassroomModel> classrooms = new ClassroomControl().Classroom();

	public showTimetable(int[] timetable, ArrayList<DataModel> data) {
		for (int i = 0; i < timetable.length; i += 5) {
			for (DataModel d : data) {
				if (d.getIndex() == timetable[i]) {
					System.out.println("Curso: " + d.getCourse() + " Turma: " + d.getClasses());
					System.out.println("Disciplina: " + d.getSubject());
					System.out.println("Professor: " + d.getTeacher());
					System.out.println("Duração: " + timetable[i + 3] + " h/a");
					break;
				}
			}
			for (TimeModel t : times) {
				if (t.getIndex() == timetable[i + 1]) {
					System.out.println("Horário: " + t.getDescr());
					break;
				}
			}
			for (WeekDayModel d : days) {
				if (d.getIndex() == timetable[i + 2]) {
					System.out.println("Dia: " + d.getDayNamePt());
					break;
				}
			}
			for (ClassroomModel c : classrooms) {
				if(c.getIndex()-1 == timetable[i + 4]) {
					System.out.println("Local: " + c.getName());
					break;
				}
			}
			System.out.println();
		}
		
		showChromosome(timetable);
		showScore(timetable);
	}

	public void showChromosome(int[] timetable) {
		for (int i = 0; i < timetable.length; i++)
			System.out.print(timetable[i]+"-");
		System.out.println();
	}
	
	public void showScore(int[] timetable) {
		//int score = new HardCalculator().Score(timetable);
		//System.out.println("\nScore: " + score);
	}

}
