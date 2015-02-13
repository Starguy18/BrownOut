package org.usfirst.frc.team3467.robot.commands;

import org.usfirst.frc.team3467.robot.OI;
import org.usfirst.frc.team3467.robot.subsystems.BrownOut;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class AvoidBrownout extends Command{
	protected void initialize() {
	}

	@SuppressWarnings("deprecation")
	public void execute() {
		SmartDashboard.putDouble("Voltage", BrownOut.Voltage);
		if (BrownOut.Voltage <= 7.0){
			//Place commands to stop stop systems and Lower Voltage
			//Example: Pneumatics.compresser.stop();
			new SetLeds(3);
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
