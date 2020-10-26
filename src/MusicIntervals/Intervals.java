package MusicIntervals;

public class Intervals {
    static int indexStart;
    static int indexFinish;
    static int semitone = 0;
    static int degree = 0;
    static int degreeCount = 0;
    static int semitoneCount = 0;
    static String interval;
    static String note;
    static String noteStart;
    static String noteFinish;
    static String[] sequence = new String[]
            {"C", "-", "-", "D", "-", "-", "E", "-", "F", "-", "-", "G", "-", "-", "A", "-", "-", "B", "-"};

    public static String intervalConstruction(String[] args) {
        if (args.length < 2 || args.length > 3) {
            throw new IllegalArgumentException("Illegal number of elements in input array");
        }
        interval = args[0];
        noteStart = args[1].substring(0, 1);

        switch (interval) {
            case ("m2"): {
                semitone = 1;
                degree = 2;
            }
            break;
            case ("M2"): {
                semitone = 2;
                degree = 2;
            }
            break;
            case ("m3"): {
                semitone = 3;
                degree = 3;
            }
            break;
            case ("M3"): {
                semitone = 4;
                degree = 3;
            }
            break;
            case ("P4"): {
                semitone = 5;
                degree = 4;
            }
            break;
            case ("P5"): {
                semitone = 7;
                degree = 5;
            }
            break;
            case ("m6"): {
                semitone = 8;
                degree = 6;
            }
            break;
            case ("M6"): {
                semitone = 9;
                degree = 6;
            }
            break;
            case ("m7"): {
                semitone = 10;
                degree = 7;
            }
            break;
            case ("M7"): {
                semitone = 11;
                degree = 7;
            }
            break;
            case ("P8"): {
                semitone = 12;
                degree = 8;
            }
            break;
        }
        for (int i = 0; i < sequence.length; i++) {
            if (sequence[i].equals(noteStart)) {
                indexStart = i;
            }
        }
        arrayConverting(args, sequence);
        IdentificationNoteFinish(args);
        int differenceSemitone = semitone - semitoneCount;
        identificationNote(args, differenceSemitone);
        return note;
    }

