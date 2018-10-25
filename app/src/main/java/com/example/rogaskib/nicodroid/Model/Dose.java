package com.example.rogaskib.nicodroid.Model;

public class Dose {

    private double rate;
    private double massAvailable;
    private double massReleased;

    public Dose(double rate, double massAvailable) {
        setRate(rate);
        setMassAvailable(massAvailable);
        this.massReleased = 0d;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setMassAvailable(double massAvailable) {
        this.massAvailable = massAvailable;
    }

    public double getMass() {
        return massAvailable;
    }

    public double update() {

        // dM/dt = -Ka * M
        massReleased = rate * massAvailable;
        massAvailable = massAvailable - massReleased;
        return massReleased;
    }
}
