package Task_05;

public abstract class Phone {
	
	protected boolean touch;
	protected boolean hasWifi;
	protected int screenSize;
	protected int number;

	public Phone() {
		System.out.println("Phone constructor");
	}
	
	public boolean isTouch() {
		return touch;
	}
	
	public boolean isHasWifi() {
		return hasWifi;
	}
	
	public int getScreenSize() {
		return screenSize;
	}
	
	public void call(String number) {
		System.out.println("Phone class is calling " + number);
	}

	public void answer(){
		System.out.println("The answer was from number " + number);
	}

	public abstract void sendSMS(String number, String message);
}
