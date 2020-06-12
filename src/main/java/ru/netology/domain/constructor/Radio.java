package ru.netology.domain.constructor;

public class Radio {

    private String name;


    private int quantityStation = 10;
    private int currentRadioStation = 0;
    private int MinRadioStation = 0;
    private int MaxRadioStation = 10;
    private int SoundVolume = 100;
    private int MinSoundVolume = 0;
    private int MaxSoundVolume = 100;
    private boolean on;

    public int getMinRadioStation() {
        return MinRadioStation;
    }

    public void setMinRadioStation(int minRadioStation) {
        MinRadioStation = minRadioStation;
    }
    public int getQuantityStation() {
        return quantityStation;
    }

    public void setQuantityStation(int quantityStation) {
        this.quantityStation = quantityStation;
    }

    public int getMaxRadioStation() {
        return MaxRadioStation;
    }

    public void setMaxRadioStation(int maxRadioStation) {
        MaxRadioStation = maxRadioStation;
    }

    public int getMinSoundVolume() {
        return MinSoundVolume;
    }

    public void setMinSoundVolume(int minSoundVolume) {
        MinSoundVolume = minSoundVolume;
    }

    public int getMaxSoundVolume() {
        return MaxSoundVolume;
    }

    public void setMaxSoundVolume(int maxSoundVolume) {
        MaxSoundVolume = maxSoundVolume;
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
        return SoundVolume;
    }

    public void setSoundVolume(int soundVolume) {
        if (SoundVolume > MaxSoundVolume) {
            return;
        }
        if (SoundVolume < MinSoundVolume) {
            return;
        }

        this.SoundVolume = soundVolume;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void increaseCurrentNumberStation() {
        if (currentRadioStation >= MaxRadioStation) {
            currentRadioStation = MinRadioStation;
            return;
        }
        currentRadioStation++;
    }

    public void decreaseCurrentNumberStation() {
        if (currentRadioStation <= MinRadioStation) {
            currentRadioStation = MaxRadioStation;
            return;
        }
        currentRadioStation--;
    }

    public void increaseSoundVolume() {
        if (SoundVolume>= MaxSoundVolume) {
            return;
        }
        SoundVolume++;
    }

    public void decreaseSoundVolume() {
        if (SoundVolume <= MinSoundVolume) {

            return;
        }
        SoundVolume--;
    }

}





