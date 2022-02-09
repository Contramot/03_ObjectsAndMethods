import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;


public class EmailList {

    TreeSet<String> emailList = new TreeSet<>();

    public void add(String email) {
        if (checkingTheEmailAddress(email)) {
            emailList.add(email.toLowerCase());
        } else {
            System.out.println(Main.WRONG_EMAIL_ANSWER);
        }
    }

    public List<String> getSortedEmails() {
        return new ArrayList<>(emailList);
    }


    public static boolean checkingTheEmailAddress(String email) {
        String emailFormat = "^[a-zA-Z0-9]{1,}"+"((\\.|\\_|-{0,1})[a-zA-Z0-9]{1,})*"+"@"+"[a-zA-Z0-9]{1,}"+"((\\.|\\_|-{0,1})[a-zA-Z0-9]{1,})*"+"\\.[a-zA-Z]{2,}$";
        return email.matches(emailFormat);
    }
}
