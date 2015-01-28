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
		SmartDashboard.putData("Avoid Brownout", new AvoidBrownout());
	}
}

