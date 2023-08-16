package acorn.java0816;

import java.util.Random;

public class Test01_1 {
    private static final int NUM_PRODUCTS = 4;
    private static final int FAIR_STOCK = 4;

    public static void main(String[] args) {
        int[] currentStocks = new int[NUM_PRODUCTS];
        Random random = new Random();

        for (int i = 0; i < NUM_PRODUCTS; i++) {
            currentStocks[i] = 0; // 각 제품의 현재 재고를 초기화합니다.
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println("반복 " + i);

            for (int productIndex = 0; productIndex < NUM_PRODUCTS; productIndex++) {
                System.out.println("제품 " + productIndex);
                System.out.println("현재 재고: " + currentStocks[productIndex]);

                if (currentStocks[productIndex] < FAIR_STOCK) {
                    int replenishAmount = FAIR_STOCK - currentStocks[productIndex];
                    System.out.println("보충량: " + replenishAmount);
                    currentStocks[productIndex] += replenishAmount;
                }

                int soldAmount = random.nextInt(currentStocks[productIndex] * 2 + 1);
                System.out.println("판매량: " + soldAmount);
                currentStocks[productIndex] -= soldAmount;

                if (currentStocks[productIndex] < 0) {
                    System.out.println("재고가 음수가 되었습니다. 공정 재고로 보충합니다.");
                    currentStocks[productIndex] = FAIR_STOCK;
                }

                System.out.println("재고 업데이트: " + currentStocks[productIndex]);
                System.out.println("--------------------------------");
            }
        }
    }
}
