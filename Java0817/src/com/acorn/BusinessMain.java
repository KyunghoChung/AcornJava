package com.acorn;

import java.util.Scanner;

public class BusinessMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        OrderGoods bm = new OrderGoods();

        for(int i = 0; i < 2 ; ++i){
            int iCurrentStock1 = OrderGoods.goodsStockProcess(
                    bm.getiCurrentStock1(), bm.getiProperStock1(), sc);
            bm.setiCurrentStock1(iCurrentStock1);

            int iCurrentStock2 = OrderGoods.goodsStockProcess(
                    bm.getiCurrentStock2(), bm.getiProperStock2(), sc);
            bm.setiCurrentStock2(iCurrentStock2);
        }

//
//        for(int i = 0; i < 2; ++i) {
//            iCurrentStock1 = OrderGoods.goodsStockProcess(iCurrentStock1, iProperStock1, sc);
//            iCurrentStock2 = OrderGoods.goodsStockProcess(iCurrentStock2, iProperStock2, sc);
//        }
//
//
        System.out.println("====================================");
        bm.printStock(bm.getiProperStock1(), bm.getiProperStock2(), bm.getiCurrentStock1(), bm.getiCurrentStock2());

        sc.close();

//		int ret01 = add(10, 20);
//		int ret02 = ret01 - 5;
//		System.out.println(ret02);

    }

//	public static int add(int a, int b) { int c = a + b; System.out.println(c);  return c;}








}

