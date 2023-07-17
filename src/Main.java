
public class Main {
    public static void main(String[] args) {
        User user= new User();
        user.setName("Kanat Turgunovbaev");
        user.setAge(18);
        user.setJob("Moyshik");
        user.setRole(Role.USER);
        System.out.println(user);

        Manager manager= new Manager();
        manager.setName("Mike Tyson");
        manager.setAge(45);
        manager.setCompany("Starbuks");
        manager.setRole(Role.MANAGER);
        System.out.println(manager);

        Admin admin= new Admin();
        admin.setName("Mikle Jeans");
        admin.setAge(122);
        admin.setSalary(23);
        admin.setRole(Role.ADMIN);
        System.out.println(admin.roles(Role.STUDENT));
        System.out.println(admin);

        Student student = new Student();
        student.setName("IronMan");
        student.setAge(34);
        student.setNameTeacher("Elon Mask");
        student.setRole(Role.STUDENT);
        System.out.println(student.roles(Role.STUDENT));
        System.out.println(student);


    }
}