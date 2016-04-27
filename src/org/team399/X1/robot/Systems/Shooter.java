/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.team399.X1.robot.Systems;

import edu.wpi.first.wpilibj.Jaguar; 
/**
 *
 * @author Ruth
 */
public class Shooter {
    private Jaguar Shooter = null; 
    private Jaguar Turret = null; 
    private Jaguar Intake = null; 
    
    public Shooter(int ShootM, int turM, int IntM) {
        Shooter = new Jaguar(ShootM);
        Turret = new Jaguar(turM);
        Intake = new Jaguar(IntM);
        }
        public void setShooter(double shootVal) {
            Shooter.set(shootVal);
        }
        
        public void setTurret(double turVal) {
            Turret.set(turVal);
        }
        
        public void setIntake(double intaVal) {
            Intake.set(intaVal);
        }
}
