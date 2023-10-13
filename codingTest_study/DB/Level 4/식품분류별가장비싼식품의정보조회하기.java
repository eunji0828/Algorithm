
public class 식품분류별가장비싼식품의정보조회하기 {
	
	// 230725
	// 문제
	// FOOD_PRODUCT 테이블에서 식품분류별로 가격이 제일 비싼 식품의 분류, 가격, 이름을 
	// 조회하는 SQL문을 작성해주세요. 
	// 이때 식품분류가 '과자', '국', '김치', '식용유'인 경우만 출력시켜 주시고 결과는 
	// 식품 가격을 기준으로 내림차순 정렬해주세요.
	
	// MYSQL
	
	
	SELECT
    		CATEGORY,
    		PRICE AS MAX_PRICE,
    		PRODUCT_NAME
    FROM
    	FOOD_PRODUCT
    	WHERE 
    		(CATEGORY, PRICE) IN  (SELECT CATEGORY, MAX(PRICE)
                           			FROM FOOD_PRODUCT 
                           			GROUP BY CATEGORY 
                           			HAVING CATEGORY IN  ('과자', '국', '김치', '식용유')
                          			)
    ORDER BY
    		MAX_PRICE DESC;
	
	
	
	
	// Oracle
	
	SELECT
    		CATEGORY,
    		PRICE AS MAX_PRICE,
    		PRODUCT_NAME
    FROM
    	FOOD_PRODUCT
    WHERE
    	(CATEGORY, PRICE) IN (SELECT 
    							CATEGORY, 
    							MAX(PRICE) AS MAX_PRICE
    						FROM
                            	FOOD_PRODUCT
                            GROUP BY
                            	CATEGORY
                            HAVING 
                            	CATEGORY IN ('과자', '국', '김치', '식용유')
                      		)
    ORDER BY
    	MAX_PRICE DESC;

}
