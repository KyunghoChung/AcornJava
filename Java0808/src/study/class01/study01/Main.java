package study.class01.study01;

// OOP(Object-Oriented Programming)
// 객체(개체: Object): new 생성자()
//                   : 클래스가 실행중인(메모리에 올라가있는) 모습
// 클래스: 필드(속성) + 생성자 + 메서드
//       : 텍스트 파일이 존재하는 껍데기
// 인스턴스(Instance): 메모리에 올라가는 과정을 설명할 때 이야기하는 것
// 클래스 선언
// [수식어] class 클래스명 { }
// 수식어 example: 접근지정자(ex. public)
public class Main {
    public static void main(String[] args) {

        Employee employee01 = new Employee(1, "홍길동", 1000.0);

        double dRet = employee01.getRealSalary(7.5);
        System.out.println("실수령액: " + dRet);
//        Employee emp = new Employee();
//        System.out.println(emp);
//        System.out.println(emp.iEmpNo);
//        System.out.println(emp.sEmpName);
//        System.out.println(emp.dEmpSalary);
//
//        Employee emp2 = new Employee(1, "홍길동", 1000.0);
//        System.out.println(emp2);
//        System.out.println(emp2.iEmpNo);
//        System.out.println(emp2.sEmpName);
//        System.out.println(emp2.dEmpSalary);
//
//        System.out.println(emp2.getRealSalary(7.5));
    }
}
