import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Give me your sentence: ");
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
//        String sentence = "Elemér elment epret szedni.";

        System.out.println(sentence);
        int vowelWordsCount = countVowelWords(sentence);
        System.out.println("A mondatban " + vowelWordsCount + " szó kezdődik magánhangzóval.");
    }

    // Metódus a magánhangzóval kezdődő szavak számolására
    public static int countVowelWords(String sentence) {
        int count = 0;
        boolean isNewWord = true;

        for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);

            if (isWordCharacter(currentChar)) {
                if (isNewWord) {
                    if (isVowel(currentChar)) {
                        count++;
                    }
                    isNewWord = false;
                }
            } else {
                isNewWord = true;
            }
        }

        return count;
    }

    // Metódus, ami megállapítja, hogy a karakter egy szóbetű-e
    public static boolean isWordCharacter(char c) {
//        System.out.println(Character.isLetter(c));
        return Character.isLetter(c);
    }

    // Metódus, ami megállapítja, hogy a karakter egy magánhangzó-e
    public static boolean isVowel(char c) {
        char lowerC = Character.toLowerCase(c);
        System.out.println(lowerC);
        return lowerC == 'a' || lowerC == 'á' || lowerC == 'e' || lowerC == 'é' || lowerC == 'i' || lowerC == 'í'
                || lowerC == 'o' || lowerC == 'ó' || lowerC == 'ö' || lowerC == 'ő' || lowerC == 'u' || lowerC == 'ú'
                || lowerC == 'ü' || lowerC == 'ű';
    }
}
