package dataLoader;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class DataControl {
	
	private static Scanner input;
	private static ArrayList<DataModel> data = new ArrayList<DataModel>();
	private int i = 0;
	
	public ArrayList<DataModel> loader(String file) {	
		try {
			input = new Scanner(Paths.get(file));
			input.nextLine();
			
			while(input.hasNext()) {
				String[] values = input.nextLine().split(",");
				DataModel event = new DataModel();
				
				event.setIndex(++i);
				event.setCourse(values[0]);
				event.setShift(Integer.parseInt(values[1]));
				event.setClasses(values[2]);
				event.setArea(values[3]);
				event.setSubject(values[5]);
				event.setSemanalLessons(Integer.parseInt(values[6]));
				event.setTeacher(values[7]);
				event.setMinDailylLessons(Integer.parseInt(values[8]));
				event.setMaxDailylLessons(Integer.parseInt(values[9]));
				event.setClassRoomType(Integer.parseInt(values[11]));
				
				data.add(event);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return data;
	}
}