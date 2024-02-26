mport java.util.Arrays;

public class task3 {
    public static String getCommonPrefix(String[] array) {
        String prefix = "";

        if (array.length == 0) return prefix;

        char[] characters = array[0].toCharArray();

        outer:
        for (char character : characters) {
            String substring = String.valueOf(character);

            for (String word : array) {
                if (!word.startsWith(prefix + substring)) break outer;
            }

            prefix += substring;
        }

        return prefix;
    }

    public static void main(String[] args) {
        System.out.print(getCommonPrefix(new String[] {"flower","flow","flight"}));
    }
}
