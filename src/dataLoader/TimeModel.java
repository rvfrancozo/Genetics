package dataLoader;

public class TimeModel {
	
	private int index;
	private int shift;
	private String descr;
	private String obs;
	
	public TimeModel(int index, int shift, String descr, String obs) {
		super();
		this.index = index;
		this.shift = shift;
		this.descr = descr;
		this.obs = obs;
	}
	
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	public int getShift() {
		return shift;
	}
	public void setShift(int shift) {
		this.shift = shift;
	}
	public String getObs() {
		return obs;
	}
	public void setObs(String obs) {
		this.obs = obs;
	}
	
	

}
