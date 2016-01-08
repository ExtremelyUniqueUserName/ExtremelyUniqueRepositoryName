package org.usfirst.frc.team2557.robot.subsystems;

import org.usfirst.frc.team2557.robot.Robot;
import org.usfirst.frc.team2557.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
	public void adrive(){
		RobotMap.DriveTrain.arcadeDrive(Robot.oi.joystick);
	}
    public void bdrive(){
    	while(RobotMap.leftwheel < 15 && RobotMap.rightwheel < 15)
		RobotMap.DriveTrain.arcadeDrive(1, 0);
			
		}
 
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

