package maybegame;

public class Taxi {
 int taxiNumber;
 int passenger;
 int money;
 
 public Taxi( int taxiNumber1) {
	 this.taxiNumber = taxiNumber1;
 }
 public void take(int money1) {
	 this.money +=money1;
	 passenger++;
 }
 public void showInfo() {
	System.out.println(taxiNumber+"의 승객은 "+passenger+
			"명이고, 수입은 "+money+"원이다");
}
}
