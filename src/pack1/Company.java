package pack1;

public class Company {
    public static void main(String[] args) {
        Department accounts = new Department("Accounts", "account related work", 0);
        Department sales = new Department("Sales", "Handles the sales data of the company",
                0);

        Employee e1 = new Employee("Alex Mason", "N/a", sales, "Manager", "S001");
        Employee e2 = new Employee("Ravi Prasant", "Kanpur", sales, "Asst. Manager", "S002");
        Employee e3 = new Employee("Ajay Kumar", "kanpur", sales, "Assitant", "S003");

        sales.totalEmp = 3;

        Employee e4 = new Employee("Akash Pal", "Lko", accounts, "S.o", "Aoo1");
        Employee e5 = new Employee("King Josh", "Lko", accounts, "Asstt.Manager 1", "Aoo2");
        Employee e6 = new Employee("King Philip", "Lko", accounts, "Asstt.Manager 2", "Aoo3");
        accounts.totalEmp = 3;

        sales.show();
        e1.show();
        e2.show();
        e3.show();
        accounts.show();
        e4.show();
        e5.show();
        e6.show();

    }
}
