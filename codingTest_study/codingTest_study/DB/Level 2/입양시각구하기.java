
public class 입양시각구하기 {
	
// 문제
// 보호소에서는 몇 시에 입양이 가장 활발하게 일어나는지 알아보려 합니다. 
// 09:00부터 19:59까지, 각 시간대별로 입양이 몇 건이나 발생했는지 조회하는 
// SQL문을 작성해주세요. 이때 결과는 시간대 순으로 정렬해야 합니다.
	
	// ORACLE
	
	SELECT 
			TO_CHAR(DATETIME,'HH24') AS HOUR, 
			COUNT(DATETIME) AS COUNT
		FROM 
			ANIMAL_OUTS WHERE TO_CHAR(DATETIME,'HH24') BETWEEN 9 AND 19
		GROUP BY 
			TO_CHAR(DATETIME,'HH24') 
		ORDER BY 
			TO_CHAR(DATETIME,'HH24');
	
	
	// TO_CHAR - 날짜, 숫자의 값을 문자열로 변환해주는 함수

}
