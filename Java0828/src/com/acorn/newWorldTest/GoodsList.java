package com.acorn.newWorldTest;

import java.util.ArrayList;

public class GoodsList {

    public static void main(String[] args) {
        // 상품 정보를 저장리스트 !@~!@!~#!#
        ArrayList<Goods> goodsList = new ArrayList<>();

        // 상품 정보띄
        goodsList.add(new Goods("티셔츠", 20000, "M", " ", "의류", "T001"));
        goodsList.add(new Goods("청바지", 35000, "L", " ", "의류", "J001"));
        goodsList.add(new Goods("운동화", 80000, "250", " ", "의류", "S001"));
        goodsList.add(new Goods("망고", 5000, " ", "소", "과일", "F001"));
        goodsList.add(new Goods("수박", 15000, " ", "대", "과일", "F002"));
        goodsList.add(new Goods("멜론", 9000, " ", "중", "과일", "F003"));
        // 상품 정보 출력

        System.out.println("의류 상품 리스트");
        System.out.println("----------------------------");
        for (Goods goods : goodsList) {
            if (goods.getCategory().equals("의류")) {
                System.out.println("상품명: " + goods.getName());
                System.out.println("가격: " + goods.getPrice() + "원");
                System.out.println("크기: " + goods.getSize());
                System.out.println("상품 코드: " + goods.getCode());
                System.out.println("----------------------------");
            }
        }

        System.out.println("과일 상품 리스트");
        System.out.println("----------------------------");
        for (Goods goods : goodsList) {
            if (goods.getCategory().equals("과일")) {
                System.out.println("상품명: " + goods.getName());
                System.out.println("가격: " + goods.getPrice() + "원");
                System.out.println("무게: " + goods.getWeight());
                System.out.println("상품 코드: " + goods.getCode());
                System.out.println("----------------------------");
            }
        }
    }
}

class Goods {
    private String name;
    private int price;
    private String size;
    private String weight;
    private String code;
    private String category;

    public Goods(String name, int price, String size, String weight, String category, String code) {
        this.name = name;
        this.price = price;
        this.size = size;
        this.weight = weight;
        this.category = category;
        this.code = code;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getSize() {
        return size;
    }

    public String getWeight() {
        return weight;
    }

    public String getCode() {
        return code;
    }
}