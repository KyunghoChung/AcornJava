package day10.review;

import day10.review.Employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp = new Employee(1, "홍길동", 1000.0, 12);
        int empNo = emp.getEmpNo();
        String name = emp.getName();
        double sal = emp.getSalary();
        int deptNo = emp.getDeptNo();

        double salaryForYear = emp.getSalaryForYear();

        System.out.printf("%d번 부서의 사번 %d번 %s님의 급여는 %.1f 원이고, 연봉은 %.1f 원입니다.", deptNo, empNo, name, sal, salaryForYear);
    }



}
