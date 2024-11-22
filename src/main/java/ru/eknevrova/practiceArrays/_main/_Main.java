import ru.eknevrova.practiceArrays.service.PracticeArrays;

public class _Main {
    public static void main(String[] args) {
        PracticeArrays practiceArrays = new PracticeArrays();
        int[] intArray = practiceArrays.createArray();
        practiceArrays.printArray(intArray);
        practiceArrays.countEvenNumbers(intArray);
        practiceArrays.countOddNumbers(intArray);
        practiceArrays.countPrimeNumbers(intArray);
        practiceArrays.summaryNumbers(intArray);
        practiceArrays.getDifferenceNumbers(intArray);
        practiceArrays.countZero(intArray);
    }
}
