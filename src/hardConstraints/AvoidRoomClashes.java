package hardConstraints;

public class AvoidRoomClashes implements Score {

	private Score next;

	@Override
	public int calculator(int[] chromosome) {
		
		int score = 0;
		for(int i = 0; i < chromosome.length; i+=5) {
			//int event_id = chromosome[0]; //unico não usado aqui 
			int hour_id = chromosome[i+1]; 
			int day_id = chromosome[i+2]; //0 1 2 3 4
			int duration = chromosome[i+3]; 
			int classroom_id = chromosome[i+4];
			
			for (int j = i+5; j < chromosome.length; j+=5) {
				//Verifica se essa sala é usada no mesmo dia
				if(classroom_id == chromosome[j] && day_id == chromosome[j-2]) {
					//verifica se tem choque de horários nesse dia nessa sala
					if( chromosome[j-3] <= (hour_id + duration) && (chromosome[j-3] + chromosome[j-1]) >=  hour_id ) {
						++score;
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
