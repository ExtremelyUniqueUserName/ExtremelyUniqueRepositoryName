package org.usfirst.frc.team2557.robot;

import edu.wpi.first.wpilibj.Counter;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static RobotDrive DriveTrain;
	public static SpeedController motor0;
	public static SpeedController motor1;
	public static SpeedController motor2;
	public static SpeedController motor3;
	public static SpeedController motorintake;
	public static SpeedController motorwinch;
	public static DoubleSolenoid solenoid1;
	public static DoubleSolenoid solenoid2;
	public static DoubleSolenoid solenoid3;
	public static DigitalInput halleffect;
	public static boolean variable;
	public static DoubleSolenoid solenoidIntake;
	public static double encoder;
	public static Counter winchencoder;
	public static double leftwheel;
	public static Counter leftwheelencoder;
	public static double rightwheel;
	public static Counter rightwheelencoder;
	
	

public static void init(){	
	motor0 = new Talon(0);
	motor1 = new Talon(1);
	motor2 = new Talon(2);
	motor3 = new Talon(3);
	motorintake = new Talon(4);
	motorwinch = new Talon(5);
	DriveTrain = new RobotDrive(0, 1, 2, 3);
	solenoid1 = new DoubleSolenoid(0, 2, 3);
	solenoid2 = new DoubleSolenoid(0, 0, 1);
	solenoid3 = new DoubleSolenoid(0, 4, 5);
}
}    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
	// asduhfs hudshuifhs usih dfudsf h idasfad = 1;
	// public static int rangefinderModule = 1;



