package Train;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Logic {

    public void printInformation(Composition composition) {

        List<Train> trains;
        trains = composition.getTrains();

        System.out.println("Enter the train number, please: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (Train train : trains) {
            if (number == train.getNumberTrain()) {
                System.out.println("Information about your train: ");
                System.out.println("Destination: " + train.getDestination() + ", departure time: "
                        + train.getHour() + ":" + train.getMinute());
            }
        }
        System.out.println("===============================");
    }

    public void sortedByDestinationAndTime (Composition composition){

        List<Train> trains;
        trains = composition.getTrains();

        trains.sort(Comparator.comparing(Train::getDestination).thenComparing(Train::getHour).thenComparing(Train::getMinute));

        trains.forEach(System.out::println);
        System.out.println("===============================");
    }

    public void sortedByNumberTrain (Composition composition){

        List<Train> trains;
        trains = composition.getTrains();

        trains.sort(Comparator.comparing(Train::getNumberTrain));

        trains.forEach(System.out::println);
        System.out.println("===============================");
    }

}