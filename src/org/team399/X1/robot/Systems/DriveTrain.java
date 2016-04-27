/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.team399.X1.robot.Systems;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Solenoid;
import org.team399.X1.robot.Config.Ports;

/**
 *
 * @author Ruth
 */
public class DriveTrain {
    private Jaguar leftA = null; 
    private Jaguar leftB = null; 
    private Jaguar leftC = null; 
    private Jaguar rightA = null; 
    private Jaguar rightB = null; 
    private Jaguar rightC = null;
    private Solenoid SolA = null; 
    private Solenoid SolB = null; 
    
    public boolean state = Ports.EXTENDED;
    public boolean prevState = false;
            
    public DriveTrain(int lA, int lB, int lC, int rA, int rB, int rC, int sA, int sB) {
        leftA = new Jaguar(lA);
        leftB = new Jaguar(lB);
        leftC = new Jaguar(lC);
        rightA = new Jaguar(rA);
        rightB = new Jaguar(rB);
        rightC = new Jaguar(rC);
        SolA = new Solenoid(sA);
        
    } 
    
    public DriveTrain(int lA, int lB, int rA, int rB, int sA) {
        leftA = new Jaguar(lA);
        leftB = new Jaguar(lB);
        rightA = new Jaguar(rA);
        rightB = new Jaguar(rB);
        SolA = new Solenoid(sA);
        
    }
    
    public void tankDrive(double leftPower, double rightPower) {
        if(Math.abs(leftPower) < .1) {
            leftPower = 0; 
        }
        
        if(Math.abs(rightPower) < .1) {
            rightPower = 0; 
        }
        
        leftA.set(-leftPower);
        leftB.set(-leftPower);
        rightA.set(rightPower);
        rightB.set(rightPower);
    }
    
    public void setActuators(boolean state) {
        this.prevState = this.state;
        this.state = state;
        SolA.set(this.state);
    }
}
