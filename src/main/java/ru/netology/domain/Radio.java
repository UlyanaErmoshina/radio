package ru.netology.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Radio {


    private String name;
    private int currentRadioStation = 0;
    private int minRadioStation = 0;
    private int maxRadioStation = 10;
    private int soundVolume = 100;
    private int minSoundVolume = 0;
    private int maxSoundVolume = 100;
    private boolean on;

    public Radio(int minRadioStation, int maxRadioStation) {
        this.minRadioStation = minRadioStation;
        this.maxRadioStation = maxRadioStation;
    }

    public Radio(int currentRadioStation, int minRadioStation, int maxRadioStation) {
        this.currentRadioStation = currentRadioStation;
        this.minRadioStation = minRadioStation;
        this.maxRadioStation = maxRadioStation;
    }

    public int getCurrentRadioStation() {

        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        this.currentRadioStation = 5;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int soundVolume) {
        if (this.soundVolume > maxSoundVolume) {
            return;
        }
        if (this.soundVolume < minSoundVolume) {
            return;
        }

        this.soundVolume = soundVolume;
    }


    public void increaseCurrentNumberStation() {
        if (currentRadioStation >= maxRadioStation) {
            currentRadioStation = minRadioStation;
            return;
        }
        currentRadioStation++;
    }

    public void decreaseCurrentNumberStation() {
        if (currentRadioStation <= minRadioStation) {
            currentRadioStation = maxRadioStation;
            return;
        }
        currentRadioStation--;
    }

    public void increaseSoundVolume() {
        if (soundVolume >= maxSoundVolume) {
            return;
        }
        soundVolume++;
    }

    public void decreaseSoundVolume() {
        if (soundVolume <= minSoundVolume) {

            return;
        }
        soundVolume--;
    }

}





