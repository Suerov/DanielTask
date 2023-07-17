public class User  extends Abstractss implements Stringss {
    private String Job;

    public User() {
    }

    public User(String name, int age, Role role, String job) {
        super(name, age, role);
        Job = job;
    }

    public String getJob() {
        return Job;
    }

    public void setJob(String job) {
        Job = job;
    }

    @Override
    public String toString() {
        return "User:" +"\n"+super.toString();
    }

    @Override
    public boolean roles(Role role) {
        if (getRole().equals(role)){
        return true;
    }else {
            return false;
        }
    }
}