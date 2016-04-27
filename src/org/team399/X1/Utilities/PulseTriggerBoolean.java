/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.team399.X1.Utilities;

/**
 *
 * @author Ruth
 */
public class PulseTriggerBoolean {
    private boolean state = false;
    private boolean oldIn = false;

    public void set(boolean in) {
        if(oldIn == false && in == true) {
            state = true;
        }
        else {
            state = false;
        }
        oldIn = in;
    }

    public boolean get() {
        return state;
    }
    
    public void reset() {
        state = false;
        oldIn = false;
    }
}
