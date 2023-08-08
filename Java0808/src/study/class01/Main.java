package study.class01;

public class Main {
    public static void main(String[] args) {
        // 객체 선언하고 초기화: className InstanceName = new className();
        Student student = new Student();
        System.out.println(student);
        // 결과: fullpath@hash값 -> hash값 = 레퍼런스
        String name = student.getsName();
        System.out.println(name);

        student.setsName("홍길동");
        name = student.getsName();
        System.out.println(name);
    }
}
