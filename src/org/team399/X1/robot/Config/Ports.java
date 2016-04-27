/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.team399.X1.robot.Config;

/**
 *
 * @author Ruth
 */
public class Ports {
    //Joystick USB Ports
    public static final int DRIVER_LEFT_JOYSTICK = 1; 
    public static final int DRIVER_RIGHT_JOYSTICK = 2; 
    public static final int OPERATOR_GAMEPAD = 3; 
    
    //Shooter Ports 
    public static final int SHOOTER_MOTOR = 7;
    public static final int SHOOTER_TURRET= 4; 
    
    //Intake Ports
    public static final int INTKAE_MOTOR = 8; 
    
    //Drive Train Ports
    public static final int LEFT_DRIVE_1 = 10; 
    public static final int LEFT_DRIVE_2 = 9;
    public static final int RIGHT_DRIVE_1 = 6;
    public static final int RIGHT_DRIVE_2 = 5; 
    public static final int DRIVE_SHIFTER = 8;
    public static final boolean RETRACTED = true; 
    public static final boolean EXTENDED = false;
    
    
    //Compressor
    public static final int PRESSURE_SWITCH = 9; 
    public static final int COMPRESSOR_SPIKE = 7; 
}
