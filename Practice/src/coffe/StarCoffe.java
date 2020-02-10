package coffe;

public class StarCoffe {
	
	int money;
	int starAmericano = 4000;
	int starLatte = 4500;
	
	
	public String takeMoney(int money) {
		this.money += money;
		if(money == starAmericano) {
			return "별 다방 아메리카노를 구입했습니다.";
		}else if( money == starLatte) {
			return "별 다방 라떼를 구입했습니다";
		}else {
			return null;
		}
	}

}
