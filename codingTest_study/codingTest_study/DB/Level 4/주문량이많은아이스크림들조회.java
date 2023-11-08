
public class 주문량이많은아이스크림들조회 {
	
	// 230814
	// 문제
	// 7월 아이스크림 총 주문량과 상반기의 아이스크림 총 주문량을 더한 값이 큰 순서대로 
	// 상위 3개의 맛을 조회하는 SQL 문을 작성해주세요.
	
	// MYSQL
	SELECT
	    F.FLAVOR
	FROM
	    FIRST_HALF F INNER JOIN JULY J
	ON F.FLAVOR = J.FLAVOR
	GROUP BY
	    F.FLAVOR
	ORDER BY
	    SUM(F.TOTAL_ORDER + J.TOTAL_ORDER) DESC
	LIMIT 3;
	
	// ORDER BY에서 SUM을 해도 상관없다..
	// LIMIT은 MYSQL에만 있는 기능
	
	// ORACLE
	SELECT
    F.FLAVOR
	FROM
	    FIRST_HALF F INNER JOIN JULY J
	ON
	    F.FLAVOR = J.FLAVOR
	GROUP BY
	    F.FLAVOR
	ORDER BY
	    SUM(F.TOTAL_ORDER + J.TOTAL_ORDER) DESC
	FETCH FIRST 3 ROWS ONLY;
	
	// FETCH FIRST 3 ROWS ONLY
	// 처음 써보는데 오라클12부터 사용가능이며
	// [ OFFSET 건수 ROW | ROWS]
	// FETCH  NEXT [  row_count | percent PERCENT  ] 건수  [ ONLY | WITH TIES ]
	// ONLY - 내가 지정한 ROW LIMITS 갯수만 리턴
	// WITH TIES - 내가 지정한 ROW LIMITS에서 맨 마지막 행과 같은 SORT KEY인 ROW들도 보여줌
	
}
