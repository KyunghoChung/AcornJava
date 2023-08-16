package day10.professor;

public class Employee {
    private int empNo;
    private String name;
    private double salary;
    private int deptno;

    public Employee() {}

    public Employee(int empNo, String name, double salary, int deptno) {
        super();
        this.empNo = empNo;
        this.name = name;
        this.salary = salary;
        this.deptno = deptno;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public double getSalaryForYear() {
        return (getSalary() * 12) + (getSalary() * 1.3);
    }


}
