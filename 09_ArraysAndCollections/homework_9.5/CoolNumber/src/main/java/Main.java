import java.util.*;

public class Main {
    /*

     - реализовать методы класса CoolNumbers
     - посчитать время поиска введимого номера в консоль в каждой из структуры данных
     - проанализоровать полученные данные
     */

    public static void main(String[] args) {

        System.out.println("Введите номер для поиска:");

        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();

        List<String> coolNumbers = CoolNumbers.generateCoolNumbers();
        Collections.sort(coolNumbers);


        long bruteForceSearchStart = System.nanoTime();

        boolean bruteForceSearchResult = CoolNumbers.bruteForceSearchInList(coolNumbers, number);

        long bruteForceSearchEnd = System.nanoTime();

        long bruteForceSearchTime = bruteForceSearchEnd - bruteForceSearchStart;

        System.out.println("Поиск перебором: " +
                (bruteForceSearchResult ? "номер найден" : "номер не найден") +
                ", поиск занял " + bruteForceSearchTime + " нс");


        long binarySearchStart = System.nanoTime();

        boolean binarySearchResult = CoolNumbers.binarySearchInList(coolNumbers, number);

        long binarySearchEnd = System.nanoTime();

        long binarySearchTime = binarySearchEnd - binarySearchStart;

        System.out.println("Бинарный поиск: " +
                (binarySearchResult ? "номер найден" : "номер не найден") +
                ", поиск занял " + binarySearchTime + " нс");


        HashSet<String> coolNumbersHashSet = new HashSet<>(coolNumbers);

        long hashSetSearchStart = System.nanoTime();

        boolean hashSetSearchResult = CoolNumbers.searchInHashSet(coolNumbersHashSet, number);

        long hashSetSearchEnd = System.nanoTime();

        long hashSetSearchTime = hashSetSearchEnd - hashSetSearchStart;

        System.out.println("Поиск в HashSet: " +
                (hashSetSearchResult ? "номер найден" : "номер не найден") +
                ", поиск занял " + hashSetSearchTime + " нс");


        TreeSet<String> coolNumbersTreeSet = new TreeSet<>(coolNumbers);

        long treeSetSearchStart = System.nanoTime();

        boolean treeSetSearchResult = CoolNumbers.searchInTreeSet(coolNumbersTreeSet, number);

        long treeSetSearchEnd = System.nanoTime();

        long treeSetSearchTime = treeSetSearchEnd - treeSetSearchStart;

        System.out.println("Поиск в TreeSet: " +
                (treeSetSearchResult ? "Номер найден" : "Номер не найден") +
                ", поиск занял " + treeSetSearchTime + " нс");


        List<Long> searchTime = Arrays.asList(bruteForceSearchTime, binarySearchTime, hashSetSearchTime, treeSetSearchTime);

        List<String> searchMethod = Arrays.asList("Поиск перебором","Бинарный поиск","Поиск в HashSet","Поиск в TreeSet");

        String minSearchMethod = searchMethod.get(0);
        String maxSearchMethod = searchMethod.get(0);

        long minSearchTime = searchTime.get(0);
        long maxSearchTime = searchTime.get(0);

        for (int i = 0; i < searchTime.size(); i++) {
            if (searchTime.get(i) < minSearchTime) {
                minSearchTime = searchTime.get(i);
                minSearchMethod = searchMethod.get(i);
            }
            if (searchTime.get(i) > maxSearchTime) {
                maxSearchTime = searchTime.get(i);
                maxSearchMethod = searchMethod.get(i);
            }
        }

        System.out.println("\nВ данной итерации:");
        System.out.println("\tсамый быстрый поиск - " + minSearchMethod + ": " + minSearchTime + " нс.");
        System.out.println("\tсамый медленный поиск - " + maxSearchMethod + ": " + maxSearchTime + " нс.");

    }
}
