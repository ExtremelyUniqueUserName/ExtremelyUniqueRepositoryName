package org.usfirst.frc.team2557.robot.subsystems;

import org.usfirst.frc.team2557.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Solenoid_Intake extends Subsystem {
	
	public void intakeArm2(){
		if(RobotMap.solenoid1.get() == Value.kReverse){
			RobotMap.solenoid1.set(Value.kForward);
		}
		else{
			RobotMap.solenoid1.set(Value.kReverse);
	}
		}

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

