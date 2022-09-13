package Ch06;

public class P178TakeTrans {
	public static void main(String[] args) {
		P175Student studentJames = new P175Student("James", 5000);
		P175Student studentTomas = new P175Student("James", 10000);
		
		P177Bus bus100 = new P177Bus(100);
		studentJames.takeBus(bus100);
		studentJames.showInfo();
		bus100.showInfo();
		
		P178Subway subwayGreen = new P178Subway("2호선");
		studentTomas.takeSubway(subwayGreen);
		studentTomas.showInfo();
		subwayGreen.showInfo();
	}
}
