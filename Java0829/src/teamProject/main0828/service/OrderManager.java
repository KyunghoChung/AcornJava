package teamProject.main0828.service;

import teamProject.main0828.service.Cart;
import teamProject.main0828.model.CartItem;
import teamProject.main0828.model.Order;
import java.util.ArrayList;

public class OrderManager {
    public void placeOrder(Cart cart) {
        Order order = new Order(cart.getItems()); // 주문 객체 생성
        System.out.println("총 주문 금액: " + order.getTotalPrice() + "원");
        System.out.println("주문이 완료되었습니다");
        order.completeOrder(); // 주문 완료 후 장바구니 비우기
    }
}