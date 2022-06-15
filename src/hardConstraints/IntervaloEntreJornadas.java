package hardConstraints;

import java.util.ArrayList;

import dataLoader.DataControl;
import dataLoader.DataModel;

public class IntervaloEntreJornadas implements Score {
	private Score next;
	int score;
	//ArrayList<DataModel> data = new DataControl().loader("data.csv");

	
	public int calculator(int[] chromosome) {
		// TODO Auto-generated method stub
		
//		for(int i = 0; i <= chromosome.length; i+=5) {
//			//int event_id = chromosome[0]; //unico não usado aqui 
//			int hour_id = chromosome[i+1]; //
//			int day_id = chromosome[i+2]; //0 1 2 3 4
//			int duration = chromosome[i+3]; 
//			
//			if(day_id < 4 && hour_id > 15) {
//				
//				for(int j = i+4; j < chromosome.length; j+=5) {
//					if(chromosome[j] < 1 && chromosome[j] == day_id+1) {
//						++score;
//						System.out.println("Palmeiras");
//					}
//				
//			}
//			
//		
//		}
//		
//		
//		}
		
		int score = 0;
		for(int i = 0; i < chromosome.length; i+=5) {
			//int event_id = chromosome[0]; //unico não usado aqui 
			int hour_id = chromosome[i+1]; 
			int day_id = chromosome[i+2]; //0 1 2 3 4
			int duration = chromosome[i+3]; 
			int classroom_id = chromosome[i+4];
			
			if(day_id < 4 && hour_id > 15) {
				
				for (int j = i+5; j < chromosome.length; j+=5) {
					//Verifica se essa sala é usada no mesmo dia
					if(chromosome[j-2] == day_id+1 ) {
						if(hour_id + duration-1 == 16 && chromosome[j-3] <= 2)
						{
							++score;
						}
						if(hour_id + duration-1 == 17 && chromosome[j-3] <= 3)
						{
							++score;
						}
						if(hour_id + duration-1 == 18 && chromosome[j-3] <= 4)
						{
							++score;
						}
						if(hour_id + duration-1 == 19 && chromosome[j-3] <= 5)
						{
							++score;
						}
			}
			
			
					
				}
			}
		}
		return score+next.calculator(chromosome);
		}

	@Override
	public void setNext(Score next) {
		this.next = next;
	}
}