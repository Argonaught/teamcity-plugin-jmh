package com.presidentio.teamcity.jmh.runner.common;

/**
 * Created by Vitaliy on 04.05.2015.
 */
public class TimeUnitConst {
    
    public static final String UNSPECIFIED = "unspecified";
    public static final String MINUTES = "m";
    public static final String SECONDS = "s";
    public static final String MILLISECONDS = "ms";
    public static final String MICROSECONDS = "us";
    public static final String NANOSECONDS = "ns";

    public String getUNSPECIFIED() {
        return UNSPECIFIED;
    }

    public String getMINUTES() {
        return MINUTES;
    }

    public String getSECONDS() {
        return SECONDS;
    }

    public String getMILLISECONDS() {
        return MILLISECONDS;
    }

    public String getMICROSECONDS() {
        return MICROSECONDS;
    }

    public String getNANOSECONDS() {
        return NANOSECONDS;
    }
}