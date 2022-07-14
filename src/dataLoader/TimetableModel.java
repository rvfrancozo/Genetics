package dataLoader;

public class TimetableModel {
	
	private int index; 
	private String Course;
	private String Classes;
	private String Area;
	private String Subject;
	private String Teacher;
	private int Day;
	private int Shift;
	private int Start;
	private int End;
	private int Duration;
	private int classRoom;
	
	public TimetableModel(int index, String course, String classes, String area, String subject, String teacher,
			int day, int shift, int start, int end, int duration, int classRoom) {
		super();
		this.index = index;
		Course = course;
		Classes = classes;
		Area = area;
		Subject = subject;
		Teacher = teacher;
		Day = day;
		Shift = shift;
		Start = start;
		End = end;
		Duration = duration;
		this.classRoom = classRoom;
	}
	public TimetableModel() {
		// TODO Auto-generated constructor stub
	}
	public int getDay() {
		return Day;
	}
	public void setDay(int day) {
		Day = day;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
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
	public int getShift() {
		return Shift;
	}
	public void setShift(int shift) {
		Shift = shift;
	}
	public int getDuration() {
		return Duration;
	}
	public void setDuration(int duration) {
		Duration = duration;
	}
	public int getClassRoom() {
		return classRoom;
	}
	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}
	public int getStart() {
		return Start;
	}
	public void setStart(int start) {
		Start = start;
	}
	public int getEnd() {
		return End;
	}
	public void setEnd(int end) {
		End = end;
	}
	
	

}
