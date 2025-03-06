package problems;

import java.util.Objects;

public class ModifiedString {
    public static void main(String[] args) {
        System.out.println(convertToTitleCase(null));
    }

    public static String convertToTitleCase(String string) {
        if (Objects.isNull(string)) {
            return "";
        }

        // Replace underscores with spaces and split into words
        String[] words = string.toLowerCase().split("_");
        StringBuilder titleCase = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                titleCase.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1))
                        .append(" ");
            }
        }

        // Trim the final string to remove trailing space
        return titleCase.toString().trim();
    }
}
