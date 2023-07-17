public class Student extends Abstractss implements Stringss {
    private String NameTeacher;

    public Student() {
    }
    public Student(String name, int age, Role role, String nameTeacher) {
        super(name, age, role);
        this.NameTeacher = nameTeacher;
    }

    public String getNameTeacher() {
        return NameTeacher;
    }

    public void setNameTeacher(String nameTeacher) {
        NameTeacher = nameTeacher;
    }


    @Override
    public String toString() {
        return "Student:" + "\n" + super.toString();
    }

    @Override
    public boolean roles(Role role) {
        if (getRole().equals(role)) {
            return true;
        } else {
            return false;
        }
    }
}
