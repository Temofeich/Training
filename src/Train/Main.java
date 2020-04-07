package Train;

public class Main {
    public static void main(String[] args) {

        Train train1 = new Train("Moscow", 33, 22, 30);
        Train train2 = new Train("Brest", 31, 22, 35);
        Train train3 = new Train("Moscow", 30, 8, 20);
        Train train4 = new Train("St.Petersburg", 12, 12, 40);
        Train train5 = new Train("Riga", 15, 15, 50);

        Composition composition = new Composition(10);
        Logic logic = new Logic();

        composition.add(train1);
        composition.add(train2);
        composition.add(train3);
        composition.add(train4);
        composition.add(train5);

        logic.printInformation(composition);
        logic.sortedByDestinationAndTime(composition);
        logic.sortedByNumberTrain(composition);

    }
}
