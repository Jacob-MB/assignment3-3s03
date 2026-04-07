package main;

public class Velocity {
    private Speed speed, speedX, speedY;
    private Direction direction;

    public Velocity() {}; //constructor

    public Velocity(Speed speed, Direction direction) {}; //constructor

    public Speed getSpeed() {return null;};

    public Speed getSpeedX() {return null;}; // get speed in X direction

    public Speed getSpeedY() {return null;}; // get speed in Y direction

    public Direction getDirection() {return null;};

    public void setSpeed(Speed speed) {};

    public void setDirection(Direction direction) {};

    public void reverse() {}; // reverse the direction of the puck!

    public void reverseX() {}; // reverse the direction of the puck in x-axis
}
