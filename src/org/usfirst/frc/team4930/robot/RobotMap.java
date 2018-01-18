package org.usfirst.frc.team4930.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.RobotDrive;


/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

    
    public static WPI_TalonSRX talonMaster;
    public static WPI_VictorSPX victorSlave;
    

    public static void init() {

        
        talonMaster = new WPI_TalonSRX(21);
        talonMaster.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0, 100);
        // is inverted
        talonMaster.setSensorPhase(false);
        // zero the encoder position
        talonMaster.setSelectedSensorPosition(0, 0, 100);
        
        victorSlave = new WPI_VictorSPX(22);
        victorSlave.follow(talonMaster);
    }
}
