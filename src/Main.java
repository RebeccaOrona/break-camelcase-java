

public class Main {
    public static String camelCase(String input) {
        StringBuilder result = new StringBuilder();
        boolean nextIsUpper = false;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (Character.isUpperCase(c)) {
                if (!nextIsUpper && i > 0) {
                    result.append(' ');
                }
                nextIsUpper = true;
            } else {
                nextIsUpper = false;
            }
            result.append(c);
        }
        return result.toString();
    }

    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        System.out.println("camel Casing: " + camelCase("camelCasing"));
        System.out.println("camel Casing Test: " + camelCase("camelCasingTest"));
        System.out.println("camelcasingtest: " + camelCase("camelcasingtest"));
    }

}
