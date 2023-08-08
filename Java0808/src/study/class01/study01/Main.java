package study.class01.study01;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        System.out.println(emp);
        System.out.println(emp.iEmpNo);
        System.out.println(emp.sEmpName);
        System.out.println(emp.dEmpSalary);

        Employee emp2 = new Employee(1, "홍길동", 1000.0);
        System.out.println(emp2);
        System.out.println(emp2.iEmpNo);
        System.out.println(emp2.sEmpName);
        System.out.println(emp2.dEmpSalary);

        System.out.println(emp2.getRealSalary(7.5));
    }
}
