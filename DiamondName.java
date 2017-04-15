public class DiamondName {
    public static void main(String[] args) {
        System.out.println(generateDiamond(5, "Camila"));
    }

    public static String generateDiamond(int n, String name) {
        int totalCharsPerLine = calcCharsPerLine(n);
        int totalLines = n + (n - 1);
        String diamond = "";

        for (int i = 0; i < totalLines; i++) {
            if (i <= ((totalLines / 2) - 1)) {
                diamond += generateLine(totalCharsPerLine, i) + "\n";
            } else if (i == (totalLines / 2)) {
                diamond += name + "\n";
                n--;
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