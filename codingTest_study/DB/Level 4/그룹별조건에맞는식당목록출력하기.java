
public class 그룹별조건에맞는식당목록출력하기 {
	
	// 230830
	// 문제
	// MEMBER_PROFILE와 REST_REVIEW 테이블에서 리뷰를 가장 많이 작성한 
	// 회원의 리뷰들을 조회하는 SQL문을 작성해주세요. 회원 이름, 리뷰 텍스트, 
	// 리뷰 작성일이 출력되도록 작성해주시고, 결과는 리뷰 작성일을 기준으로 오름차순, 
	// 리뷰 작성일이 같다면 리뷰 텍스트를 기준으로 오름차순 정렬해주세요.
	
	// MYSQL
	SELECT
	    M.MEMBER_NAME,
	    R.REVIEW_TEXT,
	    DATE_FORMAT(R.REVIEW_DATE, "%Y-%m-%d") AS REVIEW_DATE
	FROM
	    REST_REVIEW R INNER JOIN MEMBER_PROFILE M
	ON
	    R.MEMBER_ID = M.MEMBER_ID
	WHERE
	    M.MEMBER_ID = (SELECT MEMBER_ID 
	                    FROM REST_REVIEW
	                   GROUP BY MEMBER_ID
	                   ORDER BY COUNT(MEMBER_ID) DESC LIMIT 1)
	ORDER BY
	    REVIEW_DATE ASC, REVIEW_TEXT ASC;
	
	// ORACLE
	SELECT
	    M.MEMBER_NAME,
	    R.REVIEW_TEXT,
	    TO_CHAR(R.REVIEW_DATE, 'YYYY-MM-DD') AS REVIEW_DATE
	FROM
	    MEMBER_PROFILE M JOIN REST_REVIEW R
	ON
	    M.MEMBER_ID = R.MEMBER_ID
	WHERE
	    M.MEMBER_ID IN (SELECT MEMBER_ID
	                    FROM REST_REVIEW 
	                   GROUP BY MEMBER_ID
	                   HAVING COUNT(*) = (SELECT MAX(COUNT(*))
	                                        FROM REST_REVIEW
	                                        GROUP BY MEMBER_ID))
	ORDER BY
	        3, 2;
	
	// 오라클은 3,2 로 표현해서 편리하다

}
