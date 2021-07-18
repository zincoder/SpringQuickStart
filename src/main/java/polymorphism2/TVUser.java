package polymorphism2;

public class TVUser {

	public static void main(String[] args) {
		TV samsungTv = new SamsungTV();
		samsungTv.powerOn();
		samsungTv.powerOff();
		samsungTv.volumeUp();
		samsungTv.volumeDown();
		
		TV lgTV = new LgTV();
		lgTV.powerOn();
		lgTV.powerOff();
		lgTV.volumeUp();
		lgTV.volumeDown();
	}

}
