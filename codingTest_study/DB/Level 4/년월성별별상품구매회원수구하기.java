
public class 년월성별별상품구매회원수구하기 {
	
	// 230809
	// 문제
	// USER_INFO 테이블과 ONLINE_SALE 테이블에서 년, 월, 성별 
	// 별로 상품을 구매한 회원수를 집계하는 SQL문을 작성해주세요. 결과는 년, 월, 성별을 
	// 기준으로 오름차순 정렬해주세요. 이때, 성별 정보가 없는 경우 결과에서 제외해주세요.
	
	// MYSQL
	SELECT
    	DATE_FORMAT(OS.SALES_DATE, '%Y') AS YEAR,
    	MONTH(OS.SALES_DATE) AS MONTH,
    	UI.GENDER AS GENDER,
    	COUNT(DISTINCT(UI.USER_ID)) AS USERS
    FROM
    	USER_INFO UI INNER JOIN ONLINE_SALE OS
    ON 
    	UI.USER_ID = OS.USER_ID
    WHERE
    	GENDER IS NOT NULL
    GROUP BY
    	YEAR, MONTH, GENDER
    ORDER BY
    	YEAR, MONTH, GENDER ASC;
	
	
	// ORACLE
	SELECT
    	TO_CHAR(OS.SALES_DATE, 'YYYY') AS YEAR,
    	TO_NUMBER(TO_CHAR(OS.SALES_DATE, 'MM')) AS MONTH,
    	UI.GENDER AS GENDER,
    	COUNT(DISTINCT(UI.USER_ID)) AS USERS
    FROM
    	USER_INFO UI INNER JOIN ONLINE_SALE OS
    ON
    	UI.USER_ID = OS.USER_ID
    WHERE
    	GENDER IS NOT NULL
    GROUP BY 
    	TO_CHAR(SALES_DATE, 'YYYY'), TO_CHAR(SALES_DATE, 'MM'), GENDER
    ORDER BY
    	YEAR, MONTH, GENDER ASC;
	
	// TO_CHAR() 날짜 또는 숫자를 문자로 형 변환한다
	// TO_NUMBER() 데이터형이 숫자가 아니라 문자인 데이터를 숫자 데이터형으로 바꿔줌
	// TO_DATE() 데이터형이 날짜가 아니라 문자인 데이터를 날짜 데이터형으로 바꿔줌

}
