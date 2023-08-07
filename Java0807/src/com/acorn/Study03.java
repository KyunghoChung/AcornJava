package com.acorn;

public class Study03 {

	public static void main(String[] args) {
//		1. 출력메시지 저장: System.out.println()
//			1.1 합격메시지: 축하합니다, 합격입니다!
//				문자열 변수: String sPassMsg
//			1.2 불합격메시지: 불합격입니다.
//				문자열 변수: sFailMsg
//		2. 키보드로: Scanner sc;
//		3. 점수를  입력 받고
//			국어, 영어, 수학 세 과목 점수
//			int iNlScore, iEngScore, iMathScore = 0;
		int iNlScore = 0; int iEngScore = 0; int iMathScore = 0;
//		4. 합계와 평균을 계산
//			4.1 합계: iNlScore + iEngScore + iMathScore
//				4.1.1 합계 저장: int iSum;
		int iSum = 0;
//		 	4.2 평균: iNlScore + iEngScore + iMathScore / 3;
//				4.2.1 평균 저장: int iAvg
		int iAvg = 0;
//		float fAvg = 0.0F;
//		5. 합격 / 불합격 처리
//	 		5.1 합격이면: if(합격이면 -> (세 과목의 점수가 각각 40점 이상이면서) && 평균이 60점 이상일 경우)
//				5.1.1 세 과목의 점수가 각각 40점 이상이면서 
//					국어점수가 40점이상이면서(iNlScore >= 40): 국어점수가 40점미만이거나
//					영어점수가 40점이상이면서(&& iNiEngScore >= 40): 영어점수가 40점미만이거나
//					수학점수가 40점이상이면(&& iMathScore >= 40): 수학점수가 40점미만이면
//				5.1.2 평균이 60점 이상일 경우
//		 	5.2 불합격이면: else
		if( ((iNlScore >= 40) && (iEngScore >= 40) && (iMathScore >= 40)) 
			&& (iAvg >= 60)) {
//			&& (fAvg >= 60.0F)) {
			
		} else {
			
		}


	}

}
