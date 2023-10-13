
public class 저자별카테고리별매출액집계하기 {
	
	// 230818
	// 문제
	// 2022년 1월의 도서 판매 데이터를 기준으로 저자 별, 
	// 카테고리 별 매출액(TOTAL_SALES = 판매량 * 판매가) 을 구하여, 
	// 저자 ID(AUTHOR_ID), 저자명(AUTHOR_NAME), 카테고리(CATEGORY), 
	// 매출액(SALES) 리스트를 출력하는 SQL문을 작성해주세요.
	// 결과는 저자 ID를 오름차순으로, 저자 ID가 같다면 카테고리를 내림차순 정렬해주세요.
	
	// MYSQL
	
	SELECT
	    B.AUTHOR_ID,
	    A.AUTHOR_NAME,
	    B.CATEGORY,
	    SUM(BS.SALES * B.PRICE) AS TOTAL_SALES
	FROM
	    AUTHOR A INNER JOIN BOOK B
	ON
	    A.AUTHOR_ID = B.AUTHOR_ID
	INNER JOIN BOOK_SALES BS
	ON
	    B.BOOK_ID = BS.BOOK_ID
	WHERE
	    BS.SALES_DATE LIKE '2022-01%'
	GROUP BY
	    A.AUTHOR_NAME, B.CATEGORY
	ORDER BY
	    B.AUTHOR_ID ASC, B.CATEGORY DESC;
	
	// 점점 쿼리 쓰는 속도가 빨리지는 거 같당
	
	// ORACLE
	SELECT
	    B.AUTHOR_ID,
	    A.AUTHOR_NAME,
	    B.CATEGORY,
	    SUM(BS.SALES * B.PRICE) AS TOTAL_SALES
	FROM
	    AUTHOR A INNER JOIN BOOK B
	ON
	    A.AUTHOR_ID = B.AUTHOR_ID
	INNER JOIN BOOK_SALES BS
	ON
	    B.BOOK_ID = BS.BOOK_ID
	WHERE
	    TO_CHAR(BS.SALES_DATE,'yyyymm') = '202201'
	GROUP BY
	    B.AUTHOR_ID, A.AUTHOR_NAME, B.CATEGORY
	ORDER BY
	    B.AUTHOR_ID ASC, B.CATEGORY DESC;

}
