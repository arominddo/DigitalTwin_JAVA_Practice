package ch06;

public class Ex06_21 {

	public static void main(String[] args) {
		MyTv t = new MyTv();
		
		t.channel = 100;
		t.volume = 0;
		System.out.println(t.channel+"///"+t.volume);
		
		t.ChannelDown();
		t.volumeDonw();
		System.out.println(t.channel+"///"+t.volume);
		
		t.volume = 100;
		t.ChannelUp();
		t.volumeDonw();
		System.out.println(t.channel+"///"+t.volume);

	}

}

class MyTv {
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	void turnOnOff( ) {
		isPowerOn = !isPowerOn;
	}
	
	void volumeUp( ) {
		if(volume< MAX_VOLUME)
			volume++;
	}
	
	void volumeDonw() {
		
		if(volume>MIN_VOLUME) {
			volume--;
		}
		
	}
	
	void ChannelUp() {
		if(channel == MAX_CHANNEL) {
			channel = MIN_CHANNEL;
		}
		else {
			channel++;
		}
	}
	
	void ChannelDown() {
		if(channel==MIN_CHANNEL) {
			channel = MAX_CHANNEL;
		}
		else {
			channel--;
		}
		
	}
	
	
	
	
	
	
	
	
	
}