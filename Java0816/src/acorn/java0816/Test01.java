package acorn.java0816;

import java.util.*;

public class Test01 {
    private static final int FAIR_STOCK = 4;

    public static void main(String[] args) {
        int currentStock = 0;
        Random random = new Random();

        for (int i = 1; i <= 10; i++) {
            System.out.println("반복 " + i);
            System.out.println("현재 재고: " + currentStock);

            if (currentStock < FAIR_STOCK) {
                int replenishAmount = FAIR_STOCK - currentStock;
                System.out.println("보충량: " + replenishAmount);
                currentStock += replenishAmount;
            }

            // 0부터 현재 재고의 두 배까지 랜덤 값을 생성
            int soldAmount = random.nextInt(currentStock * 2 + 1); // 0부터 currentStock 사이의 랜덤 값 생성
            System.out.println("판매량: " + soldAmount);
            currentStock -= soldAmount;

            // 재고가 음수 값이 되면 재고 즉시 보충
            if (currentStock < 0) {
                System.out.println("재고가 음수가 되었습니다. 공정 재고로 보충합니다.");
                currentStock = FAIR_STOCK;
            }

            System.out.println("업데이트된 재고: " + currentStock);
            System.out.println("-----------------------------------");
        }
    }

}