class Employee
{
    int id;
    String name;
    double basicSalary;
    double bonus;
    double netWight;

    void setEmployee(int id, String name, double basicSalary)
    {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    void calBonus()
    {
        if (basicSalary > 100000)
        {
            bonus = basicSalary * 10 / 100;
        }
        else
        {
            bonus = basicSalary * 5 / 100;
        }
    }
    void Display()
    {
		netWight = basicSalary + bonus;
		
        System.out.println("Employee ID: " + this.id);
        System.out.println("Employee Name: " + this.name);
        System.out.println("Basic Salary: " + this.basicSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Net Salary: " + netWight);
    }
}


