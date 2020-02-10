package cooperation;

public class TakeTransTest {

	public static void main(String[] args) {
		
		Student studentJ = new Student("James", 5000);
		Student studentT = new Student("Tom", 15000);
		Student studentE = new Student("Edward", 100000);
		
		Bus bus100 = new Bus(100);
		Bus bus500 = new Bus(500);
		Subway subwayGreen = new Subway(2);
		Subway subwayBlue = new Subway(4);
		Taxi taxi1 = new Taxi(1);
		
		studentJ.takeBus(bus100);
		studentT.takeSubway(subwayBlue);
		studentE.takTaxi(taxi1);
		
		
		studentJ.showInfo();
		studentT.showInfo();
		studentE.showInfo();
		
		bus100.showBusInfo();
		bus500.showBusInfo();
		subwayBlue.showSubwayInfo();
		subwayGreen.showSubwayInfo();
		taxi1.showTaxiInfo();

	}

}
