package shop;

import java.time.LocalDate;

public class LoyalCard {

    private String Name;
    private int points;
    private LocalDate expiration;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public LocalDate getExpiration() {
        return expiration;
    }

    public void setExpiration(LocalDate expiration) {
        this.expiration = expiration;
    }

    @Override
    public String toString() {
        return "Name: " + Name + ", Points: " + points + ", Expiration: " + expiration;
    }
}
