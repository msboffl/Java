package codingNinjasPractice;

class Student {
    // These are Instance Variable
    String name;
    int rollNum;
}

public class StudentRecords {
    public static void main(String[] args) {
        // Creating the Student class Object
        Student obj = new Student();

        obj.name = "Mareedu";
        obj.rollNum = 7;

        System.out.println(obj.name);
        System.out.println(obj.rollNum);

    }
}
