import ru.eknevrova.practiceArrays.entity.PracticeArrays;

public class _Main {
    public static void main(String[] args) {
        PracticeArrays practiceArrays = new PracticeArrays();
        int[] intArray = new int[] {5, -3, 2, 1, 7, 11, 12, -4, 1, 10};
        //int[] intArray = practiceArrays.createArray();
        practiceArrays.printArray(intArray);
        practiceArrays.countEvenNumbers(intArray);
        practiceArrays.countOddNumbers(intArray);
        practiceArrays.countPrimeNumbers(intArray);
        practiceArrays.summaryNumbers(intArray);
        practiceArrays.getDifferenceNumbers(intArray);
        practiceArrays.countZero(intArray);
    }
}
