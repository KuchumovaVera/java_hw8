package ru.netology.statistic;

public class Radio {
    private int currentStation;
    private int volume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > 9) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void previousStation() {
        if (currentStation == 0) {
            this.currentStation = 9;
            return;
        }
        this.currentStation--;
    }

    public void nextStation() {
        if (currentStation == 9) {
            this.currentStation = 0;
            return;
        }
        this.currentStation++;
    }

    public void setVolume(int volume) {
        if (volume < 0) {
            return;
        }
        if (volume > 10) {
            return;
        }
        this.volume = volume;
    }

    public int getVolume() {

        return volume;
    }

    public void volumeUp() {
        if (volume < 10) {
            this.volume++;
        }
    }

    public void volumeDown() {
        if (volume > 0) {
            this.volume--;
        }
    }
}
