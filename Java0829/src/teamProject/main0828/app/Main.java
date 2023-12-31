package teamProject.main0828.app;

import teamProject.main0828.model.Product;
import teamProject.main0828.service.ProductManager;
import teamProject.main0828.service.Cart;
import teamProject.main0828.service.MenuManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        Cart cart = new Cart(); // Cart 객체 생성
        MenuManager menuManager = new MenuManager(scanner, productManager, cart);

        // 상품 정보 초기화
        productManager.addProduct(new Product("티셔츠", 20000, 100));
        productManager.addProduct(new Product("청바지", 35000, 100));
        productManager.addProduct(new Product("맨투맨", 30000, 100));
        productManager.addProduct(new Product("슬랙스", 25000, 100));
        // ...

        // 사용자 인터페이스 예시
        while (true) {
            menuManager.displayMainMenu();
            int choice = scanner.nextInt();
            menuManager.runMenu(choice); // 선택한 메뉴 실행

        }
    }
}