package study.class_.etc;

public class Book02 {
    // 필드/속성 영역 - 데이터 은닉(Data Encryption)
    private String title;
    private String author;
    private String description;

    // 생성자 영역
    public Book02() { }
    public Book02(String title, String author, String description){
        this.title = title;
        this.author = author;
        this.description = description;
    }
    // Getter/Setter 메소드 영역


    // 메소드
    // 동적 메소드 - 오버라이드 메소드
    @Override
    public String toString(){
        // TODO Auto-generated method stub
        return String.format("Book(title = %s, author = %s, description = %s)", this.title, this.author, this.description);

    }

    // 내부 클래스(inner class)
    public static class BookBuilder{
        // 필드 영역
        private String title; private String author; private String description;
        // 생성자
        public BookBuilder(){ }
        // 메소드 영역
        public BookBuilder title(String title){
            this.title = title;
            return this;
        }
        public BookBuilder author(String author){
            this.author = author;
            return this;
        }
        public BookBuilder description(String description){
            this.description = description;
            return this;
        }
        public Book02 build(){
            return new Book02(title, author, description);
        }
    }
    public static BookBuilder builder(){
        return new BookBuilder();
    }

}
