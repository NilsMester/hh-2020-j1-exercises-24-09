package de.neuefische.jan.j1exercises2409;

public class Alarm {

    public static String getPeopleCapacityStatus(int numberOfPeople, ThreatLevel alarmEnum) {
        int limit = alarmEnum.maxNumberOfPeople;
        if (numberOfPeople <= limit) {
            return "Maximum number of people not exceeded";
        }
        return "Too many people";
    }
/*
    public static int getMaximumNumberOfPeople(AlarmEnum alarmEnum){
        switch(alarmEnum) {
            case RED:
                return 0;
            case YELLOW:
                return 30;
            case GREEN:
                return 60;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {


    }

 */
}
