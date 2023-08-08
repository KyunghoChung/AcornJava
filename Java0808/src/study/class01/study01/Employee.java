package study.class01.study01;

public class Employee {
    // 필드(속성) 영역
    private int iEmpNo;
    private String sEmpName;
    private double dEmpSalary;

    // 클래스를 작성할 때 생성자를 만들지 않으면
    // 자바 컴파일러가 기본 생성자를 자동으로 생성
    // 생성자 리턴타입이 없고 클래스 이름과 동일
    // 기본 생성자: 필드 값을 필드의 데이터 타입 기본값으로 초기화
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
    public int getiEmpNo() {return iEmpNo;}
    public void setiEmpNo(int iEmpNo) {this.iEmpNo = iEmpNo;}

    public String getsEmpName() {return sEmpName;}
    public void setsEmpName(String sEmpName) {this.sEmpName = sEmpName;}

    public double getdEmpSalary() {return dEmpSalary;}
    public void setdEmpSalary(double dEmpSalary) {this.dEmpSalary = dEmpSalary;}

}
