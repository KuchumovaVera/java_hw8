package ru.netology.statistic;

public class Radio {
    private int currentStation;
    private int quantityOfStations;
    private int volume;

    public Radio(int quantityOfStations) {
        this.quantityOfStations = quantityOfStations;
    }

    public Radio() {
        this.quantityOfStations = 10;
    }

    public int getQuantityOfStations() {
        return quantityOfStations;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > quantityOfStations - 1) {
            return;
        }
        if (currentStation < 0) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void previousStation() {
        if (currentStation == 0) {
            this.currentStation = quantityOfStations - 1;
            return;
        }
        this.currentStation--;
    }

    public void nextStation() {
        if (currentStation == quantityOfStations - 1) {
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
