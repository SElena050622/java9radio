package ru.netoligy.java9radioman;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class RadioTest {

    @Test
    public void shouldSet1CurrentNumRadiostation() {
        Radio radio = new Radio();
        radio.setCurrentNumRadiostation(1);
        int expected = 1;
        int actual = radio.getCurrentNumRadiostation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSet0CurrentNumRadiostation() {
        Radio radio = new Radio();
        radio.setCurrentNumRadiostation(0);
        int expected = 0;
        int actual = radio.getCurrentNumRadiostation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSet00CurrentNumRadiostation() {
        Radio radio = new Radio();
        radio.setCurrentNumRadiostation(-1);
        int expected = 0;
        int actual = radio.getCurrentNumRadiostation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSet8CurrentNumRadiostation() {
        Radio radio = new Radio();
        radio.setCurrentNumRadiostation(8);
        int expected = 8;
        int actual = radio.getCurrentNumRadiostation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSet9CurrentNumRadiostation() {
        Radio radio = new Radio();
        radio.setCurrentNumRadiostation(9);
        int expected = 9;
        int actual = radio.getCurrentNumRadiostation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSet10urrentNumRadiostation() {
        Radio radio = new Radio();
        radio.setCurrentNumRadiostation(10);
        int expected = 0;
        int actual = radio.getCurrentNumRadiostation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNex8tCurrentNumRadiostation() {
        Radio radio = new Radio();
        radio.setCurrentNumRadiostation(8);
        radio.nextNumRadiostation();
        int expected = 9;
        int actual;
        actual = radio.getCurrentNumRadiostation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNext9CurrentNumRadiostation() {
        Radio radio = new Radio();
        radio.setCurrentNumRadiostation(9);
        radio.nextNumRadiostation();
        int expected = 0;
        int actual;
        actual = radio.currentNumRadiostation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNext0CurrentNumRadiostation() {
        Radio radio = new Radio();
        radio.setCurrentNumRadiostation(0);
        radio.nextNumRadiostation();
        int expected = 1;
        int actual;
        actual = radio.currentNumRadiostation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNext1CurrentNumRadiostation() {
        Radio radio = new Radio();
        radio.setCurrentNumRadiostation(1);
        radio.nextNumRadiostation();
        int expected = 2;
        int actual;
        actual = radio.currentNumRadiostation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrev2CurrentNumRadiostation() {
        Radio radio = new Radio();
        radio.setCurrentNumRadiostation(2);
        radio.prevNumRadiostation();
        int expected = 1;
        int actual;
        actual = radio.getCurrentNumRadiostation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrev1CurrentNumRadiostation() {
        Radio radio = new Radio();
        radio.setCurrentNumRadiostation(1);
        radio.prevNumRadiostation();
        int expected = 0;
        int actual;
        actual = radio.getCurrentNumRadiostation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrev0CurrentNumRadiostation() {
        Radio radio = new Radio();
        radio.setCurrentNumRadiostation(0);
        radio.prevNumRadiostation();
        int expected = 9;
        int actual;
        actual = radio.getCurrentNumRadiostation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrev9CurrentNumRadiostation() {
        Radio radio = new Radio();
        radio.setCurrentNumRadiostation(9);
        radio.prevNumRadiostation();
        int expected = 8;
        int actual;
        actual = radio.getCurrentNumRadiostation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void should00CurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void should0CurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void should1CurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void should9CurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        int expected = 9;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void should10CurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void should11CurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldIncrease9Volume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncrease10Volume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncrease0Volume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMax10Volume() {
        Radio radio = new Radio();
        radio.maxVolume(10);
        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMax11Volume() {
        Radio radio = new Radio();
        radio.maxVolume(11);
        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMax9Volume() {
        Radio radio = new Radio();
        radio.maxVolume(9);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduce10Volume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.reduceVolume();
        int expected = 9;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduce9Volume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.reduceVolume();
        int expected = 8;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduce1Volume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.reduceVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduce0Volume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.reduceVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMin0Volume() {
        Radio radio = new Radio();
        radio.minVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMin11Volume() {
        Radio radio = new Radio();
        radio.minVolume(1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMin12Volume() {
        Radio radio = new Radio();
        radio.minVolume(2);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMin1Volume() {
        Radio radio = new Radio();
        radio.minVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMin2Volume() {
        Radio radio = new Radio();
        radio.minVolume(-2);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

}