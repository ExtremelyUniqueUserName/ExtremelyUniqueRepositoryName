package org.usfirst.frc.team2557.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.usfirst.frc.team2557.robot.commands.Intake;
import org.usfirst.frc.team2557.robot.commands.Intake2;
import org.usfirst.frc.team2557.robot.commands.Solenoid_Intake_Command;
import org.usfirst.frc.team2557.robot.commands.Winch;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	public Joystick joystick;
	public JoystickButton button1;
	public JoystickButton button2;
	public JoystickButton button3;
	public JoystickButton button4;
	
	public OI(){
	joystick = new Joystick(0);
	button1 = new JoystickButton(joystick, 0);
	button2 = new JoystickButton(joystick, 1);
	button3 = new JoystickButton(joystick, 2);
	button4 = new JoystickButton(joystick, 3);
	
	
	button1.whileHeld(new Intake());
	button2.whileHeld(new Intake2());
	button3.whenPressed(new Winch());
	button4.whenPressed(new Solenoid_Intake_Command());
	//button3.whileheld(new Intake3());
	}
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
}

