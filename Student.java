public class Student {
	int rollno, age;
	String name, course;;

	/**
	 * 
	 * @param args
	 */
	Student(String a,int b,String c ,int d) {
		name = a;
		rollno = b;
		course =c ;
		age = d;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ob = new Student("yogesh",28,"BCA",21);
		System.out.println("Details of Student:");
		System.out.println("Name    :" + ob.name);
		System.out.println("Roll no.:" + ob.rollno);
		System.out.println("Course  :" + ob.course);
		System.out.println("Age     :" + ob.age);
	}

}
