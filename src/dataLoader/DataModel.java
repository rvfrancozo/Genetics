package dataLoader;

public class DataModel {
	
	private int index; 
	private String Course;
	private String Classes;
	private String Area;
	private String Subject;
	private String Teacher;
	private int Shift;
	private int SemanalLessons;
	private int minDailylLessons;
	private int maxDailylLessons;
	private int classRoom = 0;
	private int classRoomType;
	
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	public String getClasses() {
		return Classes;
	}
	public void setClasses(String classes) {
		Classes = classes;
	}
	public String getArea() {
		return Area;
	}
	public void setArea(String area) {
		Area = area;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	public String getTeacher() {
		return Teacher;
	}
	public void setTeacher(String teacher) {
		Teacher = teacher;
	}
	public int getSemanalLessons() {
		return SemanalLessons;
	}
	public void setSemanalLessons(int semanalLessons) {
		SemanalLessons = semanalLessons;
	}
	public int getMinDailylLessons() {
		return minDailylLessons;
	}
	public void setMinDailylLessons(int minDailylLessons) {
		this.minDailylLessons = minDailylLessons;
	}
	public int getMaxDailylLessons() {
		return maxDailylLessons;
	}
	public void setMaxDailylLessons(int maxDailylLessons) {
		this.maxDailylLessons = maxDailylLessons;
	}
	public int getShift() {
		return Shift;
	}
	public void setShift(int shift) {
		Shift = shift;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public int getClassRoom() {
		return classRoom;
	}
	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}
	public int getClassRoomType() {
		return classRoomType;
	}
	public void setClassRoomType(int classRoomType) {
		this.classRoomType = classRoomType;
	}

}
