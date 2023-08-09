package study.access;

public class AccessTest {
    // 필드/속성 영역
    private int a;
    int b;
    public int c;
    protected int d;

    // 생성자: 기본 생성자/인자가 있는 생성자
    public AccessTest() { }

    // Getters/Setters 메서드 영역
    public int getA() {return a;}

    /**
     *
     * @param a:
     */
    public void setA(int a) {this.a = a;}
}
