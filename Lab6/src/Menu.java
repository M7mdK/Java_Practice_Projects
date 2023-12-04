import java.util.ArrayList;
import java.util.Scanner;
public class Menu {
	
	public static ArrayList<Instructor> instructors;
	public static ArrayList<Course> courses;
	public static ArrayList<Student> students;
	
	public static Scanner in = new Scanner(System.in);
	
	public static int GetTheChoice(){
		int choice;
		System.out.println("1 - Add instructor");
		System.out.println("2 - Add Course");
		System.out.println("3 - Add Student");
		System.out.println("4 - print List of instructors");
		System.out.println("5 - print List of courses");
		System.out.println("6 - print List of students");
		System.out.println("7 - Assign an course to an instructor");
		System.out.println("8 - Register a student to a course");
		System.out.println("9 - print List of courses taught by instructors");
		System.out.println("10 - print List of courses registered by students");
		System.out.println("11 - print List of students registered by a certain course");
		System.out.println(" ---------------------------------");
		System.out.println("Enter your choice");
		choice = in.nextInt();
		return choice;
	}
	
	//#1
	public static void AddInstructor(){
		String name , birth;
		System.out.println("Enter the name of the instructor then his bithday \n");
		name = in.next();
		birth = in.next();
		Instructor ins = new Instructor(name,birth);
		instructors.add(ins);
	}
	//#2
	public static void AddCourse(){
		String code , name;
		System.out.println("Enter the name of the course the it's code \n");
		name = in.next();
		code = in.next();
		Course C = new Course(code,name);
		courses.add(C);
	}
	//#3
	public static void AddStudent(){
		String name , birth;
		System.out.println("Enter the name of the student then enter his/her birthday \n");
		name = in.next();
		birth = in.next();
		System.out.println("If you would like to add a special ID for this student enter it \n"
				+ "If not then enter 'd' to give him a default ID \n");
		String id = in.next();
		
		while(ExistsStudentId(id) != -1){
			System.out.println("ID already exists please choose another one! \n");
			id = in.next();
		}
		/*By taking into consideration that in the manual ID creation we are not going to give
		  an ID similar to the default ID form.
		 */
		Student S;
		if(id.equals("d"))
			 S = new Student(name , birth);
		else
			 S = new Student(id , name , birth);
		students.add(S);
	}
	
	//Checking:
	/*
	public static int VerifyTheCourseCode(String code){

	}
	
	public static int VerifyTheInstructorName(String name){

	}
	*/
	public static int ExistsStudentId(String id){
		for(int i=0 ; i<students.size() ; i++)
			if(students.get(i).getID().equals(id))
				return i;
		
		return -1;  //Doesn't exist
	}
	
	//#4
	public static void PrintCoursesList(){
		for (int i=0 ; i<courses.size(); i++)
			System.out.println(i + "- " + courses.get(i));
	}
	//#5
	public static void PrintInstructorsList(){
		for(int i=0 ; i<instructors.size() ; i++)
				System.out.println(i + "- " + instructors.get(i));
	}
	//#6
	public static void PrintStudentsList(){
		for(int i=0 ; i<students.size() ; i++)
			System.out.println(i + "- " + students.get(i));
	}
	
	
	//#7
	public static void AssignCourseToInstructor(){
		int x,y;
		System.out.println("Choose the number of the needed instructor:");
		 PrintInstructorsList();
		 x=in.nextInt();
		 
		 System.out.println("Choose the number of the wanted course:");
		 PrintCoursesList();
		 y=in.nextInt();
		 
		 courses.get(y).setTeacher(instructors.get(x));
	}
	
	//#8
	public static void RegisterStudentToCourse(){
		int i , j;
		System.out.println("Choose the number of the course \n");
		PrintCoursesList();
		i = in.nextInt();
		
		System.out.println("Enter student ID");
		String id = in.next();
		j = ExistsStudentId(id);
		if(j !=-1)
		students.get(j).registerTo(courses.get(i));
		else{
			System.out.println("Failed! ID doesn't exist");
		}
	}
	
	//#9
	public static void PrintTaughtCourses(){
		for(int i=0 ; i<instructors.size(); i++){
			System.out.println("Teacher " + instructors.get(i).getName() + " teachs the courses:");
			instructors.get(i).printTaughtCourses();
		}
	}
	//#10
	public static void PrintRegisteredCourses(){  //Set of courses registered by each student
		for(int i=0 ; i<students.size(); i++){
			System.out.println("Courses registered by " + students.get(i).getName() + " are:");
			for(int j=0 ; j<students.get(i).getLRC().size(); j++){
				System.out.println(students.get(i).getLRC().get(j));
			}
		}
		
	}
	//#11
	public static void PrintRegisteredStudents(){  //Set of students registered to each course
		for(int i=0 ; i<courses.size(); i++){
			System.out.println("Students registered to " + courses.get(i).getName() + " course are:");
			for(int j=0 ; j<courses.get(i).getSt().size() ; j++){
				System.out.println(courses.get(i).getSt().get(j).getName());
			}
		}
	}
	
	
	public static void main (String [] a){

		int choice;
		boolean repeat = true;
		
		instructors =  new ArrayList<Instructor>();
		courses = new ArrayList<Course>();
		students = new ArrayList<Student>();
		
		while(repeat){
			choice = GetTheChoice();
			
			switch(choice){
			//ADD:
			case 1:  AddInstructor();
					break;
					
			case 2 : AddCourse();
					break;
					
			case 3: AddStudent();
					break;
			
			//PRINT:		
			case 4: PrintInstructorsList();
					break;
					
			case 5: PrintCoursesList();
					break;
					
			case 6 : PrintStudentsList();
					break;
			
			//OTHERS:		
			case 7 : AssignCourseToInstructor();
					break;
					
			case 8 : RegisterStudentToCourse();
					break;
			
			case 9 : PrintTaughtCourses();
					break;
					
			case 10: PrintRegisteredCourses();
					break;
					
			case 11: PrintRegisteredStudents();
					break;
			default: repeat = false;
					break;
			}
		}
	}
}
