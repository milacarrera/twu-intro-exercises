public class VerticalLine{
    public static void main(String[] args){
        System.out.println(generateLine(3));
    }
    private static String generateLine(int n){
        String line = "";
        for(int i = 0; i < n; i++){
            line += "*\n";
        }
        return line;
    }
}