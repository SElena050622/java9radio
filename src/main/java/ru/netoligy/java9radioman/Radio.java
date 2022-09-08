package ru.netoligy.java9radioman;

public class Radio {
    protected int currentNumRadiostation;
    protected int currentVolume;
    protected int maxStation;

    public Radio() {
        maxStation = 9;
    }

    public Radio(int stationsCount) {
        maxStation = stationsCount -1;
    }

    public int getCurrentNumRadiostation() {

        return currentNumRadiostation;
    }

    public void setCurrentNumRadiostation(int currentNumRadiostation) {
        if (currentNumRadiostation < 0) {
            return;
        }
        if (currentNumRadiostation > maxStation) {
            return;
        }
        this.currentNumRadiostation = currentNumRadiostation;
    }

    public void nextNumRadiostation() {
        if (currentNumRadiostation < maxStation) {
            currentNumRadiostation++;
        } else {
            currentNumRadiostation = 0;
        }
    }

    public void prevNumRadiostation() {

        if (currentNumRadiostation > 0) {
            currentNumRadiostation--;
        } else {
            currentNumRadiostation = maxStation;
        }

    }

    //громкость
    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
        return;
    }

    public void maxVolume(int maxVolume) {
        if (maxVolume >= 100) {
            currentVolume = 100;
        }
        return;
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        return;
    }

    public void minVolume(int minVolume) {
        if (minVolume <= 0) {
            currentVolume = 0;
        }
        return;
    }

}
