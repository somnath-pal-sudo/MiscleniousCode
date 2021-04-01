import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class RobotClassConcept {

	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		
		
		String command= "C:\\Windows\\system32\\Notepad.exe";
		Runtime run= Runtime.getRuntime();
		run.exec(command);
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_A);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_S);
		r.keyPress(KeyEvent.VK_CAPS_LOCK);
		Thread.sleep(2000);
		
		
		

	}

}
