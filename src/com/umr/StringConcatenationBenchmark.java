import java.util.concurrent.TimeUnit;

public class StringConcatenationBenchmark {
    public static void main(String[] args) {
        int iterations = 10000;
        long startTime, endTime;

        // Using the "+" operator
        String concatenatedString = "";
        startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            concatenatedString += "String" + i;
        }
        endTime = System.nanoTime();

        long concatenationTime = TimeUnit.NANOSECONDS.toMillis(endTime - startTime);

        System.out.println("Concatenation using '+' operator took approximately " + concatenationTime + " milliseconds.");

        // Using StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append("String").append(i);
        }
        concatenatedString = stringBuilder.toString();
        endTime = System.nanoTime();

        long stringBuilderTime = TimeUnit.NANOSECONDS.toMillis(endTime - startTime);

        System.out.println("Concatenation using StringBuilder took approximately " + stringBuilderTime + " milliseconds.");
    }
}
