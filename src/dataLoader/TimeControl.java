package dataLoader;

import java.util.ArrayList;

public class TimeControl {
	
	public ArrayList<TimeModel> Times() {
		ArrayList<TimeModel> times = new ArrayList<TimeModel>();
		
		//Morning
		times.add(new TimeModel(1,1,"07h00-07h45",""));
		times.add(new TimeModel(2,1,"07h45-08h30",""));
		times.add(new TimeModel(3,1,"08h30-09h15",""));
		times.add(new TimeModel(4,1,"09h30-10h15",""));
		times.add(new TimeModel(5,1,"10h15-11h00",""));
		times.add(new TimeModel(6,1,"11h00-11h45",""));
		times.add(new TimeModel(7,1,"11h45-12h30",""));
		
		//Afternoon
		times.add(new TimeModel(8,2,"13h00-13h45",""));
		times.add(new TimeModel(9,2,"13h45-14h30",""));
		times.add(new TimeModel(10,2,"14h30-15h15",""));
		times.add(new TimeModel(11,2,"15h30-16h15",""));
		times.add(new TimeModel(12,2,"16h15-17h00",""));
		times.add(new TimeModel(13,2,"17h00-17h45",""));
		times.add(new TimeModel(14,2,"17h45-18h30",""));
		
		//Night
		times.add(new TimeModel(15,3,"19h00-19h45",""));
		times.add(new TimeModel(16,3,"19h45-20h30","")); //se a aula termina aqui ele não pode pegar o 1º horario no dia seguinte
		times.add(new TimeModel(17,3,"20h30-21h15","")); //se a aula termina aqui ele não pode pegar o 1º e o 2º horario no dia seguinte
		times.add(new TimeModel(18,3,"21h30-22h15","")); //se a aula termina aqui ele não pode pegar o 1º e o 2º e 3º horario no dia seguinte
		times.add(new TimeModel(19,3,"22h15-23h00","")); //se a aula termina aqui ele não pode pegar o 1º, 2º, 3º e 4º horario no dia seguinte
		
		return times;
	}

}
