
public class MainClass {

	public static void main(String[] args) {
		// Phone p = new Phone(); ������ �.�. ����� �����������
		
		Nokia3310 nokia = new Nokia3310();
		System.out.println("Nokia3310 screent size: " + nokia.getScreenSize());
		nokia.call("123-45-67");
		nokia.sendSMS("567-78-89", "text message");

		System.out.println("Nokia3310 number of Call: " + nokia.numberOfCall);
		System.out.println("Nokia3310 number of SMS: " + nokia.numberOfSMS);

		System.out.println("----------------------------------");

		IPhone5 iphone5 = new IPhone5();
		System.out.println("IPhone screent size: " + iphone5.getScreenSize());
		iphone5.call("123-45-67");
		iphone5.call("123-45-67");
		iphone5.call("123-45-67");
		iphone5.sendSMS("567-78-89", "text message");

		System.out.println("IPhone5 number of Call: " + iphone5.numberOfCall);
		System.out.println("IPhone5 number of SMS: " + iphone5.numberOfSMS);



		System.out.println("----------------------------------");

		IPhone iphone = new IPhone();
		System.out.println("IPhone screent size: " + iphone.getScreenSize());
		iphone.call("123-45-67");
		iphone.call("123-45-67");
		iphone.sendSMS("567-78-89", "text message");

		System.out.println("IPhone number of Call: " + iphone.numberOfCall);
		System.out.println("IPhone number of SMS: " + iphone.numberOfSMS);



		System.out.println("----------------------------------");
		


		SamsungS4 SamsungS4 = new SamsungS4();
		System.out.println("SamsungS4 screent size: " + SamsungS4.getScreenSize());
		//SamsungS4.call("123-45-67");
		SamsungS4.sendSMS("567-78-89", "text message");


		System.out.println("SamsungS4 number of Call: " + SamsungS4.numberOfCall);
		System.out.println("SamsungS4 number of SMS: " + SamsungS4.numberOfSMS);

	}
}
