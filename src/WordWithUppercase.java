// преобразовать строку, чтобы каждое слово начиналось с заглавной буквы

public class WordWithUppercase {
    public static void main(String[] args) {
        String s = "How can mirrors be real if    , our eyes aren't real";

        String[] words = s.split("\\s+");
        int i = 0;
        while (i < words.length) {
           String word = words[i].substring(0,1).toUpperCase() + words[i].substring(1);
            System.out.print(word + " ");
            i++;
        }


//        Matcher m;
//        while ((m = Pattern.compile("\\s+\\b[a-z]").matcher(s)).find()) {
//            s = m.replaceFirst(m.group().toUpperCase());
//        }
//            System.out.println(s);


//        boolean up = true;
//        for (char c : s.toCharArray()) {
//            if (up) c = Character.toUpperCase(c);
//            up = false;
//            if (c == ' ') {
//                up = true;
//            }
//            System.out.print(c);
//        }
    }
}