package Interface;

public class DemoB extends DemoC implements DemoA {
	public void run() {
		System.out.println("Running interface");
	}
	public void jump() {
		System.out.println("Jumping class implements");
	}
}
