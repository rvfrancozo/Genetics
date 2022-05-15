package hardConstraints;

public interface Score {
	
	int calculator(int[] chromosome);
	void setNext(Score next);

}
