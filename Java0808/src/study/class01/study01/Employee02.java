package study.class01.study01;

public class Employee02 {

    public static void main(String[] args) {
        int iEmpNo = 1;
        String sEmpName = "홍길동";
        double dEmpSalary = 1000.0;

        double afterSalary = RealSalary(dEmpSalary, 7.5);
        System.out.println(afterSalary);


    }

    public Employee02(){ }

    public static double RealSalary(double beforeSalary, double ratio){
        double afterSalary;

        afterSalary = beforeSalary - (beforeSalary * ratio / 100);

        return afterSalary;
    }

    public double RealSalary02(double bSal, double ratio){
        double result;

        result = bSal - (bSal * ratio / 100);

        return result;
    }
}
