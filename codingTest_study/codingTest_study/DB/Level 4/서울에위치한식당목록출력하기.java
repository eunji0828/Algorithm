
public class 서울에위치한식당목록출력하기 {

	// 230727
	// 문제
	// REST_INFO와 REST_REVIEW 테이블에서 서울에 위치한 식당들의 식당 ID, 
	// 식당 이름, 음식 종류, 즐겨찾기수, 주소, 리뷰 평균 점수를 조회하는 SQL문을 작성해주세요. 
	// 이때 리뷰 평균점수는 소수점 세 번째 자리에서 반올림 해주시고 결과는 평균점수를 기준으로 
	// 내림차순 정렬해주시고, 평균점수가 같다면 즐겨찾기수를 기준으로 내림차순 정렬해주세요.
	
	// MYSQL
	SELECT
    		I.REST_ID,
    		I.REST_NAME,
    		I.FOOD_TYPE,
    		I.FAVORITES,
    		I.ADDRESS,
    		ROUND(AVG(R.REVIEW_SCORE), 2) AS SCORE
    FROM
    		REST_INFO I INNER JOIN REST_REVIEW R
    ON
    		I.REST_ID = R.REST_ID
    WHERE
    		I.ADDRESS LIKE '서울%'
    GROUP BY 
    		I.REST_ID
    ORDER BY
    	SCORE DESC, I.FAVORITES DESC;
	
	
	// ORACLE
	SELECT
    	A.REST_ID,
    	A.REST_NAME,
    	A.FOOD_TYPE,
    	A.FAVORITES,
    	A.ADDRESS,
    	ROUND(AVG(B.REVIEW_SCORE),2) AS SCORE
    FROM
    	REST_INFO A INNER JOIN REST_REVIEW B 
    ON
    	A.REST_ID = B.REST_ID
    WHERE
    	A.ADDRESS like '서울%'
    GROUP BY
    	A.REST_ID,
    	A.REST_NAME,
    	A.FOOD_TYPE,
    	A.FAVORITES,
    	A.ADDRESS
    ORDER BY
    	SCORE DESC, A.FAVORITES DESC
    	
    	// 오라클에서는 SELECT절과 GROUP BY절의 컬럼 수가 같아야 한다!
}
