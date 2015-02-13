package org.usfirst.frc.team3467.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team3467.robot.commands.*;

public class OI {
	public static Joystick Joystick1;
	public static Joystick.RumbleType kLeftRumble;
	public static Joystick.RumbleType kRightRumble;

	public OI(){
		//SmartDashboard Buttons
		SmartDashboard.putData("Masts", new SetLeds(0));
		SmartDashboard.putData("Ring", new SetLeds(1));
		SmartDashboard.putData("Idle", new SetLeds(2));
		SmartDashboard.putData("Brownout", new SetLeds(3));
		SmartDashboard.putData("Gyro", new SetLeds(4));
	}
}

