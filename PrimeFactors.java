import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class PrimeFactors { 
    public static void main(String[] args) {
        int n = 144;
        ArrayList<Integer> primeFactors = generate(n);
        System.out.println("The prime factors for " + n + " are :");
        for (int i = 0; i < primeFactors.size(); i++) {
            System.out.print(primeFactors.get(i) + " ");
        }
    }

    public static ArrayList<Integer> generate(int num) {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        int tempNum = num;

        for (int i = 2; i <= tempNum; i++) {
            if (tempNum % i == 0 && isPrimeNumber(i)) {
                factors.add(i);
                tempNum = tempNum / i;
                i--;
            }
        }

        return factors;
    }

    public static Boolean isPrimeNumber(int num) {
        for (int i = 2; i * 2 < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}