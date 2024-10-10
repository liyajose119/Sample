class Student {
int roll;
String name;

public Student(int r,String n) {
roll=r;
name=n;
}

public void display() {
System.out.println("Name: " + name + " , Roll: " + roll);
}


public static void main(String[] args) {
Student list=new Student(1,"Liya");
list.display();
Student list2=new Student(2,"Diya");
list2.display();
}

}