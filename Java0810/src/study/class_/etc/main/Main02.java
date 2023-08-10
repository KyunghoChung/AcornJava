package study.class_.etc.main;

import study.class_.etc.Book02;

public class Main02 {
    public static void main(String[] args) {
        Book02 book = Book02.builder()
            .title("꿀벌의 예언")
            .author("베르나르베르베르")
            .description("인류의 미래를 둘러싸고 펼쳐지는 대모험")
            .build();

        System.out.println(book);
    }
}
