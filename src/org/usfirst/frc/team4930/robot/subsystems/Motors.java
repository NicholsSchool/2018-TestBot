// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc.team4930.robot.subsystems;

import org.usfirst.frc.team4930.robot.RobotMap;
import org.usfirst.frc.team4930.robot.commands.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import com.ctre.phoenix.motorcontrol.ControlMode;

/**
 *
 */
public class Motors extends Subsystem {
	private double kP;
	private double kI;
	private double kD;
	private double kF;

    @Override
    public void initDefaultCommand() {
    	setDefaultCommand(new RunMotors());

    }

    @Override
    public void periodic() {
    	// get and set the PID values
    	kP = SmartDashboard.getNumber("Set kP:  ", 0.0);
    	kI = SmartDashboard.getNumber("Set kI:  ", 0.0);
    	kD = SmartDashboard.getNumber("Set kD:  ", 0.0);
    	// use these do put the fields back onto the dashboard
//        SmartDashboard.putNumber("Set kP:  ", kP);
//        SmartDashboard.putNumber("Set kI:  ", kI);
//        SmartDashboard.putNumber("Set kD:  ", kD);

        RobotMap.talonMaster.config_kP(0, kP, 100);
        RobotMap.talonMaster.config_kI(0, kI, 100);
        RobotMap.talonMaster.config_kD(0, kD, 100);       
        RobotMap.talonMaster.config_kF(0, kF, 100);
        
        SmartDashboard.putNumber("kP:  ", kP);
        SmartDashboard.putNumber("kI:  ", kI);
        SmartDashboard.putNumber("kD:  ", kD);


    }
    
    public void set(double speed) {
    	RobotMap.talonMaster.set(speed * 1.02);
    	RobotMap.victorSlave.set(speed);
    }
    
    public void setVelocity(double velocity) {
        
    	RobotMap.talonMaster.set(ControlMode.Velocity, velocity);
    }
    
    public void setPosition(double position) {
        
    	RobotMap.talonMaster.set(ControlMode.Position, position);
    }
    
    public void setCurrent(double milliamps) {
    	RobotMap.talonMaster.set(ControlMode.Current, milliamps);
    	RobotMap.victorSlave.set(ControlMode.Current, milliamps);
    }
    
    public void resetEncoder() {
    	RobotMap.talonMaster.setSelectedSensorPosition(0, 0, 100);
    }

}

