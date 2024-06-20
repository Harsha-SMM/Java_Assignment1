public class Oops3 {
    public static void main(String[] args) {
        manager objmanager = new manager();
        objmanager.appraisal();
        objmanager.appraisal(1000, 25000);
        engineer objeng = new engineer();
        objeng.appraisal(30000);
    }
}

class employee {
    public void appraisal() {
        System.out.println("Salary Revision");
    }
}

class manager extends employee {
    public void appraisal(double hike, double salary) {
        double revised = salary + hike;
        System.out.println("Revised salary for Manager is " + revised);
    }
}

class engineer extends employee {
    public void appraisal(double revised_salary) {
        System.out.println("Revised salary of engineer is " + revised_salary);
    }
}