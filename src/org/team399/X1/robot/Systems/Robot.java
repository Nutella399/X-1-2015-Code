/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.team399.X1.robot.Systems;

import edu.wpi.first.wpilibj.Compressor; 
import org.team399.X1.robot.Config.Ports;

/**
 *
 * @author Ruth
 */
public class Robot {
    private static Robot instance = null; 
    
    public Shooter shooter; 
    
    public DriveTrain drivetrain; 
    
    public Compressor comp; 
    
    private Robot() {
        shooter = new Shooter(Ports.SHOOTER_MOTOR, Ports.SHOOTER_TURRET,
                Ports.INTKAE_MOTOR); 
        drivetrain = new DriveTrain(Ports.LEFT_DRIVE_1, Ports.LEFT_DRIVE_2, Ports.RIGHT_DRIVE_1, Ports.RIGHT_DRIVE_2, Ports.DRIVE_SHIFTER);
        comp = new Compressor(Ports.PRESSURE_SWITCH, Ports.COMPRESSOR_SPIKE);
        comp.start();
    }
    
    public static Robot getInstance() {
        if (instance == null) {
            instance = new Robot();
        }
        return instance;
    }
}
