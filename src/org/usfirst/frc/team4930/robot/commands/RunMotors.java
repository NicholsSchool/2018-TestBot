// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc.team4930.robot.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team4930.robot.Robot;

/**
 *
 */
public class RunMotors extends Command {


    public RunMotors() {
    	 requires(Robot.motors);
    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
    	Robot.motors.set(0.0);
    	Robot.motors.resetEncoder();
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
    	double speed = Robot.oi.getJoystick0().getY();
    	Robot.motors.set(speed);
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    @Override
    protected void end() {
//    	Robot.motors.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    @Override
    protected void interrupted() {
    	end();
    }
}
