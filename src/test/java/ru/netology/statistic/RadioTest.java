package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    void shouldSetCurrentStation() {
        Radio radio = new Radio(10,10,30,100);
        int expected = 10;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldSetCurrentStationLessMin() {
        Radio radio = new Radio(10,10,30,100);
        int currentStation = -1;
        radio.setCurrentStation(currentStation);
        int expected = 10;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldSetCurrentStationMoreMax() {
        Radio radio = new Radio(10,10,30,100);
        int currentStation = 11;
        radio.setCurrentStation(currentStation);
        int expected = 10;
        assertEquals(expected, radio.getCurrentStation());
    }
    @Test
    void shouldPreviousRadioStationMin() {
        Radio radio = new Radio(10,10,30,100);
        int currentStation = 0;
        radio.setCurrentStation(currentStation);
        radio.previousStation();
        int expected = 10;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldNotChangeNextStationIfStationMax() {
        Radio radio = new Radio(10,10,30,100);
        int currentStation = 10;
        radio.setCurrentStation(currentStation);
        radio.nextStation();
        int expected = 0;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldChangePreviousStation() {
        Radio radio = new Radio(10,10,30,100);
        int currentStation = 2;
        radio.setCurrentStation(currentStation);
        radio.previousStation();
        int expected = 1;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldChangeNextStation() {
        Radio radio = new Radio(10,10,30,100);
        int currentStation = 7;
        radio.setCurrentStation(currentStation);
        radio.nextStation();
        int expected = 8;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldSetVolumeOverMax() {
        Radio radio = new Radio(10,10,100,100);
        int volume = 101;
        radio.setVolume(volume);
        int expected = 100;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    void shouldSetVolumeUnderMin() {
        Radio radio = new Radio(10,10,0,100);
        int volume = -1;
        radio.setVolume(volume);
        int expected = 0;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    void shouldNotChangeVolumeMax() {
        Radio radio = new Radio(10,10,30,100);
        int volume = 100;
        radio.setVolume(volume);
        radio.volumeUp();
        int expected = 100;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    void shouldNotChangeVolumeMin() {
        Radio radio = new Radio(10,10,30,10);
        int volume = 0;
        radio.setVolume(volume);
        radio.volumeDown();
        int expected = 0;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    void volumeUp() {
        Radio radio = new Radio(10,10,30,100);
        int volume = 8;
        radio.setVolume(volume);
        radio.volumeUp();
        int expected = 9;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    void volumeDown() {
        Radio radio = new Radio(1,10,30,100);
        int volume = 7;
        radio.setVolume(volume);
        radio.volumeDown();
        int expected = 6;
        assertEquals(expected, radio.getVolume());
    }
}
