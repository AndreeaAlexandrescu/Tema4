public class Tema4StringDataCounter {
    public static int countWords(String input) {
        return input.split("\\w+").length;
    }

    public static int countVowels(String input) {
        int count = 0;
        input = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i'
                    || input.charAt(i) == 'o' || input.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }

    public static int countSentences(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '.' || input.charAt(i) == '?' || input.charAt(i) == '!') {
                count++;
            }
        }
        return count;
    }

    public static void showProperNouns(String input) {
        String[] strArray = input.split(" ");
        for (int i = 0; i < strArray.length; i++) {
            if (Character.isUpperCase(strArray[i].charAt(0))) {
                boolean nu = false;
                if (strArray[i].equals("It") || strArray[i].equals("The") || strArray[i].equals("At") || strArray[i].equals("Between")) {
                    nu = true;
                }
                if (nu == false) {
                    if (strArray[i].contains(",")) {
                        String[] array = strArray[i].split("\\,");
                        System.out.print(array[0] + ", ");

                    } else if (strArray[i].contains(".")) {
                        String[] array = strArray[i].split("\\.");
                        System.out.print(array[0] + ", ");

                    } else if (strArray[i].contains("'")) {
                        String[] array = strArray[i].split("\\'");
                        System.out.print(array[0] + ", ");

                    } else if (strArray[i].contains(":")) {
                        String[] array = strArray[i].split("\\:");
                        System.out.print(array[0]);

                    } else {
                        System.out.print(strArray[i] + ", ");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        String Str = "Notre Dame is a very old cathedral in Paris, France. It is one of France's most famous landmarks " +
                "and many people visit it each year. The cathedral is on a small island on the River Seine. It is the " +
                "cathedral of the Catholic Archdiocese of Paris, one of 23 archdioceses in France. The cathedral was " +
                "built during two centuries. It is a very good example of Gothic Architecture in France. At the time " +
                "it was finished, the cathedral was the biggest such building in Western Europe. Between 1844 and 1864, " +
                "the building was renovated under the direction of Eugène Viollet-le-Duc, who incorporated elements into" +
                " the design that the medieval building had not possessed before. The two rose windows which ornate the" +
                " transept are among the biggest in Europe: each has a diameter of 13m.";
        System.out.println("Numarul de cuvinte este:" + countWords(Str));
        System.out.println("Numarul de vocale este:" + countVowels(Str));
        System.out.println("Numarul de propozitii este: " + countSentences(Str));
        System.out.println("Numele proprii sunt: ");
        showProperNouns(Str);
    }
}
