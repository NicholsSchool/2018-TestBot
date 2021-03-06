package org.usfirst.frc.team4930.robot;

import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.DigitalInput;



/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

    
    public static WPI_TalonSRX talonMaster;
    public static WPI_VictorSPX victorSlave;
    
    public static DigitalInput limitSwitch;
    public static AnalogPotentiometer pot;

    public static void init() {

        
        talonMaster = new WPI_TalonSRX(21);
        talonMaster.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0, 100);
        // is inverted
        talonMaster.setSensorPhase(true);
        // zero the encoder position
        talonMaster.setSelectedSensorPosition(0, 0, 100);
        talonMaster.setNeutralMode(NeutralMode.Brake);
        
        victorSlave = new WPI_VictorSPX(22);
        // must use .follow() instead of .set(ControlMode.Follow) for Talon-Victor control
        victorSlave.follow(talonMaster);
        victorSlave.setNeutralMode(NeutralMode.Brake);
        
        limitSwitch = new DigitalInput(9);
        pot = new AnalogPotentiometer(0);
        

    }
}
