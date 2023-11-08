
public class 식품들의총매출조회하기 {
	
	// 230725
	// 문제
	// FOOD_PRODUCT와 FOOD_ORDER 테이블에서 생산일자가 
	// 2022년 5월인 식품들의 식품 ID, 식품 이름, 총매출을 조회하는 SQL문을 작성해주세요. 
	// 이때 결과는 총매출을 기준으로 내림차순 정렬해주시고 총매출이 같다면 식품 ID를 
	// 기준으로 오름차순 정렬해주세요.
	
	
	// MYSQL
	SELECT 
    		P.PRODUCT_ID,
    		P.PRODUCT_NAME,
    		(P.PRICE * SUM(O.AMOUNT)) AS TOTAL_SALES
    FROM
    	FOOD_PRODUCT P INNER JOIN FOOD_ORDER O 
    ON 
    	P.PRODUCT_ID = O.PRODUCT_ID
    WHERE
    	MONTH(O.PRODUCE_DATE) = 5
    GROUP BY
    	P.PRODUCT_ID
    ORDER BY
    	TOTAL_SALES DESC, P.PRODUCT_ID ASC;
	
	// ORACLE
	SELECT
    	P.PRODUCT_ID, P.PRODUCT_NAME,
    	SUM(O.AMOUNT * P.PRICE) AS TOTAL_SALES
    FROM 
    	FOOD_ORDER O INNER JOIN FOOD_PRODUCT P
    ON 
    	O.PRODUCT_ID = P.PRODUCT_ID
    WHERE 
    	TO_CHAR(PRODUCE_DATE, 'MM') = '05'
    GROUP BY 
    	P.PRODUCT_ID, P.PRODUCT_NAME
    ORDER BY 
    	TOTAL_SALES DESC, P.PRODUCT_ID ASC;
	
	// TO_CHAR 로 많은 걸 할 수 있다
	// 'YYYYMMDD' 에서 내가 검색하고 싶은 것만 골라 검색할 수 있다.

}
