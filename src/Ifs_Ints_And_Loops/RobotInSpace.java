package Ifs_Ints_And_Loops;
import java.applet.AudioClip;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import javax.swing.JApplet;
import org.jointheleague.graphical.robot.Robot;
public class RobotInSpace implements KeyEventDispatcher {
	Robot Zander = new Robot("mini");
	private void MoveRobot(int KeyPressed) throws InterruptedException {
		System.out.println(KeyPressed);
		if (KeyPressed == 38) {
			Zander.setAngle(0);
			Zander.microMove(1);
		}
		if (KeyPressed == 40) {
			Zander.setAngle(180);
			Zander.microMove(1);
		}
		if (KeyPressed == 37) {
			Zander.setAngle(-90);
			Zander.microMove(1);
		}
		if (KeyPressed == 39) {
			Zander.setAngle(90);
			Zander.microMove(1);
		}
	}
	private void CheckIfR2D2Found() throws Exception {
		int RobotLocationX = Zander.getX();
		int RobotLocationY = Zander.getY();
		if (RobotLocationX <= 7300 && RobotLocationX >= 720 && RobotLocationY >= 150 && RobotLocationY <= 160)
			PlayEureka();
	}
	public static void main(String[] args) {
		new RobotInSpace().ControlTheRobot();
	}
	private void ControlTheRobot() {
		KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this);
		Robot.setWindowImage("Planet.jpg");
		Zander.penUp();
		Zander.setSpeed(10);
	}
	public boolean dispatchKeyEvent(KeyEvent E) {
		if (E.getID() == KeyEvent.KEY_PRESSED) {
			try {
				MoveRobot(E.getKeyCode());
			} catch (InterruptedException E1) {
				E1.printStackTrace();
			}
			try {
				CheckIfR2D2Found();
			} catch (Exception Exception) {
			}
		}
		return false;
	}
	public void PlayEureka() {
		System.out.println("Eureka!");
		try {
			AudioClip Sound = JApplet.newAudioClip(getClass().getResource("R2D2-Eureka.wav"));
			Sound.play();
			Thread.sleep(3400);
		} catch (Exception Ex) {
			Ex.printStackTrace();
		}
	}
}
