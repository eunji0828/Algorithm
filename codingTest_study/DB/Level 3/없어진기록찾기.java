
public class 없어진기록찾기 {
	
	// 230724
	// 문제
	// 천재지변으로 인해 일부 데이터가 유실되었습니다. 입양을 간 기록은 있는데, 
	// 보호소에 들어온 기록이 없는 동물의 ID와 이름을 ID 순으로 조회하는 SQL문을 작성해주세요.
	
	SELECT
    AO.ANIMAL_ID,
    AO.NAME
    FROM
        ANIMAL_INS AI RIGHT JOIN ANIMAL_OUTS AO
    ON AI.ANIMAL_ID = AO.ANIMAL_ID
    WHERE 
        AI.ANIMAL_ID IS NULL
    ORDER BY AO.ANIMAL_ID, AO.NAME DESC;
	
	// RIGHT JOIN 오른쪽 테이블에 대하여 왼쪽 테이블을 매칭하여 
	// 없으면 NULL 표시가 됨
	// 테이블 JOIN 기준으로 SELECT할 때도 잘 봐야 함

}