    private static void identificationNote(String[] args, int differenceSemitone) {
        try {
            if (args[2].equals("dsc")) {
                if (differenceSemitone == -2) {
                    note = noteFinish.concat("##");
                }
                if (differenceSemitone == -1) {
                    note = noteFinish.concat("#");
                }
                if (differenceSemitone == 0) {
                    note = noteFinish;
                }
                if (differenceSemitone == 1) {
                    note = noteFinish.concat("b");
                }
                if (differenceSemitone == 2) {
                    note = noteFinish.concat("bb");
                }
            } else {
                if (differenceSemitone == -2) {
                    note = noteFinish.concat("bb");
                }
                if (differenceSemitone == -1) {
                    note = noteFinish.concat("b");
                }
                if (differenceSemitone == 0) {
                    note = noteFinish;
                }
                if (differenceSemitone == 1) {
                    note = noteFinish.concat("#");
                }
                if (differenceSemitone == 2) {
                    note = noteFinish.concat("##");
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            if (differenceSemitone == -2) {
                note = noteFinish.concat("bb");
            }
            if (differenceSemitone == -1) {
                note = noteFinish.concat("b");
            }
            if (differenceSemitone == 0) {
                note = noteFinish;
            }
            if (differenceSemitone == 1) {
                note = noteFinish.concat("#");
            }
            if (differenceSemitone == 2) {
                note = noteFinish.concat("##");
            }
        }
    }

    private static void IdentificationNoteFinish(String[] args) {
        try {
            if (args[2].equals("dsc")) {
                for (int i = sequence.length - 1; i >= 0; i--) {
                    if (sequence[i].matches("[A-G]")) {
                        degreeCount++;
                    }
                    if (sequence[i].equals("-")) {
                        semitoneCount++;
                    }
                    if (degreeCount == degree) {
                        indexFinish = i;
                        noteFinish = sequence[i];
                        break;
                    }
                }
                if (args[1].substring(1).equals("b")) {
                    semitoneCount--;
                }
                if (args[1].substring(1).equals("#")) {
                    semitoneCount++;
                }
            } else {
                for (int i = 0; i < sequence.length; i++) {
                    if (sequence[i].matches("[A-G]")) {
                        degreeCount++;
                    }
                    if (sequence[i].equals("-")) {
                        semitoneCount++;
                    }
                    if (degreeCount == degree) {
                        indexFinish = i;
                        noteFinish = sequence[i];
                        break;
                    }
                }
                if (args[1].substring(1).equals("#")) {
                    semitoneCount--;
                }
                if (args[1].substring(1).equals("b")) {
                    semitoneCount++;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            for (int i = 0; i < sequence.length; i++) {
                if (sequence[i].matches("[A-G]")) {
                    degreeCount++;
                }
                if (sequence[i].equals("-")) {
                    semitoneCount++;
                }
                if (degreeCount == degree) {
                    indexFinish = i;
                    noteFinish = sequence[i];
                    break;
                }
            }
            if (args[1].substring(1).equals("#")) {
                semitoneCount--;
            }
            if (args[1].substring(1).equals("b")) {
                semitoneCount++;
            }
        }
    }

    public static String intervalIdentification(String[] args) {
        noteStart = args[0].substring(0, 1);
        noteFinish = args[1].substring(0, 1);

        searchIndex(sequence, noteStart, noteFinish);
        arrayConverting(args, sequence);
        searchIndex(sequence, noteStart, noteFinish);
        countSemitone(args, sequence);

        switch (semitone) {
            case (1): {
                interval = "m2";
            }
            break;
            case (2): {
                interval = "M2";
            }
            break;
            case (3): {
                interval = "m3";
            }
            break;
            case (4): {
                interval = "M3";
            }
            break;
            case (5): {
                interval = "P4";
            }
            break;
            case (7): {
                interval = "P5";
            }
            break;
            case (8): {
                interval = "m6";
            }
            break;
            case (9): {
                interval = "M6";
            }
            break;
            case (10): {
                interval = "m7";
            }
            break;
            case (11): {
                interval = "M7";
            }
            break;
            case (12): {
                interval = "P8";
            }
            break;
            default: {
                try {
                    throw new Exception("Cannot identify the interval");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return interval;
    }

    private static void countSemitone(String[] args, String[] sequence) {
        try {
            if (args[2].equals("dsc")) {
                for (int j = indexStart; j > indexFinish; j--) {
                    if (sequence[j].equals("-")) {
                        semitone++;
                    }
                }
                if (args[0].substring(1).equals("#")) {
                    semitone++;
                }
                if (args[0].substring(1).equals("##")) {
                    semitone += 2;
                }
                if (args[0].substring(1).equals("b")) {
                    semitone--;
                }
                if (args[0].substring(1).equals("bb")) {
                    semitone -= 2;
                }
                if (args[1].substring(1).equals("#")) {
                    semitone--;
                }
                if (args[1].substring(1).equals("##")) {
                    semitone -= 2;
                }
                if (args[1].substring(1).equals("b")) {
                    semitone++;
                }
                if (args[1].substring(1).equals("bb")) {
                    semitone += 2;
                }
            } else {
                for (int j = indexStart; j < indexFinish; j++) {
                    if (sequence[j].equals("-")) {
                        semitone++;
                    }
                }
                if (args[0].substring(1).equals("#")) {
                    semitone--;
                }
                if (args[0].substring(1).equals("##")) {
                    semitone -= 2;
                }
                if (args[0].substring(1).equals("b")) {
                    semitone++;
                }
                if (args[0].substring(1).equals("bb")) {
                    semitone += 2;
                }
                if (args[1].substring(1).equals("#")) {
                    semitone++;
                }
                if (args[1].substring(1).equals("##")) {
                    semitone += 2;
                }
                if (args[1].substring(1).equals("b")) {
                    semitone--;
                }
                if (args[1].substring(1).equals("bb")) {
                    semitone -= 2;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            for (int j = indexStart; j < indexFinish; j++) {
                if (sequence[j].equals("-")) {
                    semitone++;
                }
            }
            if (args[0].substring(1).equals("#")) {
                semitone--;
            }
            if (args[0].substring(1).equals("##")) {
                semitone -= 2;
            }
            if (args[0].substring(1).equals("b")) {
                semitone++;
            }
            if (args[0].substring(1).equals("bb")) {
                semitone += 2;
            }
            if (args[1].substring(1).equals("#")) {
                semitone++;
            }
            if (args[1].substring(1).equals("##")) {
                semitone += 2;
            }
            if (args[1].substring(1).equals("b")) {
                semitone--;
            }
            if (args[1].substring(1).equals("bb")) {
                semitone -= 2;
            }
        }
    }

    private static void arrayConverting(String[] args, String[] sequence) {
        try {
            if (args[2].equals("dsc")) {
                for (int i = 0; i < indexStart + 1; i++) {
                    String first = sequence[0];
                    System.arraycopy(sequence, 1, sequence, 0, sequence.length - 1);
                    sequence[sequence.length - 1] = first;
                }
            } else {
                for (int i = 0; i < indexStart; i++) {
                    String first = sequence[0];
                    System.arraycopy(sequence, 1, sequence, 0, sequence.length - 1);
                    sequence[sequence.length - 1] = first;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            for (int i = 0; i < indexStart; i++) {
                String first = sequence[0];
                System.arraycopy(sequence, 1, sequence, 0, sequence.length - 1);
                sequence[sequence.length - 1] = first;
            }
        }
    }

    private static void searchIndex(String[] sequence, String noteStart, String noteFinish) {
        for (int i = 0; i < sequence.length; i++) {
            if (sequence[i].equals(noteStart)) {
                indexStart = i;
            }
            if (sequence[i].equals(noteFinish)) {
                indexFinish = i;
            }
        }
    }
}