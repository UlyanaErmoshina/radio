package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test

 public void ShouldCurrentNumberStationMaxMin(){
        Radio radio = new Radio();
        radio.setMaxRadioStation(9);
        radio.setCurrentRadioStation(10);
        int expected = 10;
        int actual = radio.getCurrentRadioStation();
        radio.setMinRadioStation(0);
        radio.setCurrentRadioStation(-1);
        int expected1 = -1;
        int actual1 = radio.getCurrentRadioStation();
        assertEquals(expected,actual);
        assertEquals(expected1,actual1);
    }

   @Test
   public void ShouldCurrentVolumeMaxMin(){
       Radio radio = new Radio();
       radio.setMaxSoundVolume(10);
       radio.setSoundVolume(11);
       int expected = 11;
       int actual = radio.getSoundVolume();
       radio.setMinSoundVolume(0);
       radio.setSoundVolume(-1);
       int expected1 = 11;
       int actual1 = radio.getSoundVolume();
       assertEquals(expected,actual);
       assertEquals(expected1,actual1);



    }

}