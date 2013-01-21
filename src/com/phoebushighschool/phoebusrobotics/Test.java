/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package com.phoebushighschool.phoebusrobotics;


import edu.wpi.first.wpilibj.SimpleRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.Joystick;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the SimpleRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Test extends SimpleRobot {
    Joystick stick = new Joystick(1);
    /**
     * This function is called once each time the robot enters autonomous mode.
     */
    public void autonomous() {
        while (isEnabled() && isAutonomous())
        {
            Timer.delay(1);
            getWatchdog().feed();
        }
    }

    /**
     * This function is called once each time the robot enters operator control.
     */
    public void operatorControl() {
while (isEnabled() && isOperatorControl())
        {
//            //Analog input
//            System.out.print("Axis 1: " + stick.getRawAxis(1));
//            System.out.print("Axis 2: " + stick.getRawAxis(2));
//            System.out.print("Axis 3: " + stick.getRawAxis(3));
//            System.out.print("Axis 4: " + stick.getRawAxis(4));
//            System.out.print("Axis 5: " + stick.getRawAxis(5));
//            System.out.println("Axis 6: " + stick.getRawAxis(6));
            
            //Digital input
//            System.out.print("Button 1: " + stick.getRawButton(1));
//            System.out.print(" Button 2: " + stick.getRawButton(2));
//            System.out.print(" Button 3: " + stick.getRawButton(3));
//            System.out.print(" Button 4: " + stick.getRawButton(4));
//            System.out.print(" Button 5: " + stick.getRawButton(5));
//            System.out.println(" Button 6: " + stick.getRawButton(6));
            System.out.print(" Button 7: " + stick.getRawButton(7));
            System.out.print(" Button 8: " + stick.getRawButton(8));
            System.out.print(" Button 9: " + stick.getRawButton(9));
            System.out.print(" Button 10: " + stick.getRawButton(10));
            System.out.print(" Button 11: " + stick.getRawButton(11));
            System.out.println(" Button 12: " + stick.getRawButton(12));
            
            Timer.delay(0.25);
            getWatchdog().feed();
        }
    }
    
    /**
     * This function is called once each time the robot enters test mode.
     */
    public void test() {
    while (isEnabled() && isTest())
        {
            Timer.delay(1);
            getWatchdog().feed();
        }
    }
}
