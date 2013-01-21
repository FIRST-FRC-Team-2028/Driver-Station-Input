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
public class Extreme3DPro extends Joystick {
    //Analog inputs

    private static final int kX_Axis = 1;
    private static final int kY_Axis = 2;
    private static final int kZ_Axis = 3;
    private static final int kThrottle_Axis = 4;
    private static final int kHorizontalAxis = 5;
    private static final int kVerticalAxis = 6;
    //Digital inputs
    private static final int kTrigger = 1;
    private static final int k2 = 2;
    private static final int k3 = 3;
    private static final int k4 = 4;
    private static final int k5 = 5;
    private static final int k6 = 6;
    private static final int k7 = 7;
    private static final int k8 = 8;
    private static final int k9 = 9;
    private static final int k10 = 10;
    private static final int k11 = 11;
    private static final int k12 = 12;

    public Extreme3DPro(int id) {
        super(id, 6, 12);
    }

    /**
     * getXAxis()
     * 
     * This method returns the x axis of the joystick.
     * @return -1.0 - 0.0, the joystick is to the left
     *          0.0 - 1.0 the joystick is to the right
     */
    public double getXAxis() {
        return getRawAxis(kX_Axis);
    }

    /**
     * getYAxis()
     * 
     * This method returns the y axis of the joystick.
     * @return -1.0 - 0.0, the joystick is down
     *          0.0 - 1.0 the joystick is up
     */
    public double getYAxis() {
        return getRawAxis(kY_Axis) * -1.0;
    }

    /**
     * getZAxis()
     * 
     * This method returns the z axis of the joystick.
     * @return -1.0 - 0.0, the joystick is rotated to the left
     *          0.0 - 1.0 the joystick is rotated to the right
     */
    public double getZAxis() {
        return getRawAxis(kZ_Axis);
    }

    /**
     * getThrottleAxis()
     * 
     * This method returns the throttle axis of the joystick.
     * @return -1.0 - 0.0, the throttle is down
     *          0.0 - 1.0 the throttle is up
     */
    public double getThrottleAxis() {
        return getRawAxis(kThrottle_Axis) * -1.0;
    }

    /**
     * getHorizontalAxis()
     * 
     * This method returns the horizontal axis of the thumb stick.
     * @return -1.0 - 0.0, the thumb stick is to the left
     *          0.0 - 1.0 the thumb stick is to the right
     */
    public double getHorizontalAxis() {
        return getRawAxis(kHorizontalAxis);
    }

    /**
     * geVerticalAxis()
     * 
     * This method returns the vertical axis of the thumb stick.
     * @return -1.0 - 0.0, the thumb stick is up
     *          0.0 - 1.0 the thumb stick is down
     */
    public double geVerticalAxis() {
        return getRawAxis(kVerticalAxis) * -1.0;
    }

    /**
     * GetTrigger()
     * 
     * This method returns the state of the trigger
     * @return - false - trigger is not pressed
     *         - true - trigger is pressed
     */
    public boolean GetTrigger() {
        return getRawButton(kTrigger);
    }

    /**
     * getButton2()
     * 
     * This method returns the state of the button 2
     * @return - false - trigger is button 2 is not pressed
     *         - true - trigger is button 2 is pressed
     */
    public boolean getButton2() {
        return getRawButton(k2);
    }

    /**
     * getButton3()
     * 
     * This method returns the state of button 3
     * @return - false - trigger is button 3 is not pressed
     *         - true - trigger is button 3 is pressed
     */
    public boolean getButton3() {
        return getRawButton(k3);
    }

    /**
     * getButton4()
     * 
     * This method returns the state of button 4
     * @return - false - trigger is button 4 is not pressed
     *         - true - trigger is button 4 is pressed
     */
    public boolean getButton4() {
        return getRawButton(k4);
    }

    /**
     * getButton5()
     * 
     * This method returns the state of button 5
     * @return - false - trigger is button 5 is not pressed
     *         - true - trigger is button 5 is pressed
     */
    public boolean getButton5() {
        return getRawButton(k5);
    }

    /**
     * getButton6()
     * 
     * This method returns the state of button 6
     * @return - false - trigger is button 6 is not pressed
     *         - true - trigger is button 6 is pressed
     */
    public boolean getButton6() {
        return getRawButton(k6);
    }

    /**
     * getButton7()
     * 
     * This method returns the state of button 7
     * @return - false - trigger is button 7 is not pressed
     *         - true - trigger is button 7 is pressed
     */
    public boolean getButton7() {
        return getRawButton(k7);
    }

    /**
     * getButton8()
     * 
     * This method returns the state of button 8
     * @return - false - trigger is button 8 is not pressed
     *         - true - trigger is button 8 is pressed
     */
    public boolean getButton8() {
        return getRawButton(k8);
    }

    /**
     * getButton9()
     * 
     * This method returns the state of button 9
     * @return - false - trigger is button 9 is not pressed
     *         - true - trigger is button 9 is pressed
     */
    public boolean getButton9() {
        return getRawButton(k9);
    }

    /**
     * getButton10()
     * 
     * This method returns the state of button 10
     * @return - false - trigger is button 10 is not pressed
     *         - true - trigger is button 10 is pressed
     */
    public boolean getButton10() {
        return getRawButton(k10);
    }

    /**
     * getButton11()
     * 
     * This method returns the state of button 11
     * @return - false - trigger is button 11 is not pressed
     *         - true - trigger is button 11 is pressed
     */
    public boolean getButton11() {
        return getRawButton(k11);
    }

    /**
     * getButton12()
     * 
     * This method returns the state of button 12
     * @return - false - trigger is button 12 is not pressed
     *         - true - trigger is button 12 is pressed
     */
    public boolean getButton12() {
        return getRawButton(k12);
    }

    /**
     * getUpButton()
     * 
     * This method returns if the thumb stick is up.
     * @return - false thumb stick is not up
     *         - true thumb stick is up
     */
    public boolean getUpButton() {
        if (geVerticalAxis() == 1.0) {
            return true;
        }
        return false;
    }

    /**
     * getDownButton()
     * 
     * This method returns if the thumb stick is down.
     * @return - false thumb stick is not down
     *         - true thumb stick is down
     */
    public boolean getDownButton() {
        if (geVerticalAxis() == -1.0) {
            return true;
        }
        return false;
    }

    /**
     * getLeftButton()
     * 
     * This method returns if the thumb stick is to the left.
     * @return - false thumb stick is not to the left
     *         - true thumb stick is to the left
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
     * This method returns if the thumb stick is to the right.
     * @return - false thumb stick is not to the right
     *         - true thumb stick is to the right
     */
    public boolean getRightButton() {
        if (getHorizontalAxis() == 1.0) {
            return true;
        }
        return false;
    }
}
