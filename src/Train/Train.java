package Train;

import java.util.Objects;

public class Train {

    private String destination;
    private int numberTrain;
    private int hour;
    private int minute;

    public Train(String destination, int numberTrain, int hour, int minute) {
        this.destination = destination;
        this.numberTrain = numberTrain;
        this.hour = hour;
        this.minute = minute;
    }

    public String getDestination() {
        return destination;
    }

    public int getNumberTrain() {
        return numberTrain;
    }

    public int getHour() { return hour;  }

    public int getMinute() {
        return minute;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return numberTrain == train.numberTrain &&
                hour == train.hour &&
                minute == train.minute &&
                destination.equals(train.destination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination, numberTrain, hour, minute);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "{destination='" + destination + '\'' +
                ", numberTrain=" + numberTrain +
                ", hour=" + hour +
                ", minute=" + minute +
                '}';
    }
}