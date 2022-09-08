package ru.netoligy.java9radioman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netoligy.java9radioman.Radio;

public class RadioTest {

    @Test
    public void shouldSet1CurrentNumRadiostation() {
        Radio radio = new Radio(10);
        radio.setCurrentNumRadiostation(1);
        int expected = 1;
        int actual = radio.getCurrentNumRadiostation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSet0CurrentNumRadiostation() {
        Radio radio = new Radio(10);
        radio.setCurrentNumRadiostation(0);
        int expected = 0;
        int actual = radio.getCurrentNumRadiostation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSet00CurrentNumRadiostation() {
        Radio radio = new Radio(10);
        radio.setCurrentNumRadiostation(-1);
        int expected = 0;
        int actual = radio.getCurrentNumRadiostation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSet8CurrentNumRadiostation() {
        Radio radio = new Radio(10);
        radio.setCurrentNumRadiostation(8);
        int expected = 8;
        int actual = radio.getCurrentNumRadiostation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSet9CurrentNumRadiostation() {
        Radio radio = new Radio(10);
        radio.setCurrentNumRadiostation(9);
        int expected = 9;
        int actual = radio.getCurrentNumRadiostation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSet10urrentNumRadiostation() {
        Radio radio = new Radio(10);
        radio.setCurrentNumRadiostation(10);
        int expected = 0;
        int actual = radio.getCurrentNumRadiostation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNex8tCurrentNumRadiostation() {
        Radio radio = new Radio(10);
        radio.setCurrentNumRadiostation(8);
        radio.nextNumRadiostation();
        int expected = 9;
        int actual;
        actual = radio.getCurrentNumRadiostation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNext9CurrentNumRadiostation() {
        Radio radio = new Radio(10);
        radio.setCurrentNumRadiostation(9);
        radio.nextNumRadiostation();
        int expected = 0;
        int actual;
        actual = radio.getCurrentNumRadiostation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNext0CurrentNumRadiostation() {
        Radio radio = new Radio(10);
        radio.setCurrentNumRadiostation(0);
        radio.nextNumRadiostation();
        int expected = 1;
        int actual;
        actual = radio.currentNumRadiostation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNext1CurrentNumRadiostation() {
        Radio radio = new Radio(10);
        radio.setCurrentNumRadiostation(1);
        radio.nextNumRadiostation();
        int expected = 2;
        int actual;
        actual = radio.currentNumRadiostation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrev2CurrentNumRadiostation() {
        Radio radio = new Radio(10);
        radio.setCurrentNumRadiostation(2);
        radio.prevNumRadiostation();
        int expected = 1;
        int actual;
        actual = radio.getCurrentNumRadiostation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrev1CurrentNumRadiostation() {
        Radio radio = new Radio(10);
        radio.setCurrentNumRadiostation(1);
        radio.prevNumRadiostation();
        int expected = 0;
        int actual;
        actual = radio.getCurrentNumRadiostation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrev0CurrentNumRadiostation() {
        Radio radio = new Radio(10);
        radio.setCurrentNumRadiostation(0);
        radio.prevNumRadiostation();
        int expected = 9;
        int actual;
        actual = radio.getCurrentNumRadiostation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrev9CurrentNumRadiostation() {
        Radio radio = new Radio(10);
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
    public void should99CurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void should100CurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void should101CurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldIncrease99Volume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncrease100Volume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
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
    public void shouldMax100Volume() {
        Radio radio = new Radio();
        radio.maxVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMax101Volume() {
        Radio radio = new Radio();
        radio.maxVolume(101);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMax99Volume() {
        Radio radio = new Radio();
        radio.maxVolume(99);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduce100Volume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.reduceVolume();
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduce99Volume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.reduceVolume();
        int expected = 98;
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
