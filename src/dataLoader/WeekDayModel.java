package dataLoader;

public class WeekDayModel {
	
	private int index;
	private String dayNamePt;
	private String dayNameEn;
	private String dayNameEs;
	
	public WeekDayModel(int index, String dayNamePt, String dayNameEn, String dayNameEs) {
		super();
		this.index = index;
		this.dayNamePt = dayNamePt;
		this.dayNameEn = dayNameEn;
		this.dayNameEs = dayNameEs;
	}
	
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public String getDayNamePt() {
		return dayNamePt;
	}
	public void setDayNamePt(String dayNamePt) {
		this.dayNamePt = dayNamePt;
	}
	public String getDayNameEn() {
		return dayNameEn;
	}
	public void setDayNameEn(String dayNameEn) {
		this.dayNameEn = dayNameEn;
	}
	public String getDayNameEs() {
		return dayNameEs;
	}
	public void setDayNameEs(String dayNameEs) {
		this.dayNameEs = dayNameEs;
	}
	
	

}
