package org.usfirst.frc.team3467.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.hal.PDPJNI;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Joystick.RumbleType;

import org.usfirst.frc.team3467.robot.OI;
import org.usfirst.frc.team3467.robot.subsystems.BrownOut;


public class AvoidBrownout extends Command{
	
	protected void initialize() {
	}

	@SuppressWarnings("deprecation")
	protected void execute() {
		double Voltage =  BrownOut.PDP.getVoltage();
		SmartDashboard.putDouble("Voltage", Voltage);
		if (Voltage <= 7.0){
			//Place commands to stop stop systems and Lower Voltage
			//Example: Pneumatics.compresser.stop();
			OI.Joystick1.setRumble(OI.kLeftRumble, 1.0f);
			OI.Joystick1.setRumble(OI.kRightRumble, 1.0f);
		}
	}
	
	protected boolean isFinished() {

		return false;
	}

	protected void end() {
		
	}

	protected void interrupted() {

	}

}
