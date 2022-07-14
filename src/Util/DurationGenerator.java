package Util;

import java.util.Random;

public class DurationGenerator {
	
	public int getDuration(int total, int min, int max) {
		
		int duration = min;
		
		if(total > min && total < min * 2) 
			duration = total;		
		if(total >= max + min) 
			duration = new Random().nextInt(1 + max - min) + min;

		return duration;
	}

}
