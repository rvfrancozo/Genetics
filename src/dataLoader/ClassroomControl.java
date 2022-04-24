package dataLoader;

import java.util.ArrayList;

//private int index;
//private int cod_type;
//private String type;
//private int capacity;
//private String name;

public class ClassroomControl {
	
	public ArrayList<ClassroomModel> Classroom() {
		ArrayList<ClassroomModel> classroom = new ArrayList<ClassroomModel>();
		
		//Salas de Aula
		classroom.add(new ClassroomModel(1,1,"Sala",30,"Sala 1"));
		classroom.add(new ClassroomModel(2,1,"Sala",30,"Sala 2"));
		classroom.add(new ClassroomModel(3,1,"Sala",30,"Sala 3"));
		classroom.add(new ClassroomModel(4,1,"Sala",30,"Sala 4"));
		classroom.add(new ClassroomModel(5,1,"Sala",30,"Sala 5"));
		classroom.add(new ClassroomModel(6,1,"Sala",30,"Sala 6"));
		classroom.add(new ClassroomModel(7,1,"Sala",30,"Sala 7"));
		classroom.add(new ClassroomModel(8,1,"Sala",30,"Sala 8"));
		
		//Laboratórios de Informática
		classroom.add(new ClassroomModel(9,2,"Laboratório",30,"Laboratório A"));
		classroom.add(new ClassroomModel(10,2,"Laboratório",30,"Laboratório B"));
		classroom.add(new ClassroomModel(11,2,"Laboratório",30,"Laboratório C"));
		classroom.add(new ClassroomModel(12,2,"Laboratório",30,"Laboratório D"));
		classroom.add(new ClassroomModel(13,2,"Laboratório",30,"Laboratório E"));
		classroom.add(new ClassroomModel(14,2,"Laboratório",30,"Laboratório de Robótica"));
		classroom.add(new ClassroomModel(15,2,"Laboratório",15,"Laboratório de Dispositivos Móveis"));
		classroom.add(new ClassroomModel(16,2,"Laboratório",30,"Laboratório de Arquitetura"));
		
		return classroom;
	}

}
