package study.singleton02;

public class SingleTonTest02 {
    private static SingleTonTest02 instance = null;

    private String name;

    private SingleTonTest02() {}

    private SingleTonTest02(String name) {
        this.name = name;
    }

    public static SingleTonTest02 getInstance(String name) {

        if(instance == null) {
            instance = new SingleTonTest02(name);
            System.out.println("생성한 " + name + "객체를 리턴합니다.");
        } else {
            System.out.println("이미 생성된 " + name + "객체를 리턴합니다.");
        }
        return instance;
    }

//	private String name;
//
//	public SingleTonTest() {}
//
//	public SingleTonTest(String name) {
//		this.name = name;
//	}
}







