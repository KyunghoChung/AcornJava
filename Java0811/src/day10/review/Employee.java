package day10.review;

public class Employee {
    // 변수 영역 - 필드 영역
    // 접근 제한자(access modifier)
    // blank(같은 폴더 내부), private(클래스 내부), public(클래스 내/외부), protected
    private int empNo;
    private String name;
    private double salary;
    private int deptNo;
    // 함수 영역 - 메소드 영역

    // 생성자: 기본/인자 있는 생성자
    Employee() { }
    Employee(int empNo, String name, double salary, int deptNo){
        this.empNo = empNo;
        this.name = name;
        this.salary = salary;
        this.deptNo =deptNo;
    }
    // Getters/Setters 메소드 - OOP에서의 Data Encryption

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

    public int getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }

    // 일반 메소드
    public double getSalaryForYear(){
        double resultSalary = 0;
        double tax;
        double ratio = 7.0;
        double sal = this.salary;
        tax = 12 * sal * ratio/ 100;
        resultSalary = 12*sal -tax;
        return resultSalary;
    }
    // 정적 메소드

    // (동적) 메소드
}
