package com.interviewdot.ILoveJavaProgramming.billiondollarmistake;

public class DefensiveNullChecks {
    public static void main(String[] args) {
        Computer computer = new Computer();
        getVersion(computer);
    }

    private static String getVersion(Computer computer) {
        String version = "UNKNOWN";
        if (computer != null) {
            SoundCard soundcard = computer.getSoundcard();
            if (soundcard != null) {
                USB usb = soundcard.getUSB();
                if (usb != null) {
                    version = usb.getVersion();
                }
            }
        }
        return version;
    }
}
