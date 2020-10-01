package de.neuefische.jan.j1exercises2409;

public enum ThreatLevel {
    RED(0),
    YELLOW(30),
    GREEN(60);


    public final int maxNumberOfPeople;

    ThreatLevel(int i) {
        this.maxNumberOfPeople = i;
    }
}
