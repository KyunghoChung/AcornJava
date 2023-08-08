package com.acorn;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Study05 {

	public static void main(String[] args) {
		// 5개의 라인을 가진 파일에서 입력한 3개의 검색어와
		// 포함된 라인과 일치하는 검색어의 시작 위치를 알아낸다.
		// 제한 조건
		// 1. 파일처리: BufferedReader(fileReder)사용
		// 2. 검색어: 키보드 입력 받아 배열에 저장
		// 3. 검색어와 그 위치값: 문자열 데이터 타입의 함수 이용
		// 4. 결과: 배열에 저장
		
        String filePath = "file.txt";

        // 검색어를 저장할 배열
        String[] searchTerms = new String[3];

        // 검색어 입력 받기
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < searchTerms.length; i++) {
            System.out.print("검색어 #" + (i + 1) + ": ");
            searchTerms[i] = scanner.nextLine();
        }
        scanner.close();

        // 결과를 저장할 배열
        String[][] results = new String[3][2];

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineNumber = 1;

            while ((line = br.readLine()) != null && lineNumber <= 5) {
                for (int i = 0; i < searchTerms.length; i++) {
                    int index = line.indexOf(searchTerms[i]);
                    if (index != -1) {
                        results[i][0] = line;
                        results[i][1] = Integer.toString(index);
                    }
                }

                lineNumber++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 결과 출력
        for (int i = 0; i < searchTerms.length; i++) {
            if (results[i][0] != null) {
                System.out.println("검색어 '" + searchTerms[i] + "'를 포함한 라인: " + results[i][0]);
                System.out.println("검색어의 시작 위치: " + results[i][1]);
            } else {
                System.out.println("검색어 '" + searchTerms[i] + "'를 포함한 라인이 없습니다.");
            }
        }
	}
}
