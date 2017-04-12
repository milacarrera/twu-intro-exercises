public class HorizontalLine{
    public static void main(String[] args){
        System.out.println(generateLine(8));
    }
    private static String generateLine(int n){
        String line = "";
        for(int i = 0; i < n; i++){
            line += "*";
        }
        return line;
    }
}