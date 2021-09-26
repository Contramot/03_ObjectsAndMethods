public class Printer {

    private static String queue = "";
    private static int pendingPagesCount = 0;
    private static int totalPrintedPages = 0;

    public void append(String text) {
        append(text, "", 0);
    }

    public void append(String text, String name) {
        append(text, name, 0);
    }

    public void append(String text, String name, int pages) {
        queue = queue + "\n" + text + " - " +
                name + " - " +
                pages + " стр.";
        pendingPagesCount += pages;
    }

    public static void clear() {
        queue = "";
        pendingPagesCount = 0;
    }

    public int getPendingPagesCount() {
        return pendingPagesCount;
    }

    public void print() {
        System.out.println("\nОчередь печати:");
        System.out.println("\nНе распечатано страниц " + getPendingPagesCount());
        if (queue.isEmpty()) {
            System.out.println("Очередь печати пуста");
        } else {
            System.out.println(queue);
            totalPrintedPages += getPendingPagesCount();
            clear();
        }

        System.out.println("\nРаспечатано страниц за всё время " + getTotalPrintedPages());
    }

    public int getTotalPrintedPages() {
        return totalPrintedPages;
    }

}
