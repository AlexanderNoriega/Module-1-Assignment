import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Seat seat1 = new Seat(1);
		Seat seat2 = new Seat(2);
		Seat seat3 = new Seat(3);
		Seat seat4 = new Seat(4);
		Seat seat5 = new Seat(5);
		
		Attendent attendent = new Attendent();
		int x = 1;
		while (x == 1) {
			System.out.println("0 for Seat, 1 for Attendent, 2 to checks seats, 3 to exit");
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			if (i == 0) {
				System.out.println("Which seat will call?");
				//Scanner sc = new Scanner(System.in);
				int q = sc.nextInt();
				if (q == 1) {
					seat1.call();
				}
				if (q == 2) {
					seat2.call();
				}
				if (q == 3) {
					seat3.call();
				}
				if (q == 4) {
					seat4.call();
				}
				if (q == 5) {
					seat5.call();
				}
			}
			if (i == 1) {
				System.out.println("Which seat will the attendent turn off");
				int p = sc.nextInt();
				if (p == 1) {
					attendent.turnOff(seat1);
				}
				if (p == 2) {
					attendent.turnOff(seat2);
				}
				if (p == 3) {
					attendent.turnOff(seat3);
				}
				if (p == 4) {
					attendent.turnOff(seat4);
				}
				if (p == 5) {
					attendent.turnOff(seat5);
				}
			}
			if (i == 2) {
				System.out.println(seat1.isOn());
				System.out.println(seat2.isOn());
				System.out.println(seat3.isOn());
				System.out.println(seat4.isOn());
				System.out.println(seat5.isOn());
			}
			if (i == 3) {
				x++;
			}
		}
			
	}
}
