package hardConstraints;

import java.util.ArrayList;

import dataLoader.DataControl;
import dataLoader.DataModel;

public class IntervaloEntreJornadas implements Score {
	private Score next;
	int score;
	ArrayList<DataModel> data = new DataControl().loader("data.csv");

	@Override
	public int calculator(int[] chromosome) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i <= chromosome.length; i+=5) {
			for(int j = 5; j < chromosome.length; j+=5) {
				int time = chromosome[j+1];
				if(time == 18 && time <= 2 ) 
					++score;
			}
		}
		
		return score+next.calculator(chromosome);
	}

	@Override
	public void setNext(Score next) {
		
		
	}
}	// atz agr