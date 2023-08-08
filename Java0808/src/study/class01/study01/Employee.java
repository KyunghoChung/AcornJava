package study.class01.study01;

public class Employee {
    // 필드(속성) 영역
    int iEmpNo;
    String sEmpName;
    double dEmpSalary;

    // 기본 생성자
    public Employee(){ }

    // 인자를 갖는 생성자
    public Employee(int iEmpNo, String sEmpName, double dEmpSalary){
        this.iEmpNo = iEmpNo;
        this.sEmpName = sEmpName;
        this.dEmpSalary = dEmpSalary;
    }

    // 메서드 영역 - 동적 메서드
    public double getRealSalary(double ratio){
        double resultSalary;
        resultSalary = this.dEmpSalary - (this.dEmpSalary * ratio / 100);

        return resultSalary;
    }
    // Getter/Setter
//    public int getiEmpNo() {return iEmpNo;}
//    public void setiEmpNo(int iEmpNo) {this.iEmpNo = iEmpNo;}
//
//    public String getsEmpName() {return sEmpName;}
//    public void setsEmpName(String sEmpName) {this.sEmpName = sEmpName;}
//
//    public double getdEmpSalary() {return dEmpSalary;}
//    public void setdEmpSalary(double dEmpSalary) {this.dEmpSalary = dEmpSalary;}

}
