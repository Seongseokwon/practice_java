package coffe;

public class StarCoffe {
	
	int money;
	int starAmericano = 4000;
	int starLatte = 4500;
	
	
	public String takeMoney(int money) {
		this.money += money;
		if(money == starAmericano) {
			return "�� �ٹ� �Ƹ޸�ī�븦 �����߽��ϴ�.";
		}else if( money == starLatte) {
			return "�� �ٹ� �󶼸� �����߽��ϴ�";
		}else {
			return null;
		}
	}

}
