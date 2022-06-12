package ru.netology.statistic;

public class Radio {
    private int currentStation;
    private int minStation;
    private int maxStation=10;
    private int volume;
    private int minVolume;
    private int maxVolume=100;

    public Radio(int currentStation,int maxStation, int volume, int maxVolume){
        this.currentStation = currentStation;
        this.maxStation=maxStation;
        this.volume=volume;
        this.maxVolume=maxVolume;
    }
    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void previousStation() {
        if (currentStation == minStation) {
            this.currentStation = maxStation;
            return;
        }
        this.currentStation--;
    }

    public void nextStation() {
        if (currentStation == maxStation) {
            this.currentStation = minStation;
            return;
        }
        this.currentStation++;
    }

    public void setVolume(int volume) {
        if (volume < minVolume) {
            return;
        }
        if (volume > maxVolume) {
            return;
        }
        this.volume = volume;
    }

    public int getVolume() {

        return volume;
    }


    public void volumeUp() {
        if (volume==maxVolume){
            this.volume=volume;
        }
        if (volume < maxVolume) {
            this.volume++;
        }
    }

    public void volumeDown() {
        if (volume==minVolume){
            this.volume=volume;
        }
        if (volume > 0) {
            this.volume--;
        }
    }
}
