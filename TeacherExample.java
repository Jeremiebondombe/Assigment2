public class TeacherExample {
     String teacherName;
     int teacherAge;
     String teacherSubject;

    
 static String schoolName;
     static int totalTeachers;


    public TeacherExample(String teacherName, int teacherAge, String teacherSubject) {
        this.teacherName = teacherName;
        this.teacherAge = teacherAge;
        this.teacherSubject = teacherSubject;
        String studentGrade = "A";
        System.out.println("Student's grade: " + studentGrade);
        totalTeachers++;
    }

    
    public void displayTeacherInfo() {
        System.out.println("Teacher's Name: " + teacherName);
        System.out.println("Teacher's Age: " + teacherAge);
        System.out.println("Teacher's Subject: " + teacherSubject);
    }


    public static void displaySchoolInfo() {
        System.out.println("School Name: " + schoolName);
        System.out.println("Total Teachers: " + totalTeachers);
    }

    
    public void assignGrade(String grade) {
        String assignedGrade = grade;
        System.out.println("Assigned Grade: " + assignedGrade);
    }

    
    static {
        schoolName = "Springfield High School";
    }


    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public int getTeacherAge() {
        return teacherAge;
    }

    public void setTeacherAge(int teacherAge) {
        this.teacherAge = teacherAge;
    }

    public String getTeacherSubject() {
        return teacherSubject;
    }

    public void setTeacherSubject(String teacherSubject) {
        this.teacherSubject = teacherSubject;
    }

    public static void main(String[] args) {
        
        TeacherExample teacher1 = new TeacherExample("John Doe", 35, "Math");
        TeacherExample teacher2 = new TeacherExample("Jane Smith", 30, "Science");

        
        teacher1.displayTeacherInfo();
        teacher2.displayTeacherInfo();

    
        TeacherExample.displaySchoolInfo();

        
        teacher1.assignGrade("B+");
        teacher2.assignGrade("A-");

        
        teacher1.setTeacherSubject("History");
        teacher2.setTeacherAge(31);

    
        teacher1.displayTeacherInfo();
        teacher2.displayTeacherInfo();
    }
}



