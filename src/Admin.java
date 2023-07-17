public class Admin extends Abstractss implements Stringss {
    private int salary;

    public Admin() {
    }

    public Admin(String name, int age, Role role, int salary) {
        super(name, age, role);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Admin:"+"\n"+super.toString();
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