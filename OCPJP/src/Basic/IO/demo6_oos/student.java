package Basic.IO.demo6_oos;

import java.io.Serializable;

public class student implements Serializable{
	private String name;
	private int chi;
	private int eng;
	private int sum;
	public student(String name, int chi, int eng) {
		super();
		this.name = name;
		this.chi = chi;
		this.eng = eng;
		sum=chi+eng;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getChi() {
		return chi;
	}
	public void setChi(int chi) {
		this.chi = chi;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getSum() {
		return sum;
	}
	public void show() {
		System.out.println("name: "+getName()+" chi: "+getChi()+" eng: "+getEng()+" sum: "+getSum());
	}
}
