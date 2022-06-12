package ru.netology.statistic;

public class Radio {
    private int currentStation;
    private int maxStation;
    private int volume;

    public Radio(int maxStation) {
        this.maxStation = maxStation;
    }

    public Radio() {
        this.maxStation = 10;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < 0) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void previousStation() {
        if (currentStation == 0) {
            this.currentStation = maxStation;
            return;
        }
        this.currentStation--;
    }

    public void nextStation() {
        if (currentStation == maxStation) {
            this.currentStation = 0;
            return;
        }
        this.currentStation++;
    }

    public void setVolume(int volume) {
        if (volume < 0) {
            return;
        }
        if (volume > 100) {
            return;
        }
        this.volume = volume;
    }

    public int getVolume() {

        return volume;
    }

    public void volumeUp() {
        if (volume == 0) {
            this.volume = volume;
        }
        if (volume < 100) {
            this.volume++;
        }

    }

    public void volumeDown() {
        if (volume == 0) {
            this.volume = volume;
        }
        if (volume > 0) {
            this.volume--;
        }
    }
}
