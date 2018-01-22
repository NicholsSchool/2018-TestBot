package org.usfirst.frc.team4930.robot.subsystems;

import org.usfirst.frc.team4930.robot.RobotMap;
import org.usfirst.frc.team4930.robot.commands.ResetPot;

import edu.wpi.first.wpilibj.command.Subsystem;

public class LimitSwitch extends Subsystem{

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void periodic() {
		if(RobotMap.limitSwitch.get() == false) {
			new ResetPot().start();
		}
	}
}
