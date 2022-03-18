package practice1;
class Person{
	void show() {
		System.out.println("i am from person");
	}
}
class Student extends Person{
	void show () {
		System.out.println("i am from student");
	}
}


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
	/*Person p=new Student();
		p.show();
	Person p1=new Person();
	p1.show();
	*/
	Student s=new Student();
	s.show();
	}

}
