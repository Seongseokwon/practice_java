package coffe;

public class BeanCoffe {
	
	int money;
	int beanAmericano = 3800;
	int beanLatte = 4500;
	
	public String takeMoney(int money) {
		this.money = money;
		if(money == beanAmericano) {
			return "�� �ٹ� �Ƹ޸�ī�븦 �����ϼ̽��ϴ�";
		}else if(money == beanLatte) {
			return "�� �ٹ� �󶼸� �����ϼ̽��ϴ�";
		}else {
			return null;
		}
		
	}
}
