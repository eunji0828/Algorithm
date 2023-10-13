
public class 대여기록이존재하는자동차리스트구하기 {
	
	// 230724
	// 문제
	//CAR_RENTAL_COMPANY_CAR 테이블과 CAR_RENTAL_COMPANY_RENTAL_HISTORY 테이블에서 
	// 자동차 종류가 '세단'인 자동차들 중 10월에 대여를 시작한 기록이 있는 자동차 ID 리스트를 출력하는 
	// SQL문을 작성해주세요. 
	// 자동차 ID 리스트는 중복이 없어야 하며, 자동차 ID를 기준으로 내림차순 정렬해주세요.
	
	SELECT
    DISTINCT(CRC.CAR_ID)
    FROM
        CAR_RENTAL_COMPANY_CAR CRC INNER JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY CTH
    ON 
        CRC.CAR_ID = CTH.CAR_ID
    WHERE CRC.CAR_TYPE = '세단'
    AND MONTH(CTH.START_DATE) = 10
    ORDER BY CTH.CAR_ID DESC;

	// 월만 기준을 잡으려고 할 때 MONTH()를 쓰는걸 알았다
}
