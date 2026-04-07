package main;

public class Speed {
    private final int speed;

    public Speed(int speed) {
        this.speed = speed;
    };

    public int getSpeed() {
        return speed;
    }

    @Override
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass()) return false;

        Speed objSpeed = (Speed) obj;
        return this.getSpeed() == objSpeed.getSpeed();
    }
}
