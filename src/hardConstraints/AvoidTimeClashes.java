package hardConstraints;
/*
 * Aqui vocês precisam verificar se o horário serve, por exemplo uma disciplina
 * noturna que tem 3 h/a de duração tem que começar no máximo 20h30 para terminar 
 * até as 23h. A mesma lógica se aplica para os períodos matutinos e vespertinos 
 * */

public class AvoidTimeClashes implements Score {

	private Score next;

	@Override
	public int calculator(int[] chromosome) {
		int score = 0;

		if(hour_id <= 6) {
			//manhã 
			if(hour_id + duration > 6)
				++score;
		} else if(hour_id <= 13) {
			//tarde
			if(hour_id + duration > 13)
				++score;
		} else {
			//noite
			if(hour_id + duration > 18)
				++score;
		}

		return score+next.calculator(chromosome);
	}

	@Override
	public void setNext(Score next) {
		this.next = next;		
	}

}
