package DAY4;

import java.time.LocalDate;

import java.time.LocalTime;

 

class Launch{

	private int pgNo;

	private String name;

 

	public String getName() {

		return name;

	}

 

	public void setName(String name) {

		this.name = name;

	}

 

	public int getPgNo() {

		return pgNo;

	}

 

	public void setPgNo(int pgNo) {

		this.pgNo = pgNo;

	}

	

	

}

 

public class EncapsulationDemo {

 

	public static void main(String[] args) {

		Launch l = new Launch();

		

		l.setPgNo(123);

		System.out.println(l.getPgNo());

		

		LocalDate ld = LocalDate.now();

		System.out.println(ld);

		LocalTime lt = LocalTime.now();

		System.out.println(lt);

		

	}

 

}
