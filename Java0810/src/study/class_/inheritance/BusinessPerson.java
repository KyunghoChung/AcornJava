package study.class_.inheritance;

public class BusinessPerson extends Person {
    // 필드 영역
    private String company;


    // 생성자 영역
    public BusinessPerson() {
        // super(); <- 부모 클래스를 호출하고 싶을 때(생략 가능)
        System.out.println("BusinessPerson() 생성자");
    }

    public BusinessPerson(String company, String name) {
        super(name);
        System.out.println("BusinessPerson(String company) 생성자");
        this.company = company;
    }

    // 메소드 영역
    // Getter/Setter 영역
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString(){
        return String.format("이름: %s, 회사: %s", this.getName(), this.company);
    }
}
