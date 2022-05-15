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
		return next.calculator(chromosome);
	}

	@Override
	public void setNext(Score next) {
		this.next = next;		
	}

}
