import java.util.*;

public class CoolNumbers {

    public static final String LETTERS = "АВЕКМНОРСТУХ";

    public static List<String> generateCoolNumbers() {

        List<String> coolNumbers = new ArrayList<>();

        String[] carLetters = {"А","В","Е","К","М","Н","О","Р","С","Т","У","Х"};

        for (String firstCarLetter : carLetters) {

            for (int n = 0; n < 10; n++) {
                String c = Integer.toString(n);
                String numbers = (c + c + c);

                for (String secondCarLetter : carLetters) {

                    for (String thirdCarLetter : carLetters) {

                        for (int r = 0; r < generateRegionCodes().size(); r++) {
                            coolNumbers.add(firstCarLetter + numbers + secondCarLetter + thirdCarLetter + generateRegionCodes().get(r));
                        }
                    }
                }
            }
        }

        return coolNumbers;
    }

    public static List<String> generateRegionCodes() {

        List<String> regionCodes = new ArrayList<>();

        for (int i = 1; i < 10; i++) {
            String c = Integer.toString(i);
            String code = ("0" + c);
            regionCodes.add(code);
        }

        for (int i = 10; i < 200; i++) {
            String c = Integer.toString(i);
            regionCodes.add(c);
        }

        return regionCodes;
    }

    public static boolean bruteForceSearchInList(List<String> list, String number) {

        int index = -1;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(number)) {
                index = i;
                break;
            }
        }

        return index >= 0;
    }

    public static boolean binarySearchInList(List<String> sortedList, String number) {
        return Collections.binarySearch(sortedList, number) >= 0;
    }

    public static boolean searchInHashSet(HashSet<String> hashSet, String number) {
        return hashSet.contains(number);
    }

    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {
        return treeSet.contains(number);
    }

}
