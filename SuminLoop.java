package sum;

public class SuminLoop {
    public static void main(String[] args) {
        // Example pairs of values

        int [] [] pairs = {{434079,85929},{892341,431886},
                {309127,788998},
        {685871,633540},
    {525016,224210},
        {551287,671665},
        {758336,464667},
        {726312,801100},
        {426884,643190},
        {824657,323531},
        {886540,648740},
        {472278,602270},
        {460923,482520}
        };

        // Calculate and print the sum for each pair
        for (int[] pair : pairs) {
            int sum = calculateSum(pair);
            System.out.println(sum);
        }
    }

    // Method to calculate the sum of a pair
    private static int calculateSum(int[] pair) {
        int sum = 0;
        for (int value : pair) {
            sum += value;
        }
        return sum;
    }
}
