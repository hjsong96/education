package threadex;

import java.awt.Toolkit;

public class Thread01 {
	public static void main(String[] args) throws InterruptedException {
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			Thread.sleep(3000); //3초
			
		}
	}
}
