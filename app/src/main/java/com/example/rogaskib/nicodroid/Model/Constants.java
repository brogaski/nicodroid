package com.example.rogaskib.nicodroid.Model;

public class Constants {
    private static final Constants ourInstance = new Constants();

    public static Constants getInstance() {
        return ourInstance;
    }

    private Constants() {
    }

    // Absorption Rate Constants
    public static final double KA_SMOKING = 0.01;
    public static final double KA_ORAL = 0.002;
    public static final double KA_GUM = 0.001;
    public static final double KA_PATCH = 0.0001;
    public static final double KA_VAPE = 0.02;

    // Elimination Rate Constants
    public static final double KE = 0.0001;

    // Timesteps
    public static final double TS = 1; // Timestep in seconds

    // Concentration minimum
    public static final double MIN_DOSE = 0.001;
    public static final double MIN_CONC = 0.0000001;
}
