package org.tnsif.singlelevelinheritane;

//child class
public class Student extends Citizen {
	//private data members
	private int rollno;
	private String Studentname;
	
	//getter and setter method
	public int getRol1lno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	//Aakansha Barkale Yedi khup 	khup yedi A	HE NBFGMFDFDFDBVDFX//NFSDBFDSFJBX
	//BDFBSFJS
	//ZBCMDSFBRSDJF
	public String getStudentname() {
		return Studentname;
	}
	public void setStudentname(String studentname) {
		Studentname = studentname;
	}
	public Student() {
		super();
	}
	public Student(String name, String adharno, String city, long mbno,int rollno, String studentname) {
		super(name,adharno,city,mbno);
		this.rollno = rollno;
		Studentname = studentname;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", Studentname=" + Studentname + ", getName()=" + getName()
				+ ", getAdharno()=" + getAdharno() + ", getCity()=" + getCity() + ", getMbno()=" + getMbno() + "]";
	}
	
	
	

}

