
public class 조건에맞는사용자와총거래금액조회하기 {
	
	// 230720
	// 문제
	// USED_GOODS_BOARD와 USED_GOODS_USER 테이블에서 
	// 완료된 중고 거래의 총금액이 70만 원 이상인 사람의 회원 ID, 닉네임, 총거래금액을 
	// 조회하는 SQL문을 작성해주세요. 결과는 총거래금액을 기준으로 오름차순 정렬해주세요.
	
	SELECT
    		UGU.USER_ID,
    		UGU.NICKNAME,
    		SUM(UGB.PRICE) AS TOTAL_SALES
    	FROM USED_GOODS_USER UGU INNER JOIN USED_GOODS_BOARD UGB
    	ON 
    		UGU.USER_ID = UGB.WRITER_ID
    	WHERE
        	UGB.STATUS = 'DONE'
        GROUP BY USER_ID, NICKNAME
        HAVING 
        	SUM(UGB.PRICE) >= 700000
        ORDER BY 
        	TOTAL_SALES ASC;
        
    // 서로 참조되는 테이블명이 달라도 참조할 수 있음을 알았당..
    // 꼭 똑같아야 할 줄 알았는데

}
