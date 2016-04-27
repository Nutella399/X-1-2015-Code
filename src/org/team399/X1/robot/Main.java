package org.team399.X1.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick; 

import org.team399.X1.Utilities.GamePad; 
import org.team399.X1.robot.Config.Ports; 
import org.team399.X1.robot.Systems.Robot; 

public class Main extends IterativeRobot {
    
    Robot robot;
    Joystick driverLeft = new Joystick(Ports.DRIVER_LEFT_JOYSTICK);
    Joystick driverRight = new Joystick(Ports.DRIVER_RIGHT_JOYSTICK);
    GamePad operator = new GamePad(Ports.OPERATOR_GAMEPAD);

    public void robotInit() {
        robot = Robot.getInstance(); 
    }

    public void autonomousPeriodic() {

    }

    public void teleopPeriodic() {
        robot.comp.start();
        
        double leftIn = driverLeft.getRawAxis(2); 
        double rightIn = driverRight.getRawAxis(2); 
        
        robot.drivetrain.tankDrive(leftIn, rightIn);
        
        if(operator.getButton(1)) {
            robot.shooter.setShooter(1.0);
        } else if(operator.getButton(2)) {
            robot.shooter.setShooter(0.75);
        } else if(operator.getButton(3)) {
            robot.shooter.setShooter(0.50);
        } else if(operator.getButton(4)) {
            robot.shooter.setShooter(0.25);
        } else {
            robot.shooter.setShooter(0.0);
        }
  
        if(operator.getDPad(1)) {
            robot.shooter.setIntake(1.0);
        } else if(operator.getDPad(0)) {
            robot.shooter.setIntake(-1.0);
        }  else {
            robot.shooter.setIntake(0.0);
        }
        
        if(driverLeft.getRawButton(1)) {
            robot.drivetrain.setActuators(Ports.RETRACTED);
        } else if (driverRight.getRawButton(1)) {
            robot.drivetrain.setActuators(Ports.EXTENDED);
        }
    }

    public void testPeriodic() {
        robot.comp.start();
        System.out.println("The Compressor SHOULD be working!");
    }
}
