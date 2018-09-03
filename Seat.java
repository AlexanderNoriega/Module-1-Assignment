
public class Seat {
	
	int seatNumber;
	boolean lightOn = false;
	
	Seat(int Location){
		seatNumber = Location;		
	}
	
	boolean isOn() {
		if(lightOn) {
			return true;
		}
		else {
			return false;
		}
	}
	
	void call() {
		lightOn = true;
	}
}
