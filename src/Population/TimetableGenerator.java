package Population;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import dataLoader.ClassroomModel;
import dataLoader.DataModel;
import dataLoader.TimeModel;
import dataLoader.WeekDayModel;

public class TimetableGenerator {

	public int[] Generator(ArrayList<DataModel> data, ArrayList<TimeModel> times, ArrayList<WeekDayModel> days,
			ArrayList<ClassroomModel> classrooms) {
		int event_id = 0, hour_id = 0, day_id = 0, duration = 0, classroom_id = 0, tmp;

		List<Integer> gene = new ArrayList<Integer>();

		while (data.size() > 0) {
			int r = new Random().nextInt(data.size());

			// Event Gene
			event_id = data.get(r).getIndex();

			// Hour Gene
			do {
				tmp = new Random().nextInt(times.size());
				hour_id = times.get(tmp).getIndex();
			} while (times.get(tmp).getShift() != data.get(r).getShift());

			// Day Gene
			day_id = days.get(new Random().nextInt(days.size())).getIndex();

			// Duration Gene
			if (data.get(r).getSemanalLessons() >= data.get(r).getMaxDailylLessons()) {
				duration = new Random()
						.nextInt(1 + data.get(r).getMaxDailylLessons() - data.get(r).getMinDailylLessons());
			} else if (data.get(r).getSemanalLessons() >= data.get(r).getMinDailylLessons()) {
				duration = new Random()
						.nextInt(1 + data.get(r).getSemanalLessons() - data.get(r).getMinDailylLessons());
			}
			duration += data.get(r).getMinDailylLessons();

			data.get(r).setSemanalLessons(data.get(r).getSemanalLessons() - duration);

			// Classroom Gene 
			do {
				classroom_id = new Random().nextInt(classrooms.size());
			} while (classrooms.get(classroom_id).getCod_type() != data.get(r).getClassRoomType());

			//Remove lesson
			if (data.get(r).getSemanalLessons() <= 0)
				data.remove(r);

			gene.add(event_id);
			gene.add(hour_id);
			gene.add(day_id);
			gene.add(duration);
			gene.add(classroom_id);
		}

		int[] chromosome = new int[gene.size()];

		for (int i = 0; i < gene.size(); i++)
			chromosome[i] = gene.get(i);

		return chromosome;
	}

}
