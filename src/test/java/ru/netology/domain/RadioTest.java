package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void ShouldIncreaseNumberStation() {
       Radio radio = new Radio();

        radio.increaseCurrentNumberStation();

        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);

    }

    @Test
    public void ShouldDecreaseNumberStation() {
        Radio radio = new Radio();

        radio.decreaseCurrentNumberStation();

        int expected1 = 10;
        int actual1 = radio.getCurrentRadioStation();

        assertEquals(expected1, actual1);

    }

    @Test
    public void ShouldIncreaseSoundVolume() {
        Radio radio = new Radio();

        radio.increaseSoundVolume();

        int expected = 100;
        int actual = radio.getSoundVolume();

        assertEquals(expected, actual);

    }

    @Test
    public void ShouldDecreaseSoundVolume() {
        Radio radio = new Radio();

        radio.decreaseSoundVolume();

        int expected1 = 99;
        int actual1 = radio.getSoundVolume();

        assertEquals(expected1, actual1);

    }


    //Изменённые тесты:

    @Test
    void ShouldIncreaseNumberStation2() {
        Radio radio = new Radio(5, 0, 10);
        radio.increaseCurrentNumberStation();
        assertEquals(6, radio.getCurrentRadioStation());
    }

    @Test
    void CheckLimitMaxNumberStation2() {
        Radio radio = new Radio(11, 0, 10);
        radio.increaseCurrentNumberStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void ShouldDecreaseNumberStation2() {
        Radio radio = new Radio(5, 1, 20);
        radio.decreaseCurrentNumberStation();
        assertEquals(4, radio.getCurrentRadioStation());

    }
    @Test
    void CheckLimitMinNumberStation2() {
        Radio radio = new Radio(0, 1, 20);
        radio.decreaseCurrentNumberStation();
        assertEquals(20, radio.getCurrentRadioStation());

    }

    @Test
    void ShouldSetCurrentNumberStation() {
        Radio radio = new Radio(0);
        radio.setCurrentRadioStation(5);
        assertEquals(5, radio.getCurrentRadioStation());

    }

    @Test
    void ShouldIncreaseSoundVolume2() {
        Radio radio = new Radio(0, 50, 0, 100);
        radio.increaseSoundVolume();
        assertEquals(51, radio.getSoundVolume());

    }
    @Test
    void CheckLimitMaxSoundVolume2() {
        Radio radio = new Radio(0, 100, 0, 100);
        radio.increaseSoundVolume();
        assertEquals(100, radio.getSoundVolume());

    }

    @Test
    void ShouldDecreaseSoundVolume2() {
        Radio radio = new Radio(0, 50, 0, 100);
        radio.decreaseSoundVolume();
        assertEquals(49, radio.getSoundVolume());

    }
    @Test
    void CheckLimitMinSoundVolume2() {
        Radio radio = new Radio(0, 0, 0, 100);
        radio.decreaseSoundVolume();
        assertEquals(0, radio.getSoundVolume());

    }

    @Test

    void ShouldSetSoundVolume() {
        Radio radio = new Radio(5, 100, 0, 100);
        radio.setSoundVolume(100);
        assertEquals(100, radio.getSoundVolume());

    }
    @Test

    void ShouldSetSoundVolume2() {
        Radio radio = new Radio(5, 0, 0, 100);
        radio.setSoundVolume(0);
        assertEquals(0, radio.getSoundVolume());

    }

    }


