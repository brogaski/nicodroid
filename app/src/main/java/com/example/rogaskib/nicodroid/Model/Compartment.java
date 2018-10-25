package com.example.rogaskib.nicodroid.Model;

import java.util.ArrayList;
import java.util.List;

public class Compartment {

    private List<Dose> inputs;
    private double volume;
    private double rateClearance;
    private double concentration;

    public Compartment(double volume) {
        this.rateClearance = Constants.KE;
        this.volume = volume;
        this.concentration = 0d;
        this.inputs = new ArrayList<>();
    }

    public void update() {

        // Add new mass from absorbtion
        double newmass = 0d;
        for (Dose dose : inputs) {
            newmass += dose.update();

            // Remove dose if below minimum threshold
            if (dose.getMass() < Constants.MIN_DOSE) {
                inputs.remove(dose);
            }
        }
        double oldmass = concentration*volume;
        concentration = (oldmass + newmass) / volume;

        // Clearance
        concentration = rateClearance * concentration;
        if (concentration < Constants.MIN_CONC) {
            concentration = 0d;
        }
    }


}

