public class CountLettersInArray {
    public static void main(String[] args) {
        char[] chars = createArray();

        System.out.println("Lowercase letters are: ");
        displayArray(chars);

        int[] counts = countLetters(chars);

        System.out.println("\nThe occurrences of each letter are: ");
        displayCount(counts);
    }

    public static char getRandomCharacter(char ch1, char ch2) {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }

    public static char[] createArray() {
        char[] chars = new char[100];

        for (int i = 0; i < chars.length; i++) {
            chars[i] = getRandomLowerCaseLetter();
        }
        return chars;
    }

    public static void displayArray(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            if ((i + 1) % 20 == 0)
                System.out.println(chars[i]);
            else
                System.out.print(chars[i] + " ");
        }
    }

    public static int[] countLetters(char[] chars) {
        int[] count = new int[26];
        for (int i = 0; i < chars.length; i++) {
            count[chars[i] - 'a']++;
        }
        return count;
    }

    public static void displayCount(int[] count) {
        for (int i = 0; i < count.length; i++) {
            if ((i + 1) % 10 == 0) {
                System.out.println(count[i] + " " + (char) (i + 'a'));
            } else {
                System.out.print(count[i] + " " + (char) (i + 'a') + " ");
            }
        }
    }
}
