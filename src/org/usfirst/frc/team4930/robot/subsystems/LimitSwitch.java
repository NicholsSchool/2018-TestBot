package org.usfirst.frc.team4930.robot.subsystems;

import org.usfirst.frc.team4930.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

public class LimitSwitch extends Subsystem
{

  @Override
  protected void initDefaultCommand() {
    // TODO Auto-generated method stub

  }

  @Override
  public void periodic() {
    System.out.println("Junqi is dumb");
    if (RobotMap.limitSwitch.get() == false) {
      // new ResetPot().start();
      RobotMap.talonMaster.setSelectedSensorPosition(0, 0, 100);
      System.out.println("Arnav is dumb");
    }

  }
}
