public class RightTriangle {
    public static void main(String[] args) {
        System.out.println(generateTriangle(3));
    }

    private static String generateLine(int n) {
        String line = "";
        for (int i = 0; i < n; i++) {
            line += "*";
        }
        return line;
    }

    private static String generateTriangle(int n) {
        String triangle = "";
        for (int i = 0; i < n; i++) {
            triangle += generateLine(i + 1) + "\n";
        }
        return triangle;
    }
}