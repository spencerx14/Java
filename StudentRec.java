class Teacher{
	void teacher(){
		System.out.println("Ms. Brinal Colaco");
		System.out.println("SE-2");
	}
}
class Student extends Teacher{
	void student(String name, int roll, String branch){
		System.out.println("Name: " + name);
		System.out.println("Roll: " +roll);
		System.out.println("Branch: " +branch);
	}
}
class StudentRec{
	public static void main(String[] args){
		Student s1=new Student();
		super();
		student("Jatin Khopkar", 11,"COMPS");
	}
}		