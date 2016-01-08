package org.usfirst.frc.team2557.robot.subsystems;
import org.usfirst.frc.team2557.robot.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class LeftWheel extends Subsystem {
	public void leftwheel(){
		RobotMap.leftwheel = RobotMap.leftwheelencoder.get();
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

