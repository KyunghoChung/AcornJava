package study.class_.inheritance.main;

import study.class_.inheritance.BusinessPerson;
import study.class_.inheritance.Person;

// 상속(inheritance): 상위 클래스의 멤버들을 확장해서 하위 클래스를 설계하는 방법
// 상위 클래스(super class), 부모 클래스(parent class), 기본 클래스(base class)
// 하위 클래스(sub class), 자식 클래스(child class), 유도 클래스(derived class)
// IS-A 관계가 성립할 때, 상속을 사용해서 클래스를 설계
// ex. 회사원은 사람이다/학생은 사람이다
// 자바의 모든 클래스 Object 클래스를 상속함. B(하위) extends A(상위)
// 자바는 다중 상속이 금지되어있다.
// 상속 관계에서의 생성자 호출 순서

public class Main01 {
    public static void main(String[] args) {
//        Person p1 = new Person();
//        System.out.println(p1);
//
//        Person p2 = new Person("직원1");
//        System.out.println(p2);

        BusinessPerson p3 = new BusinessPerson();
        System.out.println(p3);

        BusinessPerson p4 = new BusinessPerson("에이콘", "에어콘");
        System.out.println(p4);


//        person.setName("나피디");
//        person.getName();
//        System.out.println(person);
    }
}
