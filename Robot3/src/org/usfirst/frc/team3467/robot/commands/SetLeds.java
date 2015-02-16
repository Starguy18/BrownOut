package org.usfirst.frc.team3467.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team3467.robot.subsystems.Leds;
import org.usfirst.frc.team3467.robot.subsystems.BrownOut;

public class SetLeds extends Command{
	int state = 0;
	boolean off;
	double VOLT = BrownOut.Voltage;
	
	public SetLeds(int test){
		state = test;
	}
	
	protected void initialize() {
		off = false;
	}

	protected void execute() {
		switch (state){
		case 0:
			Leds.setState("Masts", 'l', 0);
			break;
		case 1:
			Leds.setState("Ring", 'l', 1);
		case 2:
			Leds.setState("Idle", 'd', 0);
			break;
		case 3:
			Leds.setState("Brownout", 'd', 1);
			break;
		case 4:
			Leds.setState("Gyro", 'd', 2);
			break;
		case 5:
			Leds.setState("Elevator", 'd', 3);
			break;
		case 6:
			if (VOLT <= 12 && VOLT > 11){
				Leds.setState("Very High", 'v', 6);
			}
			else if (VOLT <= 11.0 && VOLT > 10.0){
				Leds.setState("High", 'v', 5);
			}
			else if (VOLT <= 10.0 && VOLT > 9.0){
				Leds.setState("Good", 'v', 4);
			}
			else if (VOLT <= 9.0 && VOLT > 8.0){
				Leds.setState("Ok", 'v', 3);
			}
			else if (VOLT <= 8.0 && VOLT > 7.0){
				Leds.setState("Low", 'v', 2);
			}
			else if (VOLT <= 7.0){
				Leds.setState("Very Low", 'v', 1);
			}
			break;
		case 7: 
			Leds.setState("Indexer Actuator In", 'd', 4);
			break;
		case 8:
			Leds.setState("Indexer Actuator Inative", 'd', 5);
			break;
		case 9:
			Leds.setState("Encoder Fault", 'd', 6);
			break;
		case 10:
			
		}
	}

	protected boolean isFinished() {
		return off;
	}

	protected void end() {
	}

	protected void interrupted() {
	}
}
