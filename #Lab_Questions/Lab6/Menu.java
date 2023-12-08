
public class Menu {
	
	public static ArrayList<Course> courses;
	public static ArrayList<Student> students;
	public static ArrayList<Instructor> instructors;
	public static Scanner in = new Scanner(System.in);
	
	public static int GetTheChoice(){
		int choice;
		System.out.println("1 - Add instructor");
		System.out.println("2 - Add Course");
		System.out.println("3 - Assign an course to an instructor");
		System.out.println("4 - Add Student");
		System.out.println("5 - Register a student to a course");
		System.out.println("6 - print List of instructors");
		System.out.println("7 - print List of courses taught by instructors");
		System.out.println(" ---------------------------------");
		System.out.println("Enter your choice");
		choice = in.nextInt();
		return choice;
	}
	
	public static void AddInstructor(){

	}
	
	public static void AddCourse(){

	}
	
	public static int VerifyTheCourseCode(String code){

	}
	public static int VerifyTheInstructorName(String name){

	}
	
	public static void AssignCourseToInstructor(){
		
		
	}
	
	
	
	public static void PrintListOfInstructors(){

	}
	
	public static void PrintTaughtCourses(){

			
	}
	
	

	
	public static void main (String [] a){

		
		int choice;
		boolean repeat = true;
		
		
		
		courses = new ArrayList<Course>();
		students = new ArrayList<Student>();
		instructors =  new ArrayList<Instructor>();

		while(repeat){
			choice = GetTheChoice();
			switch(choice){
			case 1:  AddInstructor();
					break;
			case 2 : AddCourse();
					break;
			case 3: AssignCourseToInstructor();
					break;
			case 6 : PrintListOfInstructors();
					break;
			case 7 : PrintTaughtCourses();
					break;
			default: repeat = false;
					break;
			}
		}
		

		
		*/
		
	}
}
