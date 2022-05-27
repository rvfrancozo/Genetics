package hardConstraints;

import java.util.ArrayList;

import dataLoader.DataControl;
import dataLoader.DataModel;

public class AvoidTeacherClashes implements Score {

	private Score next;

	@Override
	public int calculator(int[] chromosome) {
		
		
		ArrayList<DataModel> data = new DataControl().loader("data.csv");
		
		String teacher = data.get(0).getTeacher();
		
		int score = 0;
	
		
			
			for(int j = 0; j < chromosome.length; j+=5) {
				
				int hour_id = chromosome[j+1]; 
				int day_id = chromosome[j+2];
				int duration = chromosome[j+3]; 
				
				
				for(int i = 5; i < chromosome.length; i+=5) {
					
					int hour_id2 = chromosome[i+1]; 
					int day_id2 = chromosome[i+2];
					int duration2 = chromosome[i+3]; 
					
					if(data.get(i).getTeacher().equals(data.get(j).getTeacher()) ) {
						++score;
				
						if(hour_id == hour_id2) {
							score++;
						}
						
						if(day_id == day_id2) {
							score++;
						}
						
						if(hour_id2 <= 6) {
							//manhã 
							if(hour_id2 + duration2 > 6)
								++score;
						} else if(hour_id2 <= 13) {
							//tarde
							if(hour_id2 + duration2 > 13)
								++score;
						} else {
							//noite
							if(hour_id2 + duration2 > 18)
								++score;
						}

						
				}
					teacher = data.get(i).getTeacher();
			}
			}
		
		
		System.out.println(teacher);
		
		return score + next.calculator(chromosome);
	}

	@Override
	public void setNext(Score next) {
		this.next = next;
	}

}
