/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phoebushighschool.phoebusrobotics;

import edu.wpi.first.wpilibj.Joystick;

/**
 *
 * @author djennings001
 */
public class MadCatzGamePad extends Joystick {
    //Analog inputs

    private static final int kLeftThumbstickXAxis = 1;
    private static final int kLeftThumbstickYAxis = 2;
    private static final int kTriggerAxis = 3; //0.0 - 1.0 is the left trigger, -1.0 - 0.0 is the right trigger
    private static final int kRightThumbstickXAxis = 4;
    private static final int kRightThumbstickYAxis = 5;
    private static final int kHorizontalAxis = 6;
    //Digital inputs
    private static final int kA = 1;
    private static final int kB = 2;
    private static final int kX = 3;
    private static final int kY = 4;
    private static final int kLeftBumper = 5;
    private static final int kRightBumper = 6;
    private static final int kBack = 7;
    private static final int kStart = 8;
    private static final int kLeftThumbstickButton = 9;
    private static final int kRightThumbstickButton = 10;

    public MadCatzGamePad(int id) {
        super(id, 6, 10);
    }

    /**
     * getLeftThumbstickXAxis()
     * 
     * This method returns x axis of the left thumb stick.
     * @return -1.0 - 0.0 the left thumb stick is to the left
     *         0.0 - 1.0 the right thumb stick is to the right
     */
    public double getLeftThumbstickXAxis() {
        return getRawAxis(kLeftThumbstickXAxis);
    }

    /**
     * getLeftThumbstickYAxis()
     * 
     * This method returns y axis of the left thumb stick.
     * @return -1.0 - 0.0 the left thumb stick is down
     *         0.0 - 1.0 the right thumb stick is up
     */
    public double getLeftThumbstickYAxis() {
        return getRawAxis(kLeftThumbstickYAxis) * -1.0;
    }

    /**
     * getRightThumbstickXAxis()
     * 
     * This method returns x axis of the right thumb stick.
     * @return -1.0 - 0.0 the left thumb stick is to the left
     *         0.0 - 1.0 the right thumb stick is to the right
     */
    public double getRightThumbstickXAxis() {
        return getRawAxis(kRightThumbstickXAxis);
    }

    /**
     * getRightThumbstickYAxis()
     * 
     * This method returns y axis of the right thumb stick.
     * @return -1.0 - 0.0 the left thumb stick is down
     *         0.0 - 1.0 the right thumb stick is up
     */
    public double getRightThumbstickYAxis() {
        return getRawAxis(kRightThumbstickYAxis) * -1.0;
    }

    /**
     * getTriggerAxis()
     * 
     * This method returns the trigger axis
     * @return -1.0 - 0.0 the left trigger is down
     *         0.0 - 1.0 the right trigger is down
     */
    public double getTriggerAxis() {
        return getRawAxis(kTriggerAxis) * -1.0;
    }

    /**
     * getHorizontalAxis()
     * 
     * This method returns the horizontal axis of the direction plate
     * @return -1.0 the left side is down
     *         1.0 the right side is down
     */
    public double getHorizontalAxis() {
        return getRawAxis(kHorizontalAxis);
    }

    /**
     * GetYButton()
     * 
     * This method returns the state of the y button
     * @return - false the y button is not pressed
     *          - true the y button is pressed
     */
    public boolean GetYButton() {
        return getRawButton(kY);
    }

    /**
     * GetXButton()
     * 
     * This method returns the state of the x button
     * @return - false the x button is not pressed
     *          - true the x button is pressed
     */
    public boolean GetXButton() {
        return getRawButton(kX);
    }

    /**
     * GetBButton()
     * 
     * This method returns the state of the b button
     * @return - false the b button is not pressed
     *          - true the b button is pressed
     */
    public boolean GetBButton() {
        return getRawButton(kB);
    }

    /**
     * GetAButton()
     * 
     * This method returns the state of the a button
     * @return - false the a button is not pressed
     *          - true the a button is pressed
     */
    public boolean GetAButton() {
        return getRawButton(kA);
    }

    /**
     * GetBackButton()
     * 
     * This method returns the state of the back button
     * @return - false the back button is not pressed
     *          - true the back button is pressed
     */
    public boolean GetBackButton() {
        return getRawButton(kBack);
    }

    /**
     * GetStartButton()
     * 
     * This method returns the state of the start button
     * @return - false the start button is not pressed
     *          - true the start button is pressed
     */
    public boolean GetStartButton() {
        return getRawButton(kStart);
    }

    /**
     * GetRightBumper()
     * 
     * This method returns the state of the right bumper
     * @return - false the right bumper is not pressed
     *          - true the right bumper is pressed
     */
    public boolean GetRightBumper() {
        return getRawButton(kRightBumper);
    }

    /**
     * GetLeftBumper()
     * 
     * This method returns the state of the left bumper
     * @return - false the left bumper is not pressed
     *          - true the left bumper is pressed
     */
    public boolean GetLeftBumper() {
        return getRawButton(kLeftBumper);
    }

    /**
     * GetLeftThumbstickButton()
     * 
     * This method returns the state of the left thumb stick button
     * @return - false the left thumb stick button is not pressed
     *          - true the left thumb stick button is pressed
     */
    public boolean GetLeftThumbstickButton() {
        return getRawButton(kLeftThumbstickButton);
    }

    /**
     * GetRightThumbstickButton()
     * 
     * This method returns the state of the right thumb stick button
     * @return - false the right thumb stick button is not pressed
     *          - true the right thumb stick button is pressed
     */
    public boolean GetRightThumbstickButton() {
        return getRawButton(kRightThumbstickButton);
    }

    /**
     * getLeftButton()
     * 
     * This method returns if the left button is pressed.
     * @return - false the left button is not pressed
     *          - true the left button is pressed
     */
    public boolean getLeftButton() {
        if (getHorizontalAxis() == -1.0) {
            return true;
        }
        return false;
    }

    /**
     * getRightButton()
     * 
     * This method returns if the right button is pressed.
     * @return - false the right button is not pressed
     *          - true the right button is pressed
     */
    public boolean getRightButton() {
        if (getHorizontalAxis() == 1.0) {
            return true;
        }
        return false;
    }
}
