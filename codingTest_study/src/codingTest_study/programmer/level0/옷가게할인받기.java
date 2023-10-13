package codingTest_study.programmer.level0;

public class 옷가게할인받기 {
	
	// 230810
	// 문제
	// 머쓱이네 옷가게는 10만 원 이상 사면 5%, 
	// 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인해줍니다.
	// 구매한 옷의 가격 price가 주어질 때, 지불해야 할 금액을 return 하도록 
	// solution 함수를 완성해보세요.
	
	 public int solution(int price) {
	        int answer = 0;
	        
	         if( price >= 500000) {
	            answer = (int)(price*0.8);
	        } else if( price >= 300000){
	            answer = (int)(price * 0.9);
	        }else if (price >= 100000){
	            answer = (int)(price * 0.95);
	        } else {
	            answer = price;
	        }
	        
	        return answer;
	    }
	 
	 // 형변환까지 다 했는데도 틀렸던 이유?
	 // if 조건의 순서!
	 // 첫번째부터 내려오며 실행되기 때문에 가장 큰 수를 첫번째 조건으로 주어야 함!

}
