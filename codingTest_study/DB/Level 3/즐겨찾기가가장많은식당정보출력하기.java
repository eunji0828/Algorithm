
public class 즐겨찾기가가장많은식당정보출력하기 {

	// 230720
	// 문제
	// REST_INFO 테이블에서 음식종류별로 즐겨찾기수가 
	// 가장 많은 식당의 음식 종류, ID, 식당 이름, 즐겨찾기수를 조회하는 SQL문을 작성해주세요. 
	// 이때 결과는 음식 종류를 기준으로 내림차순 정렬해주세요.
	
	SELECT
    		FOOD_TYPE,
    		REST_ID,
    		REST_NAME,
    		FAVORITES
    	FROM 
    		REST_INFO
    	WHERE (FOOD_TYPE, FAVORITES) IN (        // 다중행쿼리에는 IN 사용
    			SELECT FOOD_TYPE, MAX(FAVORITES)
    			FROM REST_INFO
    			GROUP BY FOOD_TYPE)
    	GROUP BY
    		FOOD_TYPE
    	ORDER BY
    		FOOD_TYPE DESC;
	
	
	
	SELECT food_type, rest_id, rest_name, MAX(favorites)
	FROM rest_info
	GROUP BY food_type
	ORDER BY food_type DESC;
	// 위처럼 했을 때 틀린 답이 나오는 이유
	// GROUP BY는 같은 그룹 내의 행들이 임의로 하나의 행으로 합쳐져 보임
	// MAX 함수 사용 시 임의로 생성된 행에 해당 컬럼의 최대값이 추가
	// 하지만 이는 임의로 생성된 행이 FAVORITES 값이 최대값이 아닐 수도 있음
	
}
