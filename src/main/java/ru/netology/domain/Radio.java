package ru.netology.domain;

public class Radio {

    private String name;
    private int currentRadioStation = 0;
    private int minRadioStation = 0;
    private int maxRadioStation = 10;
    private int soundVolume = 100;
    private int minSoundVolume = 0;
    private int maxSoundVolume = 100;
    private boolean on;

    public Radio(int currentRadioStation, int soundVolume, int minSoundVolume, int maxSoundVolume) {
        this.currentRadioStation = currentRadioStation;
        this.soundVolume = soundVolume;
        this.minSoundVolume = minSoundVolume;
        this.maxSoundVolume = maxSoundVolume;
    }

    public Radio(int currentRadioStation) {
        this.currentRadioStation = currentRadioStation;
    }

    public Radio(int currentRadioStation, int minRadioStation, int maxRadioStation) {

        this.currentRadioStation = currentRadioStation;
        this.minRadioStation = minRadioStation;
        this.maxRadioStation = maxRadioStation;
    }

    public Radio() {
    }




    public int getMinRadioStation() {
        return minRadioStation;
    }

    public void setMinRadioStation(int minRadioStation) {
        this.minRadioStation = minRadioStation;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public void setMaxRadioStation(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
    }


    public int getMinSoundVolume() {
        return minSoundVolume;
    }

    public void setMinSoundVolume(int minSoundVolume) {
        this.minSoundVolume = minSoundVolume;
    }

    public int getMaxSoundVolume() {
        return maxSoundVolume;
    }

    public void setMaxSoundVolume(int maxSoundVolume) {
        this.maxSoundVolume = maxSoundVolume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {

        this.currentRadioStation = currentRadioStation;

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

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
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






