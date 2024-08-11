import java.util.*;
class employee
{
    private String fname;
    private String lname;
    private Double salary;
    public employee()
    {
        salary = 0.0;
    }
    public void setname(String fname,String lname)
    {
        this.fname=fname;
        this.lname=lname;
    }
    public void setsalary(Double salary)
    {
        this.salary=salary;
    }
    public String getfname()
    {
        return fname;
    }
    public String getlname()
    {
        return lname;
    }
    public Double getsalary()
    {
        return salary;
    }
    public Double raise(Double salary)
    {
        Double sal = salary+(salary*0.1);
        return sal;
    }
}
class practical_12
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        employee e1 = new employee();
        employee e2 = new employee();
        String fname1,fname2;
        String lname1,lname2;
        Double salary1,salary2;
        System.out.println("Enter first employee first name : ");
        fname1 = sc.nextLine();
        System.out.println("Enter first employee last name : ");
        lname1 = sc.nextLine();
        System.out.println("Enter your salary : ");
        salary1 = sc.nextDouble();
        e1.setname(fname1,lname1);
        e1.setsalary(salary1);
        e1.raise(salary1);
        System.out.println("Raise of salary of first employee has been done");
        System.out.println("Enter second employee first name : ");
        fname2 = sc.next();
        System.out.println("Enter second employee last name : ");
        lname2 = sc.next();
        System.out.println("Enter your salary : ");
        salary2 = sc.nextDouble();
        e2.setname(fname2,lname2);
        e2.setsalary(salary2);
        e2.raise(salary2);
        System.out.println("Raise of salary of first employee has been done");
        String fna,lna;
        Double sa;
        System.out.println("For displaying ");
        fna = e1.getfname();
        lna = e1.getlname();
        sa = e1.getsalary();
        System.out.println("First name : "+fna);
        System.out.println("Last name : "+lna);
        System.out.println("Salary : "+sa);
        System.out.println("For second employee ");
        fna = e2.getfname();
        lna = e2.getlname();
        sa = e2.getsalary();
        System.out.println("First name : "+fna);
        System.out.println("Last name : "+lna);
        System.out.println("Salary : "+sa);
    }
}
