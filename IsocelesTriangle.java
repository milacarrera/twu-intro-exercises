public class IsocelesTriangle {
    public static void main(String[] args) {
        System.out.println(generateTriangle(3));
    }

    public static String generateTriangle(int n) {
        int totalCharsPerLine = calcCharsPerLine(n);
        String triangle = "";
        for (int i = 0; i < n; i++) {
            String line = triangle += generateLine(totalCharsPerLine, i) + "\n";
        }
        return triangle;
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