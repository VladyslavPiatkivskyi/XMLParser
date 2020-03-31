package org.example.data;

public class Chars {
    private String type;
    private int numberOfSeedsForCrew;
    private Characteristics characteristics;
    private boolean radarAvailability;

    public Chars(String type, int numberOfSeedsForCrew, Characteristics characteristics, boolean radarAvailability) {
        this.type = type;
        this.numberOfSeedsForCrew = numberOfSeedsForCrew;
        this.characteristics = characteristics;
        this.radarAvailability = radarAvailability;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumberOfSeedsForCrew() {
        return numberOfSeedsForCrew;
    }

    public void setNumberOfSeedsForCrew(int numberOfSeedsForCrew) {
        this.numberOfSeedsForCrew = numberOfSeedsForCrew;
    }

    public Characteristics getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(Characteristics characteristics) {
        this.characteristics = characteristics;
    }

    public boolean isRadarAvailability() {
        return radarAvailability;
    }

    public void setRadarAvailability(boolean radarAvailability) {
        this.radarAvailability = radarAvailability;
    }
}
