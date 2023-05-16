package association;

import java.util.ArrayList;
import java.util.List;

class Professor {
    private String name;

    Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

class Department {
    private String name;
    List<Professor> staff;

    Department(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setStaff(List<Professor>staff) {
        this.staff = staff;
    }

    public List<String> getStaff() {
        List<String> prof_names = new ArrayList<>();
        for(Professor prof: this.staff) {
            prof_names.add(prof.getName());
        }
        return prof_names;
    }
}

public class Association {
    public static void main(String[] args) {
        Professor ms = new Professor("Mareedu Saibabu");
        Professor sm = new Professor("Sruthi Madhuri");

        Department ece = new Department("ECE");

        List<Professor> staff_ece = new ArrayList<>();
        staff_ece.add(ms);
        staff_ece.add(sm);

        ece.setStaff(staff_ece);

        System.out.println("The staff of department " + ece.getName() + " is: " + ece.getStaff());
    }

}
