package student;

public class School {
	public void schName()
	{
		System.out.println("VRP");
	}
	public void schId()
	{
		System.out.println("01");
	}
	public void schAdress()
	{
		System.out.println("chennai");
	}
	public static void main(String[] args) {
		School s=new School();
		s.schName();
		s.schId();
		s.schAdress();
		Student r=new Student();
				r.studentName();
				r.studentRollno();
				r.studentMark();
	
		
	}

}
