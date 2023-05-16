package encapsulation;

public class StudentDetails {
    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentName("Mareedu Saibabu");
        student.setStudentRollNo(10);
        student.setStudentAge(23);

        System.out.println(student.getStudentName() + student.getStudentRollNo() + student.getStudentAge());
    }
}
