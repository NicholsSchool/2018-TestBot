package org.usfirst.frc.team4930.robot.subsystems;

import org.usfirst.frc.team4930.robot.RobotMap;

import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Potentiometer extends Subsystem {

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

	public void reset() {
		RobotMap.pot = new AnalogPotentiometer(0);
	}
	
	@Override
	public void periodic() {
		
	}
	
}
