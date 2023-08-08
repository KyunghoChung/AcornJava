package study.class01.study01;

public class Main02 {

    public static void main(String[] args) {
        int iEmpNo = 1;
        String sEmpName = "홍길동";
        double dEmpSalary = 1000.0;

        Employee02 employee = new Employee02(); // Create an instance of Employee02
        double afterSalary = employee.RealSalary02(dEmpSalary, 7.5);
        System.out.println(afterSalary);
    }
}