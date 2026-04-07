package main;

public class Direction {
    private final int angle;

    public Direction(int angle) {
        this.angle = angle;
    };

    public int getDirection() {
        return angle;
    }

    @Override
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass()) return false;

        Direction objDirection = (Direction) obj;
        return this.getDirection() == objDirection.getDirection();
    }
}
