package basic.day2;

public class StudentTest {

	public static void main(String[] args) {
		Student []std=new Student[10];
		Student ob=new Student();
		ob.id=11;
		ob.name="ambuj";
		ob.age=30;
		//ob.printInfo();
	
		Student ob2=new Student();
		ob2.id=12;
		ob2.name="Harika";
		ob2.age=31;
		//ob2.printInfo();
		Student ob3=new Student();
		ob3.id=13;
		ob3.name="Hari";
		ob3.age=31;
		//ob3.printInfo();
		Student ob4=new Student();
		ob4.id=14;
		ob4.name="rika";
		ob4.age=31;
		//ob4.printInfo();
		Student ob5=new Student();
		ob5.id=15;
		ob5.name="Haika";
		ob5.age=31;
		//ob5.printInfo();
		std[0]=ob;
		std[1]=ob2;
		std[2]=ob3;
		std[3]=ob4;
		std[4]=ob5;
		System.out.println(std);
		for(Student s:std) {
			System.out.println(s);// it is a print memory address of each object and remaining the elements will be null.
			
		}
		
	}

}