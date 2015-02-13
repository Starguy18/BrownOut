package org.usfirst.frc.team3467.robot.subsystems;

import edu.wpi.first.wpilibj.SerialPort;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Leds extends Subsystem{

	public static SerialPort.Port kUSB;
	public static SerialPort.Parity kEven;
	public static final SerialPort Leds = new SerialPort(9600, kUSB, 8, kEven);
	public static final int REG1 = 'l'; //REG1 indicates Which LED strip
	
	public static final int REG2 = 's'; //REG2 Indicates state. 0 is enables, 1 is disabled
	public static final int REG3 = 'd'; //REG3 Indicates display
	public static final int REG4 = 'v'; //REG4 Indicates voltage
	public static final int REG5 = 'e'; //REG5 Indicates elevator level
	//display
	public static final int Idle = 0;
	public static final int Brownout = 1;
	public static final int Gyro = 2;
	public static final int Elevator = 3;
	
	
	protected void initDefaultCommand() {
	}

	public static void setState(String Location, char Register, int State){
	}
}
