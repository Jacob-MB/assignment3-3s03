package test;

import main.Direction;
import main.Speed;
import main.Velocity;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VelocityTest {
    // ============
    // setDirection
    // ============

    @Test
    public void setDirectionValid() {
        Velocity velocity = new Velocity(new Speed(5), new Direction(10));
        velocity.setDirection(new Direction(45));

        assertEquals(new Direction(45), velocity.getDirection());
        assertEquals(new Speed(5), velocity.getSpeed());
        assertEquals(new Speed(4), velocity.getSpeedX());
        assertEquals(new Speed(4), velocity.getSpeedY());
    }

    // ========
    // setSpeed
    // ========

    @Test
    public void setSpeedValid() {
        Velocity velocity = new Velocity(new Speed(5), new Direction(10));
        velocity.setSpeed(new Speed(25));

        assertEquals(new Direction(10), velocity.getDirection());
        assertEquals(new Speed(25), velocity.getSpeed());
        assertEquals(new Speed(25), velocity.getSpeedX());
        assertEquals(new Speed(4), velocity.getSpeedY());
    }

    // =======
    // reverse
    // =======

    @Test
    public void reverseRightToLeft() {
        Velocity velocity = new Velocity(new Speed(5), new Direction(10));
        velocity.reverse();

        assertEquals(new Direction(190), velocity.getDirection());
        assertEquals(new Speed(5), velocity.getSpeed());
        assertEquals(new Speed(-5), velocity.getSpeedX());
        assertEquals(new Speed(-1), velocity.getSpeedY());
    }

    @Test
    public void reverseLeftToRight() {
        Velocity velocity = new Velocity(new Speed(5), new Direction(190));
        velocity.reverse();

        assertEquals(new Direction(10), velocity.getDirection());
        assertEquals(new Speed(5), velocity.getSpeed());
        assertEquals(new Speed(5), velocity.getSpeedX());
        assertEquals(new Speed(1), velocity.getSpeedY());
    }

    @Test
    public void reverse360Boundary() {
        Velocity velocity = new Velocity(new Speed(5), new Direction(359));
        velocity.reverse();

        assertEquals(new Direction(179), velocity.getDirection());
        assertEquals(new Speed(5), velocity.getSpeed());
        assertEquals(new Speed(-5), velocity.getSpeedX());
        assertEquals(new Speed(0), velocity.getSpeedY());
    }

    @Test
    public void reverse0Boundary() {
        Velocity velocity = new Velocity(new Speed(5), new Direction(0));
        velocity.reverse();

        assertEquals(new Direction(180), velocity.getDirection());
        assertEquals(new Speed(5), velocity.getSpeed());
        assertEquals(new Speed(-5), velocity.getSpeedX());
        assertEquals(new Speed(0), velocity.getSpeedY());
    }

    @Test
    public void reverseTo0() {
        Velocity velocity = new Velocity(new Speed(5), new Direction(180));
        velocity.reverse();

        assertEquals(new Direction(0), velocity.getDirection());
        assertEquals(new Speed(5), velocity.getSpeed());
        assertEquals(new Speed(5), velocity.getSpeedX());
        assertEquals(new Speed(0), velocity.getSpeedY());
    }

    // ========
    // reverseX
    // ========

    @Test
    public void reverseXRightToLeft() {
        Velocity velocity = new Velocity(new Speed(5), new Direction(45));
        velocity.reverseX();

        assertEquals(new Direction(135), velocity.getDirection());
        assertEquals(new Speed(5), velocity.getSpeed());
        assertEquals(new Speed(-4), velocity.getSpeedX());
        assertEquals(new Speed(4), velocity.getSpeedY());
    }

    @Test
    public void reverseXLeftToRight() {
        Velocity velocity = new Velocity(new Speed(5), new Direction(135));
        velocity.reverseX();

        assertEquals(new Direction(45), velocity.getDirection());
        assertEquals(new Speed(5), velocity.getSpeed());
        assertEquals(new Speed(4), velocity.getSpeedX());
        assertEquals(new Speed(4), velocity.getSpeedY());
    }

    @Test
    public void reverseXOnXAxis() {
        Velocity velocity = new Velocity(new Speed(5), new Direction(0));
        velocity.reverseX();

        assertEquals(new Direction(180), velocity.getDirection());
        assertEquals(new Speed(5), velocity.getSpeed());
        assertEquals(new Speed(-5), velocity.getSpeedX());
        assertEquals(new Speed(0), velocity.getSpeedY());
    }

    @Test
    public void reverseXOnYAxis() {
        Velocity velocity = new Velocity(new Speed(5), new Direction(90));
        velocity.reverseX();

        assertEquals(new Direction(90), velocity.getDirection());
        assertEquals(new Speed(5), velocity.getSpeed());
        assertEquals(new Speed(0), velocity.getSpeedX());
        assertEquals(new Speed(5), velocity.getSpeedY());
    }

    @Test
    public void reverseX360Boundary() {
        Velocity velocity = new Velocity(new Speed(5), new Direction(359));
        velocity.reverseX();

        assertEquals(new Direction(181), velocity.getDirection());
        assertEquals(new Speed(5), velocity.getSpeed());
        assertEquals(new Speed(-5), velocity.getSpeedX());
        assertEquals(new Speed(0), velocity.getSpeedY());
    }
}
