public abstract class Abstractss {
    private String Name;
    private int age;
    private Role role;

    public Abstractss() {
    }

    public Abstractss(String name, int age, Role role) {
        Name = name;
        this.age = age;
        this.role = role;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Name:" + Name + "\n" +
                "age:" + age + "\n" +
                "Role:" + role + "\n";
    }
}
