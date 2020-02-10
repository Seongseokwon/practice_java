package coffe;

public class CoffeTest {

	public static void main(String[] args) {
		Person personK = new Person("Kim", 20000);
		Person personL = new Person("Lee", 300000);
		StarCoffe starCoffe = new StarCoffe();
		BeanCoffe beanCoffe = new BeanCoffe();
		
		
		personK.buyStarCoffe(starCoffe, 4500);
		personL.buyBeanCoffe(beanCoffe, 3800);

	}

}
