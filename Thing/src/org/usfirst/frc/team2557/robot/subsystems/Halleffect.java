package org.usfirst.frc.team2557.robot.subsystems;
import org.usfirst.frc.team2557.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Halleffect extends Subsystem {
	 
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public void whatever(){
		RobotMap.variable = RobotMap.halleffect.get(); 
	}
    public void initDefaultCommand() {
       RobotMap.variable = RobotMap.halleffect.get(); 
       // Set the default command for a subsystem here.
       //setDefaultCommand(new MySpecialCommand());
    }
}

