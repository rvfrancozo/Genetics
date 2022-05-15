package hardConstraints;

public class HardCalculator {
	
	public int Score(int[] timetable) {
		
		Score p1 = new AvoidRoomClashes();
		Score p2 = new AvoidTimeClashes();
		Score terminator = new Terminator();
		
		p1.setNext(p2);
		p2.setNext(terminator);
		
		return p1.calculator(timetable);
	}

}
