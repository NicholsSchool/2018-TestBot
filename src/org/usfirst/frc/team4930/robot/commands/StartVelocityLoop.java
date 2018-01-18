package org.usfirst.frc.team4930.robot.commands;

import org.usfirst.frc.team4930.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class StartVelocityLoop extends Command {
	
	private double velocity;

    public StartVelocityLoop(double velocity) {
    	this.velocity = velocity;
    	
        requires(Robot.motors);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.motors.setVelocity(velocity);

    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
//    	Robot.motors.stop();
    	
//    	new RunMotors().start();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
