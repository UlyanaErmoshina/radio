package ru.netology.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
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

    public Radio(int soundVolume, int minSoundVolume, int maxSoundVolume) {
        SoundVolume = soundVolume;
        MinSoundVolume = minSoundVolume;
        MaxSoundVolume = maxSoundVolume;
    }

    public Radio(int quantityStation, int currentRadioStation, int minRadioStation, int maxRadioStation) {
        this.quantityStation = quantityStation;
        this.currentRadioStation = currentRadioStation;
        MinRadioStation = minRadioStation;
        MaxRadioStation = maxRadioStation;
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





