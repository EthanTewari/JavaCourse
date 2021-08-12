package pack1;

public class Department {
    public String name;
    public String description;
    public int totalEmp;

    public Department(String name, String description, int totalEmp) {
        this.name = name;
        this.description = description;
        this.totalEmp = totalEmp;
    }

    public void show() {
        System.out.println("DEPT DETAILS");
        System.out.println("Name:" + name);
        System.out.println("Description:" + description);
        System.out.println("Total Emp:" + totalEmp);
    }

    public void increaseEmp() {
        totalEmp += 1;
    }

    public void decreaseEmp() {
        totalEmp -= 1;
    }
}
