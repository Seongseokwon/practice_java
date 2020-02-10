package coffe;

public class Person {
	
	
	String personName;
	int money;
	
	public Person(String personName, int money) {
		this.personName = personName;
		this.money = money;
	}
	
	public void buyStarCoffe(StarCoffe sCoffe, int money) {
		String message = sCoffe.takeMoney(money);
		if(message != null) {
			this.money -=money;
			System.out.println(personName +"는" + money +"원을 내고 "+ message);
		}
	}
	
	public void buyBeanCoffe(BeanCoffe bCoffe, int money) {
		String message = bCoffe.takeMoney(money);
			if(message != null) {
				this.money = money;
				System.out.println(personName +"는" + money +"원을 내고 " +message);
		}
	}
}

