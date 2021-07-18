package polymorphism3;

public class TVUser {

	public static void main(String[] args) {
		BeanFactory factory = new BeanFactory();
		//TV tv = (TV)factory.getBean(args[0]);
		TV tv = (TV)factory.getBean("lg");
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
	}

}
