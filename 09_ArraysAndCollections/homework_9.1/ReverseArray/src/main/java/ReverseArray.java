public class ReverseArray {

    //TODO: Напишите код, который меняет порядок расположения элементов внутри массива на обратный.
    public static String[] reverse (String[] strings){

        int n = strings.length;
        String temp;

        for (int i = 0; i < n / 2; i++) {
            temp = strings[n - i - 1];
            strings[n - i - 1] = strings[i];
            strings[i] = temp;
        }

        return strings;
    }
}
