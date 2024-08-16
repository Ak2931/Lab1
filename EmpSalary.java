package assignment27;

public class EmpSalary{

    public static void main(String... args)
    {
        Employee[] employees;
        employees = new Employee[5];
        employees[0] = new Employee(101, "yogesh", 65000);
        employees[1] = new Employee(102, "abhi", 78000);
        employees[2] = new Employee(103, "avi", 45000);
        employees[3] = new Employee(104, "abhishek", 72000);
        employees[4] = new Employee(105, "mahesh", 55000);

        double maxSalary = 0;
        String employeeName = " ";

        for (Employee emp : employees)
        {
            if (emp.getSalary() > maxSalary) 
            {
                maxSalary = emp.getSalary();
                employeeName = emp.getName();
            }
        }

        System.out.println("Employee with highest salary: " + employeeName + " with a salary of " + maxSalary);
    }
}

class Employee
{
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public void display() 
    {
        System.out.println("Id: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}