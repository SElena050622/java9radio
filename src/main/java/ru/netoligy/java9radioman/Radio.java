package ru.netoligy.java9radioman;

public class Radio {
    protected int currentNumRadiostation;
    protected int currentVolume;

    public int getCurrentNumRadiostation() {

        return currentNumRadiostation;
    }

    public void setCurrentNumRadiostation(int currentNumRadiostation) {
        if (currentNumRadiostation > 9) {
            return;
        }
        if (currentNumRadiostation < 0) {
            return;
        }
        this.currentNumRadiostation = currentNumRadiostation;
    }

    public void nextNumRadiostation() {
        if (currentNumRadiostation < 9) {
            currentNumRadiostation++;
        } else {
            currentNumRadiostation = 0;
        }
    }

    public void prevNumRadiostation() {

        if (currentNumRadiostation > 0) {
            currentNumRadiostation--;
        } else {
            currentNumRadiostation = 9;
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
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        return;
    }

    public void maxVolume(int maxVolume) {
        if (maxVolume >= 10) {
            currentVolume = 10;
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

