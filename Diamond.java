public class Diamond {
    public static void main(String[] args) {
        System.out.println(generateDiamond(3));
    }

    public static String generateDiamond(int n) {
        int totalCharsPerLine = calcCharsPerLine(n);
        int lines = n + (n - 1);
        String diamond = "";

        for (int i = 0; i < lines; i++) {
            if (i <= ((lines/2) - 1)) {
                diamond += generateLine(totalCharsPerLine, i) + "\n";
            } else {
                n--;
                diamond += generateLine(totalCharsPerLine, n) + "\n";
            }
        }
        return diamond;
    }

    public static int calcCharsPerLine(int n) {
        return 1 + (2 * (n - 1));
    }

    public static String generateLine(int charsPerLine, int currentLine) {
        String line = "";
        int centerChar = (charsPerLine / 2) + 1;
        int start = centerChar - currentLine;
        int end = centerChar + currentLine;

        for (int i = 0; i <= charsPerLine; i++) {
            if (i >= start && i <= end)
                line += "*";
            else
                line += " ";
        }
        return line;
    }
}