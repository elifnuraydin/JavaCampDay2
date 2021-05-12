
public class Main {

	public static void main(String[] args) {
		
		User user1=new User(1,"Elifnur","Aydin","elifnraydin@gmail.com");
		User user2=new User(2,"David","Wilson","david@gmail.com");
		User user3=new User(3,"Charles:","Smith","charles.smith@gmail.com");
		User user4=new User(4,"Bella","Calrk","Bellaclaarkk4561@hotmail.com");
		
		User users []= {user1,user2,user3};
		for(User user:users) {
			System.out.println("Kodlama.io is user = "+user.name+" "+user.username);
		}
		
		UserManager userManager=new UserManager();
		userManager.add(user4);
		
		
		
		
		
		Course course1=new Course(1,"Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)","Engin","Demirog");
		Course course2=new Course(2,"Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)","Engin","Demirog");
		Course course3=new Course(3,"Programlamaya Giriþ için Temel Kurs","Engin","Demirog");
		   Course courses[] = {course1,course2,course3};
		  for(Course course:courses) {
			  System.out.println("Course Name : "+course.courseName);
		  }
		CourseManager courseManager =new CourseManager();
		courseManager.add(course3);
		
		
		

	}

}
