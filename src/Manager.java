public class Manager extends  Abstractss  implements Stringss {
    private String Company;

    public Manager() {
    }

    public Manager(String name, int age, Role role, String company) {
        super(name, age, role);
        Company = company;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    @Override
    public String toString() {
        return "Manager:" +"\n"+super.toString();
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
