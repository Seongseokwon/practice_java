package coffe;

public class BeanCoffe {
	
	int money;
	int beanAmericano = 3800;
	int beanLatte = 4500;
	
	public String takeMoney(int money) {
		this.money = money;
		if(money == beanAmericano) {
			return "콩 다방 아메리카노를 구매하셨습니다";
		}else if(money == beanLatte) {
			return "콩 다방 라떼를 구매하셨습니다";
		}else {
			return null;
		}
		
	}
}
