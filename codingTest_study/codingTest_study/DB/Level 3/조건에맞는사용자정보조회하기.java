
public class 조건에맞는사용자정보조회하기 {
	
	// 230726
	// 문제
	// USED_GOODS_BOARD와 USED_GOODS_USER 테이블에서 중고 거래 게시물을 
	// 3건 이상 등록한 사용자의 사용자 ID, 닉네임, 전체주소, 전화번호를 조회하는 
	// SQL문을 작성해주세요. 이때, 전체 주소는 시, 도로명 주소, 상세 주소가 함께 출력되도록 
	// 해주시고, 전화번호의 경우 xxx-xxxx-xxxx 같은 형태로 하이픈 문자열(-)을 삽입하여 
	// 출력해주세요. 결과는 회원 ID를 기준으로 내림차순 정렬해주세요.
	
	// MYSQL
	SELECT
    		U.USER_ID,
    		U.NICKNAME,
    		CONCAT_WS(" ",U.CITY, U.STREET_ADDRESS1, U.STREET_ADDRESS2) AS '전체주소',
    		CONCAT_WS("-", SUBSTRING(U.TLNO, 1, 3), SUBSTR(U.TLNO, 4, 4), RIGHT(U.TLNO, 4)) AS '전화번호'
    FROM
    	USED_GOODS_BOARD B INNER JOIN USED_GOODS_USER U
    ON
    	B.WRITER_ID = U.USER_ID
    GROUP BY
    	B.WRITER_ID
    HAVING 
    	COUNT(B.WRITER_ID) >= 3
    ORDER BY
    	U.USER_ID DESC;
    	
    
    // 나는 CONCAT만 알았는데 CONCAT_WS가 있는건 처음 알았다
    // CONCAT(문자열1, 문자열2,...) 문자열을 합치는 함수
    // CONCAT_WS(구분자, 문자열1, 문자열2,...) 
    // 둘 이상의 문자열이나 둘 이상의 컬럼 값을 반복되는 구분자를 넣고 순서대로 합쳐서 반환해주는 함수
    // SUBSTRING(문자열 또는 컬럼이름, 시작위치, 길이)
    // 문자열에서 시작 위치부터 길이만큼 출력
    	
    // ORACLE
    	SELECT
        	USER_ID,
        	NICKNAME,
        	CITY||' '||STREET_ADDRESS1||' '||STREET_ADDRESS2 AS 전체주소,
        	SUBSTR(TLNO, 0, 3)||'-'||SUBSTR(TLNO, 4, 4)||'-'||SUBSTR(TLNO, 8, 4) AS 전화번호
       FROM
       		USED_GOODS_USER 
       WHERE
       		USER_ID IN (SELECT WRITER_ID 
    					FROM USED_GOODS_BOARD
    					GROUP BY WRITER_ID
    					HAVING COUNT(*) >= 3)
       ORDER BY
       		USER_ID DESC;
    
    // JOIN이 잘 안되서 서브쿼리를 사용
}
