package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Queue;

public class SQRServiceTest {
    @Test
    public void TestFromExamples() {
        SQRService service = new SQRService();

        int actual = service.calculate(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void RangeFrom200To200() {
        SQRService service = new SQRService();

        int actual = service.calculate(200, 200);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void RangeFrom0To100() {
        SQRService service = new SQRService();

        int actual = service.calculate(0, 100);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void RangeFrom100To200() {
        SQRService service = new SQRService();

        int actual = service.calculate(100, 200);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }
}

