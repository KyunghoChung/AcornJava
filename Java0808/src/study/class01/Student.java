package study.class01;

public class Student {
// 5개의 블럭으로 나뉜다.
// 1. 속성/필드 영역: 변수 선언
    private String sEntryNum;   // private: 정보 은닉 수단
    private String sName;
    private String sAddress;

// 2. 메서드(함수) 영역: 대부분 public
// 속성/필드를 어떻게 다룰지 방법을 정의함
// 생성자 영역
// 기본(Default) 생성자
    public Student(){

    }
// getter/setter 메서드 영역
//    public String getEntryNum(){
//        return sEntryNum;
//    }
//    public void setEntryNum(String sEntryNum){
//        this.sEntryNum = sEntryNum;
//    }

    public String getsEntryNum() {
        return sEntryNum;
    }

    public void setsEntryNum(String sEntryNum) {
        this.sEntryNum = sEntryNum;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsAddress() {
        return sAddress;
    }

    public void setsAddress(String sAddress) {
        this.sAddress = sAddress;
    }

// 오버라이딩 메서드 영역

// 사용자 정의 메서드 영역(custom 메서드 영역)
// 정적 메서드
// - 객체를 생성하지 X, 클래스 메서드

// 동적(인스턴스/객체) 메서드
// - 객체 메서드
}
